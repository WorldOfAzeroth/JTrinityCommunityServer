package com.github.jtrinity.hotfixes.db2;


import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ReflectionUtils;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.IntStream;

@Slf4j
public class Db2FileReader<T> {

    private final FileChannel fileChannel;
    private final ClassMeta classMeta = new ClassMeta();
    private final DB2Header header = new DB2Header();
    private DB2SectionHeader[] sectionHeaders;
    private DB2Field[] db2Fields;
    private DB2ColumnMeta[] columnMeta;
    private int[][] palletValues;
    private DB2CommonValue[][] commonData;


    private Db2FileReader(FileChannel fileChannel) {
        this.fileChannel = fileChannel;

    }

    public static <T> void read(String file, Class<T> clazz, Consumer<T> consumer) {
        Path db2FilePath = Paths.get(file);

        try (FileChannel fileChannel = FileChannel.open(db2FilePath, StandardOpenOption.READ)) {
            Db2FileReader<T> instance = new Db2FileReader<>(fileChannel);
            instance.loadClassMeta(clazz);
            instance.readHeader(db2FilePath);

        } catch (IOException e) {
            log.error("Read the db2 file {} occurred IO error.", db2FilePath.getFileName(), e);
            throw new RuntimeException("Read ", e);
        }

    }

    private void loadClassMeta(Class<T> clazz) {
        Db2File annotation = clazz.getAnnotation(Db2File.class);
        if (annotation == null) {
            throw new DB2FileException("@Db2FileMate is not present on class.");
        }
        ReflectionUtils.doWithFields(clazz, field -> {
            Db2Field fieldMeta = field.getAnnotation(Db2Field.class);
            Db2Field db2Field = classMeta.fieldMetas.get(fieldMeta.fieldIndex());
            if (db2Field == null) {
                throw new DB2FileException("fieldIndex  " + fieldMeta.fieldIndex() + " hash clash in class " + clazz.getName());
            }
            classMeta.fieldMetas.put(fieldMeta.fieldIndex(), fieldMeta);
        }, field -> field.isAnnotationPresent(Db2Field.class));

        if (annotation.indexField() > -1 && !classMeta.fieldMetas.containsKey(annotation.indexField())) {
            throw new DB2FileException("indexField  " + annotation.indexField() + " didn't define in class " + clazz.getName());
        }
        classMeta.idMeta = classMeta.fieldMetas.get(annotation.indexField());

        if (annotation.parentIndexField() > -1 && !classMeta.fieldMetas.containsKey(annotation.parentIndexField())) {
            throw new DB2FileException("parentIndexField  " + annotation.parentIndexField() + " didn't define in class " + clazz.getName());
        }
        classMeta.parentIdMeta = classMeta.fieldMetas.get(annotation.parentIndexField());
    }


    private void readHeader(Path db2FilePath) throws IOException {
        ByteBuffer buffer = ByteBuffer.allocate(18 * 4 + 2 * 2 + 128);
        buffer.order(ByteOrder.LITTLE_ENDIAN);
        fileChannel.read(buffer);
        header.signature = buffer.getInt();
        header.version = buffer.getInt();
        IntStream.range(0, header.schema.length).forEach(i -> header.schema[i] = (char) buffer.get());

        header.recordCount = buffer.getInt();
        header.fieldCount = buffer.getInt();
        header.recordSize = buffer.getInt();
        header.stringTableSize = buffer.getInt();
        header.tableHash = buffer.getInt();
        header.layoutHash = buffer.getInt();
        header.minId = buffer.getInt();
        header.maxId = buffer.getInt();
        header.locale = buffer.getInt();
        header.flags = buffer.getShort();
        header.indexField = buffer.getShort();
        header.totalFieldCount = buffer.getInt();
        header.packedDataOffset = buffer.getInt();
        header.parentLookupCount = buffer.getInt();
        header.columnMetaSize = buffer.getInt();
        header.commonDataSize = buffer.getInt();
        header.palletDataSize = buffer.getInt();
        header.sectionCount = buffer.getInt();

        //'WDC5'
        if (header.signature != 0x35434457) {
            throw new DB2FileException("Incorrect file signature in %s, expected 'WDC5', got %c%c%c%c".formatted(
                    db2FilePath.getFileName(), (char) (header.signature & 0xFF), (char) ((header.signature >> 8) & 0xFF), (char) ((header.signature >> 16) & 0xFF), (char) ((header.signature >> 24) & 0xFF)
            ));
        }

        if (header.version != 5)
            throw new DB2FileException("Incorrect version in %s, expected 5, got %d (possibly wrong client version)".formatted(db2FilePath.getFileName(), header.version));

        if (header.layoutHash != classMeta.meta.layoutHash())
            throw new DB2FileException("Incorrect layout hash in %s, expected 0x%08X, got 0x%08X (possibly wrong client version)".formatted(db2FilePath.getFileName(), classMeta.meta.layoutHash(), header.layoutHash));

        if (header.parentLookupCount > 1)
            throw new DB2FileException("Too many parent lookups in %s, only one is allowed, got %d".formatted(db2FilePath.getFileName(), header.parentLookupCount));


        if ((header.parentLookupCount > 0 && classMeta.meta.parentIndexField() == -1))
            throw new DB2FileException("Unexpected parent lookup found in %s".formatted(db2FilePath.getFileName()));


        ByteBuffer sectionBuffer = ByteBuffer.allocate(header.sectionCount * (8 + (8 * 4)));
        buffer.order(ByteOrder.LITTLE_ENDIAN);
        fileChannel.read(buffer);
        sectionHeaders = new DB2SectionHeader[header.sectionCount];
        IntStream.range(0, sectionHeaders.length).forEach(i -> {
            sectionHeaders[i] = new DB2SectionHeader();
            sectionHeaders[i].tactId = sectionBuffer.getLong();
            sectionHeaders[i].fileOffset = sectionBuffer.getInt();
            sectionHeaders[i].recordCount = sectionBuffer.getInt();
            sectionHeaders[i].stringTableSize = sectionBuffer.getInt();
            sectionHeaders[i].catalogDataOffset = sectionBuffer.getInt();
            sectionHeaders[i].idTableSize = sectionBuffer.getInt();
            sectionHeaders[i].parentLookupDataSize = sectionBuffer.getInt();
            sectionHeaders[i].catalogDataCount = sectionBuffer.getInt();
            sectionHeaders[i].copyTableCount = sectionBuffer.getInt();
        });


        ByteBuffer fieldBuffer = ByteBuffer.allocate(header.fieldCount * 4);
        fieldBuffer.order(ByteOrder.LITTLE_ENDIAN);
        fileChannel.read(fieldBuffer);
        db2Fields = new DB2Field[header.fieldCount];
        IntStream.range(0, db2Fields.length).forEach(i -> {
            db2Fields[i] = new DB2Field();
            db2Fields[i].bitShift = fieldBuffer.getShort();
            db2Fields[i].offset = fieldBuffer.getShort();
        });

        if (header.columnMetaSize > 0) {
            columnMeta = new DB2ColumnMeta[header.totalFieldCount];
            ByteBuffer columnMetaBuffer = ByteBuffer.allocate(header.columnMetaSize);
            columnMetaBuffer.order(ByteOrder.LITTLE_ENDIAN);
            fileChannel.read(columnMetaBuffer);
            IntStream.range(0, columnMeta.length).forEach(i -> {
                columnMeta[i] = new DB2ColumnMeta();
                columnMeta[i].fieldOffsetBits = columnMetaBuffer.getShort();
                columnMeta[i].fieldSizeBits = columnMetaBuffer.getShort();
                columnMeta[i].additionalDataSize = columnMetaBuffer.getInt();
                columnMeta[i].compressionType = DB2ColumnCompression.get(columnMetaBuffer.getInt());
                columnMeta[i].offsetBits = columnMetaBuffer.getInt();
                columnMeta[i].bitWidth = columnMetaBuffer.getInt();
                columnMeta[i].arrayCount = columnMetaBuffer.getInt();
            });


            palletValues = new int[header.totalFieldCount][];
            for (int i = 0; i < palletValues.length; ++i) {
                if (columnMeta[i].compressionType != DB2ColumnCompression.Pallet
                        || columnMeta[i].compressionType != DB2ColumnCompression.PalletArray)
                    continue;
                palletValues[i] = new int[columnMeta[i].additionalDataSize / 4];
                ByteBuffer palletValuesBuffer = ByteBuffer.allocate(columnMeta[i].additionalDataSize);
                palletValuesBuffer.order(ByteOrder.LITTLE_ENDIAN);
                fileChannel.read(palletValuesBuffer);

                for (int j = 0; j < palletValues[i].length; j++) {
                    palletValues[i][j] = palletValuesBuffer.getInt();
                }
            }

            commonData = new DB2CommonValue[header.totalFieldCount][];

            for (int i = 0; i < header.totalFieldCount; ++i)
            {
                if (columnMeta[i].compressionType != DB2ColumnCompression.CommonData)
                    continue;

                if (columnMeta[i].additionalDataSize < 1)
                    continue;

                commonData[i] = new DB2CommonValue[columnMeta[i].additionalDataSize / 8];
                ByteBuffer commonDataBuffer = ByteBuffer.allocate(columnMeta[i].additionalDataSize);
                commonDataBuffer.order(ByteOrder.LITTLE_ENDIAN);

                fileChannel.read(commonDataBuffer);

                for (int j = 0; j < palletValues[i].length; j++) {
                    commonData[i][j].recordId = commonDataBuffer.getInt();
                    commonData[i][j].value = commonDataBuffer.getInt();
                }
            }

        }

    }


    private static class ClassMeta {

        Db2File meta;

        Db2Field idMeta;

        Db2Field parentIdMeta;

        private final Map<Integer, Db2Field> fieldMetas = new HashMap<>();

    }


    private static class DB2Header {
        int signature;
        int version;
        char[] schema = new char[128];
        int recordCount;
        int fieldCount;
        int recordSize;
        int stringTableSize;
        int tableHash;
        int layoutHash;
        int minId;
        int maxId;
        int locale;
        short flags;
        short indexField;
        int totalFieldCount;
        int packedDataOffset;
        int parentLookupCount;
        int columnMetaSize;
        int commonDataSize;
        int palletDataSize;
        int sectionCount;
    }

    private static class DB2SectionHeader {
        long tactId;
        int fileOffset;
        int recordCount;
        int stringTableSize;
        int catalogDataOffset;
        int idTableSize;
        int parentLookupDataSize;
        int catalogDataCount;
        int copyTableCount;
    }

    private static class DB2Field {
        short bitShift;
        short offset;
    }

    private static class DB2ColumnMeta {
        short fieldOffsetBits;
        short fieldSizeBits;
        int additionalDataSize;
        DB2ColumnCompression compressionType;
        int offsetBits;
        int bitWidth;
        int arrayCount;
    }

    private enum DB2ColumnCompression {
        None,
        Immediate,
        CommonData,
        Pallet,
        PalletArray,
        SignedImmediate;

        public static DB2ColumnCompression get(int anInt) {
            return switch (anInt) {
                case 0 -> None;
                case 1 -> Immediate;
                case 2 -> CommonData;
                case 3 -> Pallet;
                case 4 -> PalletArray;
                case 5 -> SignedImmediate;
                default -> throw new IllegalStateException("Unexpected value: " + anInt);
            };
        }
    }

    private static final class DB2CommonValue {
        int recordId;
        int value;
    }
}

