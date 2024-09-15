package com.github.jtrinity.dbc.db2;


import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.common.Locale;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Slf4j
public class Db2FileReader {

    private static final long DUMMY_KNOWN_TACT_ID = 0x5452494E49545900L; // TRINITY


    private final FileChannel fileChannel;

    private final Db2ClassMeta db2ClassMeta;

    private final DB2Header header = new DB2Header();
    private DB2SectionHeader[] sectionHeaders;
    private DB2Field[] db2Fields;
    private DB2ColumnMeta[] columnMeta;
    private int[][] palletValues;

    private DB2CommonValue[][] commonData;
    private List<Integer> idTable;
    private List<List<List<DB2IndexEntry>>> parentIndexes;

    private ByteBuffer recordData;
    private ByteBuffer stringTable;

    List<Integer> catalogIds;
    List<DB2CatalogEntry> catalog;
    List<DB2RecordCopy> copyTable;


    private int _totalRecordSize;
    private int _maxRecordSize;


    private Db2FileReader(FileChannel fileChannel, Db2ClassMeta db2ClassMeta) {
        this.fileChannel = fileChannel;
        this.db2ClassMeta = db2ClassMeta;
    }

    public static <T extends DbcEntity> Stream<T> entities(String dataFolder, Locale locale, Class<T> clazz) {

        final Db2ClassMeta db2ClassMeta = new Db2ClassMeta(clazz);
        Path db2FilePath = Paths.get(dataFolder, "dbc", locale.name(), db2ClassMeta.name());
        try (FileChannel fileChannel = FileChannel.open(db2FilePath, StandardOpenOption.READ)) {
            Db2FileReader instance = new Db2FileReader(fileChannel, db2ClassMeta);
            instance.read(db2FilePath);

        } catch (IOException e) {
            log.error("Read the db2 file {} occurred IO error.", db2FilePath.getFileName(), e);
            throw new RuntimeException("Read ", e);
        }


        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(
                new Iterator<T>() {
                    @Override
                    public boolean hasNext() {
                        return false;
                    }

                    @Override
                    public T next() {
                        return null;
                    }
                }, Spliterator.ORDERED | Spliterator.NONNULL), false);

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

        if (header.layoutHash != db2ClassMeta.layoutHash())
            throw new DB2FileException("Incorrect layout hash in %s, expected 0x%08X, got 0x%08X (possibly wrong client version)".formatted(db2FilePath.getFileName(), db2ClassMeta.layoutHash(), header.layoutHash));

        if (header.parentLookupCount > 1)
            throw new DB2FileException("Too many parent lookups in %s, only one is allowed, got %d".formatted(db2FilePath.getFileName(), header.parentLookupCount));


        if ((header.parentLookupCount > 0 && db2ClassMeta.parentIndexField() == -1))
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

            for (int i = 0; i < header.totalFieldCount; ++i) {
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


    void read(Path db2FilePath) throws IOException {

        readHeader(db2FilePath);

        idTable = new ArrayList<>();
        copyTable = new ArrayList<>();
        parentIndexes = new ArrayList<>();


        for (int i = 0; i < header.sectionCount; ++i) {
            DB2SectionHeader section = sectionHeaders[i];

            if (section.tactId > 0) {
                ByteBuffer buffer = ByteBuffer.allocate(4);
                buffer.order(ByteOrder.LITTLE_ENDIAN);
                fileChannel.read(buffer);
                int encryptedIdCount = buffer.getInt();
                if (encryptedIdCount == 0) {
                    throw new DB2FileException("Unable to read number of encrypted records in %s for section %d".formatted(db2FilePath.getFileName(), i));
                }
                // it doesnt matter what the encrypted ids are, we have no use for them
                fileChannel.position(fileChannel.position() + (4L * encryptedIdCount));
            }
        }

        if ((header.flags & 0x1) == 0) {
            int totalCopyTableSize = 0;
            int totalParentLookupDataSize = 0;
            for (int i = 0; i < header.sectionCount; ++i) {
                DB2SectionHeader section = sectionHeaders[i];
                totalCopyTableSize += section.copyTableCount * 8;
                totalParentLookupDataSize += section.parentLookupDataSize;
            }

            long expectedFileSize =
                    fileChannel.position() +
                            (long) header.recordSize * header.recordCount +
                            header.stringTableSize +
                            (db2ClassMeta.indexField() == -1 ? 4L * header.recordCount : 0) +
                            totalCopyTableSize +
                            totalParentLookupDataSize;

            if (fileChannel.size() != expectedFileSize)
                throw new DB2FileException("%s failed size consistency check, expected %s, got %s".formatted(db2FilePath.getFileName(), expectedFileSize, fileChannel.size()));
        }

        for (int i = 0; i < header.sectionCount; ++i) {
            DB2SectionHeader section = sectionHeaders[i];

            if (!isKnownTactId(section.tactId)) {
                continue;
            }

            fileChannel.position(section.fileOffset);


            loadTableData(i);


            loadCatalogData(i);

            if (db2ClassMeta.indexField() != -1) {
                if (section.idTableSize != 0)
                    throw new DB2FileException("Unexpected id table found in %s for section %d".formatted(db2FilePath.getFileName(), i));
            } else if (section.idTableSize != 4 * section.recordCount)
                throw new DB2FileException("Unexpected id table size in %s for section %d, expected %d, got %d".formatted(db2FilePath.getFileName(), i, 4 * section.recordCount, section.idTableSize));

            if (section.idTableSize > 0) {
                int idTableSize = idTable.size();
                ByteBuffer buffer = ByteBuffer.allocate(section.idTableSize);
                fileChannel.read(buffer);
                for (int j = 0; j < section.idTableSize / 4; j++) {
                    idTable.add(buffer.getInt());
                }

                // This is a hack fix for broken db2 files that have invalid id tables
                for (int j = idTableSize; j < idTable.size(); ++j)
                    if (idTable.get(j) <= header.minId)
                        idTable.set(j, header.minId + j);
            }

            if ((header.flags & 0x1) == 0 && section.copyTableCount > 0) {
                ByteBuffer buffer = ByteBuffer.allocate(section.copyTableCount * 8);
                fileChannel.read(buffer);
                for (int j = 0; j < section.copyTableCount; j++) {
                    DB2RecordCopy recordCopy = new DB2RecordCopy();
                    recordCopy.newRowId = buffer.getInt();
                    recordCopy.sourceRowId = buffer.getInt();
                    copyTable.add(recordCopy);
                }
            }

            if (header.parentLookupCount > 0) {

                List<List<DB2IndexEntry>> parentIndexesForSection = new ArrayList<>();

                for (int j = 0; j < header.parentLookupCount; ++j) {

                    ByteBuffer buffer = ByteBuffer.allocate(12);
                    fileChannel.read(buffer);
                    DB2IndexDataInfo indexInfo = new DB2IndexDataInfo();
                    indexInfo.numEntries = buffer.getInt();
                    indexInfo.minId = buffer.getInt();
                    indexInfo.maxId = buffer.getInt();

                    if (indexInfo.numEntries == 0)
                        continue;

                    List<DB2IndexEntry> entries = new ArrayList<>(indexInfo.numEntries);
                    buffer = ByteBuffer.allocate(indexInfo.numEntries * 8);
                    fileChannel.read(buffer);
                    for (int k = 0; k < indexInfo.numEntries; k++) {
                        DB2IndexEntry indexEntry = new DB2IndexEntry();
                        indexEntry.parentId = buffer.getInt();
                        indexEntry.recordIndex = buffer.getInt();
                        entries.add(indexEntry);
                    }
                    parentIndexesForSection.add(entries);
                }

                parentIndexes.add(parentIndexesForSection);
            }
        }


        int fieldIndex = 0;
        StringBuilder signValidationResult = new StringBuilder();
        if (!db2ClassMeta.hasIndexField()) {
            if (db2ClassMeta.fieldAt(0).signed())
                signValidationResult.append("ID must be unsigned in %s".formatted(db2FilePath.getFileName()));

            ++fieldIndex;
        }
        for (int f = 0; f < db2ClassMeta.fieldCount(); ++f) {

            if (db2ClassMeta.fieldAt(fieldIndex).signed() != isSignedField(f))
                signValidationResult.append("Field %s in %s must be %s %s".formatted(db2ClassMeta.fieldNameAt(fieldIndex), db2FilePath.getFileName(), isSignedField(f) ? "signed" : "unsigned", getExpectedSignMismatchReason(f)));


            fieldIndex += 1;
        }
        if (!signValidationResult.isEmpty())
            throw new DB2FileException(signValidationResult.toString());
    }


    void loadTableData(int section) throws IOException {
        if (recordData == null) {
            recordData = ByteBuffer.allocate(header.recordSize * header.recordCount + header.stringTableSize + 8);
            stringTable = recordData.slice(header.recordSize * header.recordCount, recordData.limit());
        }

        ByteBuffer buffer = ByteBuffer.allocate(header.recordSize * sectionHeaders[section].recordCount);
        fileChannel.read(buffer);
        recordData.put(buffer);

        buffer = ByteBuffer.allocate(sectionHeaders[section].stringTableSize);
        fileChannel.read(buffer);
        stringTable.put(buffer);
    }

    void loadCatalogData(int section) throws IOException {
        fileChannel.position(sectionHeaders[section].catalogDataOffset);

        int oldSize = catalog.size();

        ByteBuffer buffer = ByteBuffer.allocate(4 * sectionHeaders[section].catalogDataCount);
        fileChannel.read(buffer);

        for (int i = 0; i < sectionHeaders[section].catalogDataCount; i++) {
            catalogIds.add(buffer.getInt());
        }

        if (sectionHeaders[section].copyTableCount > 0) {
            buffer = ByteBuffer.allocate(8 * sectionHeaders[section].copyTableCount);
            fileChannel.read(buffer);
            for (int i = 0; i < sectionHeaders[section].copyTableCount; i++) {
                DB2RecordCopy db2RecordCopy = new DB2RecordCopy();
                db2RecordCopy.newRowId = buffer.getInt();
                db2RecordCopy.sourceRowId = buffer.getInt();
                copyTable.add(db2RecordCopy);
            }
        }

        buffer = ByteBuffer.allocate(6 * sectionHeaders[section].catalogDataCount);
        fileChannel.read(buffer);
        for (int i = 0; i < sectionHeaders[section].copyTableCount; i++) {
            DB2CatalogEntry catalogEntry = new DB2CatalogEntry();
            catalogEntry.fileOffset = buffer.getInt();
            catalogEntry.recordSize = buffer.getShort();
            catalog.add(catalogEntry);
        }


        for (int i = 0; i < sectionHeaders[section].catalogDataCount; ++i) {
            _totalRecordSize += catalog.get(oldSize + i).recordSize;
            _maxRecordSize = Math.max(_maxRecordSize, catalog.get(oldSize + i).recordSize);
        }
    }


    static boolean isKnownTactId(long tactId) {
        return tactId == 0 || tactId == DUMMY_KNOWN_TACT_ID;
    }

    boolean isSignedField(int field) {

        if (field >= header.totalFieldCount) {
            assert field == header.totalFieldCount;
            assert field == db2ClassMeta.parentIndexField();
            return db2ClassMeta.fieldAt(field).signed();
        }

        DB2ColumnCompression compressionType = columnMeta != null ? columnMeta[field].compressionType : DB2ColumnCompression.None;
        return switch (compressionType) {
            case None, CommonData, Pallet, PalletArray -> db2ClassMeta.fieldAt(field).signed();
            case SignedImmediate -> field != db2ClassMeta.indexField();
            case Immediate -> false;
        };

    }


    String getExpectedSignMismatchReason(int field) {
        if (field >= header.totalFieldCount) {
            assert field == header.totalFieldCount;
            assert field == db2ClassMeta.parentIndexField();
            return " (ParentIndexField must always be unsigned)";
        }
        DB2ColumnCompression compressionType = columnMeta != null ? columnMeta[field].compressionType : DB2ColumnCompression.None;
        return switch (compressionType) {
            case None, CommonData, Pallet, PalletArray ->
                    field == db2ClassMeta.indexField() ? " (IndexField must always be unsigned)"
                            : (field == db2ClassMeta.parentIndexField() ? " (ParentIndexField must always be unsigned)" : "");
            case SignedImmediate -> " (CompressionType is SignedImmediate)";
            case Immediate -> " (CompressionType is Immediate)";
        };


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

    private static final class DB2RecordCopy {
        int newRowId;
        int sourceRowId;
    }

    private static final class DB2CatalogEntry {
        int fileOffset;
        short recordSize;
    }

    ;

    private static final class DB2IndexDataInfo {
        int numEntries;
        int minId;
        int maxId;
    }

    ;

    private static final class DB2IndexEntry {
        int parentId;
        int recordIndex;
    }

}

