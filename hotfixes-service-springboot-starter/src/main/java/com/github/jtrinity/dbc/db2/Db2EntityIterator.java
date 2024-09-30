package com.github.jtrinity.dbc.db2;

import com.github.jtrinity.cache.DbcEntity;
import com.github.jtrinity.common.Locale;
import com.github.jtrinity.utils.FuryUtil;


import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.IntStream;


class Db2EntityIterator<T extends DbcEntity> implements Iterator<T> {

    private final Db2DataBinder db2DataBinder;

    private final Locale locale;

    private final Db2EntityReader reader;

    private int index;
    private int position = 0;
    private RowData currentData;
    private final Map<Integer, T> copyEntity = new LinkedHashMap<>();
    private Iterator<Map.Entry<Integer, T>> copyEnityiterator;


    Db2EntityIterator(Locale locale, Db2DataBinder db2DataBinder, Db2EntityReader db2EntityReader) {
        this.locale = locale;
        this.db2DataBinder = db2DataBinder;
        this.reader = db2EntityReader;
    }


    @Override
    public boolean hasNext() {
        if (index < reader.header.recordCount) {
            Integer refId = reader.refData != null ? reader.refData.entries.get(index) : null;
            RowData rowData = new RowData(reader.data, reader.header.indexDataSize != 0 ? reader.indexData[index] : -1, refId, index);

            if (reader.header.flags.hasFlag(DB2Flags.Sparse)) {
                rowData.position(position);
                position += reader.sparseEntries.get(index).size() * 8;
            } else {
                rowData.offset(index * reader.header.recordSize);
            }
            this.currentData = rowData;
            index++;
            return true;
        } else if (copyEnityiterator != null) {
            return copyEnityiterator.hasNext();
        } else {
            copyEnityiterator = copyEntity.entrySet().iterator();
            return copyEnityiterator.hasNext();
        }
    }

    @Override
    public T next() {
        if (index <= reader.header.recordCount) {
            return toEntity(currentData);
        } else {
            Map.Entry<Integer, T> next = copyEnityiterator.next();
            T copied = FuryUtil.copy(next.getValue());
            copied.setId(next.getKey());
            return copied;
        }
    }


    private T toEntity(RowData rowData) {

        DbcEntity entity = db2DataBinder.newInstance();
        entity.setId(rowData.id != -1 ? rowData.id : null);


        IntStream.range(0, db2DataBinder.fieldCount()).forEach(i -> {

            Db2Field fieldMeta = db2DataBinder.fieldAt(i);

            if (db2DataBinder.isArray(i)) {
                Object[] value = switch (fieldMeta.type()) {
                    case INT -> getUInt32ValueArray(rowData, i, db2DataBinder.arraySize(i));
                    case SHORT -> getUInt16ValueArray(rowData, i, db2DataBinder.arraySize(i));
                    case BYTE -> getUInt8ValueArray(rowData, i, db2DataBinder.arraySize(i));
                    case LONG -> getUInt64ValueArray(rowData, i, db2DataBinder.arraySize(i));
                    case FLOAT -> getFloatValueArray(rowData, i, db2DataBinder.arraySize(i));
                    case STRING, STRING_NOT_LOCALIZED ->
                            throw new IllegalArgumentException("Unsupported type: " + fieldMeta.type());
                };
                for (String filedName : fieldMeta.name()) {
                    db2DataBinder.bind(filedName, value);
                }
            } else {
                String fieldName = fieldMeta.name()[0];
                switch (fieldMeta.type()) {
                    case STRING -> db2DataBinder.bindLocalizedString(fieldName, locale, getString(entity.getId(), rowData, i));
                    case STRING_NOT_LOCALIZED -> db2DataBinder.bind(fieldName, getString(entity.getId(), rowData, i));
                    case INT -> db2DataBinder.bind(fieldName, getUInt32(entity.getId(), rowData, i));
                    case SHORT -> db2DataBinder.bind(fieldName, getUInt16(entity.getId(), rowData, i));
                    case BYTE -> db2DataBinder.bind(fieldName, getUInt8(entity.getId(), rowData, i));
                    case LONG -> db2DataBinder.bind(fieldName, getUInt64(entity.getId(), rowData, i));
                    case FLOAT -> db2DataBinder.bind(fieldName, getFloat(entity.getId(), rowData, i));
                }
            }
        });



        @SuppressWarnings("unchecked")
        T result = (T) entity;
        Integer id = entity.getId();
        if (reader.copyData != null) {
            if (reader.copyData.containsValue(id)) {
                copyEntity.put(id, result);
            }
        }

        return result;
    }


    Short getUInt8(Integer id, RowData rowData, int fieldIndex) {
        BigInteger fieldVal = getFieldValue(id, rowData, reader.db2Fields[fieldIndex], reader.columnMeta[fieldIndex], reader.palletData[fieldIndex], reader.commonData[fieldIndex]);
        return fieldVal.shortValue();
    }

    Integer getUInt16(Integer id, RowData rowData, int fieldIndex) {
        BigInteger fieldVal = getFieldValue(id, rowData, reader.db2Fields[fieldIndex], reader.columnMeta[fieldIndex], reader.palletData[fieldIndex], reader.commonData[fieldIndex]);
        return fieldVal.intValue();
    }

    Integer getUInt32(Integer id, RowData rowData, int fieldIndex) {
        BigInteger fieldVal = getFieldValue(id, rowData, reader.db2Fields[fieldIndex], reader.columnMeta[fieldIndex], reader.palletData[fieldIndex], reader.commonData[fieldIndex]);
        return fieldVal.intValue();
    }

    Integer getInt32(Integer id, RowData rowData, int fieldIndex) {
        BigInteger fieldVal = getFieldValue(id, rowData, reader.db2Fields[fieldIndex], reader.columnMeta[fieldIndex], reader.palletData[fieldIndex], reader.commonData[fieldIndex]);
        return fieldVal.intValue();
    }

    Long getUInt64(Integer id, RowData rowData, int fieldIndex) {
        BigInteger fieldVal = getFieldValue(id, rowData, reader.db2Fields[fieldIndex], reader.columnMeta[fieldIndex], reader.palletData[fieldIndex], reader.commonData[fieldIndex]);
        long longValue = fieldVal.longValue();
        if (longValue < 0) {
            throw new ValueOverflowException(db2DataBinder.name() + " field index" + fieldIndex);
        }
        return longValue;
    }

    Float getFloat(Integer id, RowData rowData, int fieldIndex) {
        BigInteger fieldVal = getFieldValue(id, rowData, reader.db2Fields[fieldIndex], reader.columnMeta[fieldIndex], reader.palletData[fieldIndex], reader.commonData[fieldIndex]);
        return fieldVal.floatValue();
    }

    String getString(Integer id, RowData rowData, int fieldIndex) {
        if (reader.header.flags.hasFlag(DB2Flags.Sparse)) {
            return rowData.getCString();
        } else {
            int stringOffset = getInt32(id, rowData, fieldIndex);
            ByteArrayOutputStream data = new ByteArrayOutputStream();
            while (true) {
                byte b = reader.stringTable.get(stringOffset++);
                if (b == '\0') {
                    break;
                }
                data.write(b);
            }
            return data.toString(StandardCharsets.UTF_8);
        }
    }

    Integer getIdValue(RowData rowData) {
        if (db2DataBinder.hasIndexField())
            return getUInt32(0, rowData, db2DataBinder.indexField());
        return rowData.id;
    }


    Short[] getUInt8ValueArray(RowData rowData, int fieldIndex, int arraySize) {
        BigInteger[] fieldVals = getFieldValueArray(rowData, reader.db2Fields[fieldIndex], reader.columnMeta[fieldIndex], reader.palletData[fieldIndex], arraySize);
        return Arrays.stream(fieldVals).map(Number::shortValue).toArray(Short[]::new);
    }

    Short[] getUInt16ValueArray(RowData rowData, int fieldIndex, int arraySize) {
        BigInteger[] fieldVals = getFieldValueArray(rowData, reader.db2Fields[fieldIndex], reader.columnMeta[fieldIndex], reader.palletData[fieldIndex], arraySize);
        return Arrays.stream(fieldVals).map(Number::shortValue).toArray(Short[]::new);
    }

    Integer[] getUInt32ValueArray(RowData rowData, int fieldIndex, int arraySize) {
        BigInteger[] fieldVals = getFieldValueArray(rowData, reader.db2Fields[fieldIndex], reader.columnMeta[fieldIndex], reader.palletData[fieldIndex], arraySize);
        return Arrays.stream(fieldVals).map(Number::intValue).toArray(Integer[]::new);
    }

    Integer[] getInt32ValueArray(RowData rowData, int fieldIndex, int arraySize) {
        BigInteger[] fieldVals = getFieldValueArray(rowData, reader.db2Fields[fieldIndex], reader.columnMeta[fieldIndex], reader.palletData[fieldIndex], arraySize);
        return Arrays.stream(fieldVals).map(Number::intValue).toArray(Integer[]::new);
    }

    Long[] getUInt64ValueArray(RowData rowData, int fieldIndex, int arraySize) {
        BigInteger[] fieldVals = getFieldValueArray(rowData, reader.db2Fields[fieldIndex], reader.columnMeta[fieldIndex], reader.palletData[fieldIndex], arraySize);
        return Arrays.stream(fieldVals).map(Number::longValue).toArray(Long[]::new);
    }

    Float[] getFloatValueArray(RowData rowData, int fieldIndex, int arraySize) {
        BigInteger[] fieldVals = getFieldValueArray(rowData, reader.db2Fields[fieldIndex], reader.columnMeta[fieldIndex], reader.palletData[fieldIndex], arraySize);
        return Arrays.stream(fieldVals).map(Number::floatValue).toArray(Float[]::new);
    }

    private static BigInteger getFieldValue(Integer id, RowData r, FieldMetaData fieldMeta, ColumnMetaData columnMeta, Value32[] palletData, Map<Integer, Value32> commonData) {
        switch (columnMeta.compressionType) {
            case CompressionType.None -> {
                int bitSize = 32 - fieldMeta.bits();
                if (bitSize <= 0)
                    bitSize = columnMeta.immediate.bitWidth();

                return new BigInteger(1, r.getValue64(bitSize).value);
            }
            case CompressionType.Immediate -> {
                if ((columnMeta.immediate.flags() & 0x1) == 0x1)
                    return new BigInteger(r.getValue64Signed(columnMeta.immediate.bitWidth()).value);
                return new BigInteger(r.getValue64(columnMeta.immediate.bitWidth()).value);
            }
            case CompressionType.Common -> {
                Value32 val = commonData.get(id);
                if (val != null)
                    return new BigInteger(val.value);
                return new BigInteger(columnMeta.common.defaultValue().value);
            }
            case CompressionType.Pallet -> {
                long index = r.getUInt32(columnMeta.pallet.bitWidth());
                return new BigInteger(palletData[(int) index].value);
            }
            case CompressionType.PalletArray -> {
                if (columnMeta.pallet.cardinality() != 1)
                    break;
                long palletArrayIndex = r.getUInt32(columnMeta.pallet.bitWidth());
                return new BigInteger(palletData[(int) palletArrayIndex].value);
            }
        }
        throw new IllegalStateException("Unexpected compression type " + columnMeta.compressionType);
    }


    private static BigInteger[] getFieldValueArray(RowData r, FieldMetaData fieldMeta, ColumnMetaData columnMeta, Value32[] palletData, int arraySize) {
        BigInteger[] array;
        switch (columnMeta.compressionType) {
            case CompressionType.None: {
                int bitSize = 32 - fieldMeta.bits();
                if (bitSize <= 0)
                    bitSize = columnMeta.immediate.bitWidth();

                array = new BigInteger[arraySize];

                for (int i = 0; i < array.length; i++)
                    array[i] = new BigInteger(r.getValue64(bitSize).value);

                return array;
            }
            case CompressionType.PalletArray: {
                int cardinality = columnMeta.pallet.cardinality();
                long palletArrayIndex = r.getUInt32(columnMeta.pallet.bitWidth());

                array = new BigInteger[arraySize];
                for (int i = 0; i < array.length; i++)
                    array[i] = new BigInteger(palletData[i + cardinality * (int) palletArrayIndex].value);

                return array;

            }
        }
        throw new IllegalStateException("Unexpected compression type " + columnMeta.compressionType);
    }

}
