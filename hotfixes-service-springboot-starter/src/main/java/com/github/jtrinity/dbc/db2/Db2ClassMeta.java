package com.github.jtrinity.dbc.db2;


import com.github.jtrinity.common.Locale;
import org.springframework.util.ReflectionUtils;

import java.util.*;

class Db2ClassMeta {

    Db2File meta;

    Db2Field idMeta;

    Db2Field parentIdMeta;

    List<Db2Field> fieldMetas = new ArrayList<>();

    Map<Integer, String> nameMap = new HashMap<>();

    Db2ClassMeta(Class<?> clazz) {
        Map<Integer, Db2Field> fieldMap = new LinkedHashMap<>();
        Db2File annotation = clazz.getAnnotation(Db2File.class);
        if (annotation == null) {
            throw new DB2FileException("@Db2FileMate is not present on class.");
        }
        ReflectionUtils.doWithFields(clazz, field -> {
            Db2Field fieldMeta = field.getAnnotation(Db2Field.class);
            if (fieldMap.containsKey(fieldMeta.fieldIndex())) {
                throw new DB2FileException("fieldIndex  " + fieldMeta.fieldIndex() + " hash clash in class " + clazz.getName());
            }
            fieldMap.put(fieldMeta.fieldIndex(), fieldMeta);
            nameMap.put(fieldMeta.fieldIndex(), field.getName());
        }, field -> field.isAnnotationPresent(Db2Field.class));

        if (annotation.indexField() > -1 && !fieldMap.containsKey(annotation.indexField())) {
            throw new DB2FileException("indexField  " + annotation.indexField() + " didn't define in class " + clazz.getName());
        }
        idMeta = fieldMap.get(annotation.indexField());

        if (annotation.parentIndexField() > -1 && !fieldMap.containsKey(annotation.parentIndexField())) {
            throw new DB2FileException("parentIndexField  " + annotation.parentIndexField() + " didn't define in class " + clazz.getName());
        }
        parentIdMeta = fieldMap.get(annotation.parentIndexField());
        fieldMap.values().stream().sorted(Comparator.comparingInt(Db2Field::fieldIndex)).forEach(fieldMetas::add);
    }


    String name() {
        return meta.name();
    }

    int layoutHash() {
        return meta.layoutHash();
    }

    int indexField() {
        return meta.indexField();
    }

    int parentIndexField() {
        return meta.parentIndexField();
    }

    Db2Field fieldAt(final int index) {
        return fieldMetas.get(index);
    }

    String fieldNameAt(final int index) {
        return nameMap.get(index);
    }

    Db2Field id() {
        return idMeta;
    }

    int fieldCount() {
        return fieldMetas.size();
    }

    boolean hasIndexField() {
        return idMeta != null;
    }



    int sizeof()
    {
        int size = 0;
        for (int i = 0; i < fieldCount(); ++i)
        {
            if (i >= fieldCount() && i == parentIndexField())
            {
                size += 4;
                continue;
            }

            switch (fieldAt(i).type())
            {
                case BYTE:
                    size += 1;
                    break;
                case SHORT:
                    size += 2;
                    break;
                case FLOAT:
                case INT:
                    size += 4;
                    break;
                case LONG, STRING_NOT_LOCALIZED:
                    size += 8;
                    break;
                case STRING:
                    size += 8 * Locale.TOTAL_LOCALES.ordinal();
                    break;
            }
        }

        if (!hasIndexField())
            size += 4;

        return size;
    }
}