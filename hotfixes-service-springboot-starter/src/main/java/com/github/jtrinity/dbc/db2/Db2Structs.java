package com.github.jtrinity.dbc.db2;

import lombok.AllArgsConstructor;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


class Header {
    static final int HEADER_CAPACITY = 84;

    int signature;
    int recordCount;
    int fieldCount;
    int recordSize;
    int stringTableSize;
    int tableHash;
    int layoutHash;
    int minId;
    int maxId;
    int locale;
    int copyTableSize;
    DB2Flags flags;
    short indexField;
    int totalFieldCount;
    int packedDataOffset;
    int parentLookupCount;
    int catalogDataOffset;
    int indexDataSize;
    int columnMetaSize;
    int commonDataSize;
    int palletDataSize;
    int parentLookupDataSize;
}


record FieldMetaData(short bits, short offset) {
}

class ColumnMetaData {
    short recordOffset;
    short size;
    int additionalDataSize;
    CompressionType compressionType;
    Immediate immediate;
    Pallet pallet;
    Common common;
}


record Immediate(int bitOffset, int bitWidth, int flags) {
}

record Pallet(int bitOffset, int bitWidth, int cardinality) {
}

record Common(Value32 defaultValue, int B, int C) {
}


enum CompressionType {
    None,
    Immediate,
    Common,
    Pallet,
    PalletArray,
    SignedImmediate;

    public static CompressionType get(int anInt) {
        return switch (anInt) {
            case 0 -> None;
            case 1 -> Immediate;
            case 2 -> Common;
            case 3 -> Pallet;
            case 4 -> PalletArray;
            case 5 -> SignedImmediate;
            default -> throw new IllegalStateException("Unexpected value: " + anInt);
        };
    }
}


@AllArgsConstructor
class ReferenceData {
    final int numRecords;
    final int minId;
    final int maxId;
    final Map<Integer, Integer> entries = new HashMap<>();
}

record SparseEntry(int offset, int size) {
}

class Value32 {
    final byte[] value = new byte[4];
}

class Value64 {
    byte[] value = new byte[8];
}


enum DB2Flags {
    None(0),
    Sparse(0x1),
    SecondaryKey(0x2),
    Index(0x4),
    Unknown1(0x8), // modern client explicitly throws an exception
    BitPacked(0x10);

    final int value;

    DB2Flags(int value) {
        this.value = value;
    }

    static DB2Flags get(int value) {
        return Arrays.stream(values()).filter(e -> e.value == value).findFirst().orElseThrow();
    }

    boolean hasFlag(DB2Flags valueToCheck) {
        return (this.value & valueToCheck.value) == valueToCheck.value;
    }
}


class RowData {
    private final ByteBuffer buffer;
    final int id;
    final Integer refID;
    final int recordIndex;

    private int readPos;
    private int readOffset;


    RowData(ByteBuffer data, int id, Integer refID, int recordIndex) {
        this.buffer = data;
        this.id = id;
        this.refID = refID;
        this.recordIndex = recordIndex;
    }

    int position() {
        return readPos;
    }


    void position(int position) {
        this.readPos = position;
    }


    int offset() {
        return readOffset;
    }

    void offset(int offset) {
        this.readOffset = offset;
    }

    long getUInt32(int numBits) {
        long b = buffer.getInt(readOffset + (readPos >> 3)) & 0xffffffffL;
        long result = b << (32 - numBits - (readPos & 7)) >> (32 - numBits);
        readPos += numBits;
        return result;
    }

    long getUInt64(int numBits) {
        try {
            long b = buffer.getLong(readOffset + (readPos >> 3));
            long result = b << (64 - numBits - (readPos & 7)) >> (64 - numBits);
            readPos += numBits;
            return result;
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("index " + readOffset + (readPos >> 3) + " out of " + buffer);
        }

    }

    Value32 getValue32(int numBits) {
        long l = getUInt32(numBits);
        Value32 value32 = new Value32();
        value32.value[3] = (byte) (l & 0xff);
        value32.value[2] = (byte) (l >> 8 & 0xff);
        value32.value[1] = (byte) (l >> 16 & 0xff);
        value32.value[0] = (byte) (l >> 24 & 0xff);
        return value32;
    }

    Value64 getValue64(int numBits) {
        long l = getUInt64(numBits);
        return toValue64(l);
    }

    Value64 getValue64Signed(int numBits) {
        long result = getUInt64(numBits);
        long signedShift = 1L << (numBits - 1);
        result = (signedShift ^ result) - signedShift;
        return toValue64(result);
    }


    String getCString() {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        long num;
        while ((num = getUInt32(8)) != 0) {
            stream.write((byte) num);
        }
        return stream.toString(StandardCharsets.UTF_8);
    }


    private Value64 toValue64(long result) {
        Value64 value64 = new Value64();
        value64.value[7] = (byte) (result & 0xff);
        value64.value[6] = (byte) (result >> 8 & 0xff);
        value64.value[5] = (byte) (result >> 16 & 0xff);
        value64.value[4] = (byte) (result >> 24 & 0xff);
        value64.value[3] = (byte) (result >> 32 & 0xff);
        value64.value[2] = (byte) (result >> 40 & 0xff);
        value64.value[1] = (byte) (result >> 48 & 0xff);
        value64.value[0] = (byte) (result >> 56 & 0xff);
        return value64;
    }
}
