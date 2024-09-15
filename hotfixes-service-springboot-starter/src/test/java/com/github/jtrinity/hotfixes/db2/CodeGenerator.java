package com.github.jtrinity.hotfixes.db2;

import com.github.jtrinity.dbc.DbcObjects;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CodeGenerator {


    public String fileCode = """
            package com.github.jtrinity.dbc.domain;
            
            import com.github.jtrinity.cache.DbcEntity;
            import com.github.jtrinity.dbc.db2.Db2Field;
            import com.github.jtrinity.dbc.db2.Db2File;
            import com.github.jtrinity.dbc.db2.Db2Type;
            
            import jakarta.persistence.*;
            import lombok.Getter;
            import lombok.Setter;
            import lombok.ToString;
            import org.hibernate.annotations.ColumnDefault;
            
            @Getter
            @Setter
            @ToString
            @IdClass(DB2Id.class)
            @Entity
            @Table(name = "%s")
            @Db2File(name = "%s", layoutHash = %s, indexField = %s, parentIndexField = %s)
            public class %s implements DbcEntity {
                @Id
                @ColumnDefault("'0'")
                @Column(name = "ID", columnDefinition = "int UNSIGNED not null")
                @Db2Field(fieldIndex = %s, type = Db2Type.INT)
                private Integer id;
            
                @Id
                @ColumnDefault("0")
                @Column(name = "VerifiedBuild", nullable = false)
                private Integer verifiedBuild;
            }
            """;

    public static final String PATH_JAVA = "<>";
    public static final String PATH_CPLUSPLUS = "<>";

    private static class FileMate {
        String name;
        String dataId;
        String layoutHash;
        String indexField;
        String parentIndexField;
        List<String[]> fields = new ArrayList<>();
    }


    void generate2() {
        for (DbcObjects value : DbcObjects.values()) {

            String name = value.name();
            if(name.endsWith("Data")) {
                name = name.replace("Data", "Datum");
            }

            String code = """
                         %s(%s.class),
                    """.formatted(value.name(), name);

            System.out.print(code);
        }
    }


    void generate() throws IOException {

        Pattern fileName = Pattern.compile(".+Store\\(\"(\\w+.db2)\".+&(\\w+)LoadInfo", Pattern.CASE_INSENSITIVE);
        Pattern structMeta = Pattern.compile("struct (\\w+)Meta", Pattern.CASE_INSENSITIVE);
        Pattern structMetaItem = Pattern.compile(".+Instance\\{.(\\d+), ([-|\\d]+), \\d+, \\d+, (\\w+), \\w+, ([-|\\d]+)", Pattern.CASE_INSENSITIVE);

        Pattern name = Pattern.compile("struct\\s+(\\w+)LoadInfo", Pattern.CASE_INSENSITIVE);

        Pattern type = Pattern.compile("\\s+\\{\\s+(false|true),\\s+FT_(\\w+),\\s+\"(\\w+)\"\\s}", Pattern.CASE_INSENSITIVE);


        Path path = Paths.get(PATH_CPLUSPLUS + "src\\server\\game\\DataStores\\DB2Stores.cpp");
        Map<String, FileMate> dbFileName = new LinkedHashMap<>();
        for (String line : Files.readAllLines(path)) {
            Matcher nameMatcher = fileName.matcher(line);
            if (nameMatcher.find()) {
                String db2file = nameMatcher.group(1);
                String entryName = nameMatcher.group(2);
                FileMate fileMate = new FileMate();
                fileMate.name = db2file;
                dbFileName.put(entryName, fileMate);

            }
        }

        path = Paths.get(PATH_CPLUSPLUS + "src\\server\\game\\DataStores\\DB2Metadata.h");
        String entryName = "";
        for (String line : Files.readAllLines(path)) {
            Matcher nameMatcher = structMeta.matcher(line);
            if (nameMatcher.find()) {
                entryName = nameMatcher.group(1);
                entryName = entryName.replace("_", "");
                continue;
            }
            Matcher matcher = structMetaItem.matcher(line);
            if (matcher.find()) {
                FileMate fileMate = dbFileName.get(entryName);
                if (fileMate == null) {
                    continue;
                }
                fileMate.dataId = matcher.group(1);
                fileMate.layoutHash = matcher.group(3);
                fileMate.indexField = matcher.group(2);
                fileMate.parentIndexField = matcher.group(4);
            }
        }


        path = Paths.get(PATH_CPLUSPLUS + "src\\server\\game\\DataStores\\DB2LoadInfo.h");


        entryName = "";
        for (String line : Files.readAllLines(path)) {
            Matcher nameMatcher = name.matcher(line);
            if (nameMatcher.find()) {
                entryName = nameMatcher.group(1);
                continue;
            }
            Matcher matcher = type.matcher(line);
            if (matcher.find()) {
                dbFileName.get(entryName).fields.add(new String[]{matcher.group(1), matcher.group(2), matcher.group(3)});
            }
        }

        Map<String, String> classFix = new LinkedHashMap<>();
        classFix.put("ItemClass", "ItemClass");
        classFix.put("SpellRadius", "SpellRadius");
        classFix.put("SpellCategories", "SpellCategories");
        classFix.put("GlyphProperties", "GlyphProperty");
        classFix.put("ItemBonus", "ItemBonus");
        classFix.put("GemProperties", "GemProperty");
        classFix.put("SummonProperties", "SummonProperty");
        classFix.put("CfgCategories", "CfgCategory");
        classFix.put("ChrClasses", "ChrClass");

        Map<String, String> fieldFix = new HashMap<>();
        fieldFix.put("ID", "id");
        fieldFix.put("Class", "classField");

        dbFileName.forEach((key, value) -> {

            if (classFix.containsKey(key)) {
                key = classFix.get(key);
            } else if (key.endsWith("s")) {
                key = key.substring(0, key.length() - 1);
            } else if (key.endsWith("Data")) {
                key = key.substring(0, key.length() - 4) + "Datum";
            }

            Path sourceFile = Paths.get(PATH_JAVA + "hotfixes-service-springboot-starter\\src\\main\\java\\com\\github\\jtrinity\\hotfixes\\domain\\", key + ".java");

            try {
                String sourceText = Files.readString(sourceFile);
                StringBuilder builder = new StringBuilder(sourceText);
                String packageStr = "package com.github.jtrinity.dbc.domain;";

                int indexOf = builder.indexOf(packageStr);
                if (indexOf == -1) {
                    throw new IllegalStateException("Could not find package " + packageStr);
                }


                builder.insert(indexOf + packageStr.length(), "\r\n\r\nimport com.github.jtrinity.hotfixes.db2.Db2Field;\r\nimport com.github.jtrinity.hotfixes.db2.Db2File;\r\nimport com.github.jtrinity.hotfixes.db2.Db2Type;");

                String classStr = "public class";
                indexOf = builder.indexOf(classStr);
                if (indexOf == -1) {
                    throw new IllegalStateException("Could not find class " + classStr);
                }

                builder.insert(indexOf, "@Db2File(name = \"%s\", fileDataId = %s, layoutHash = %s, indexField = %s, parentIndexField = %s)\r\n".formatted(value.name, value.dataId, value.layoutHash, value.indexField, value.parentIndexField));


                for (int i = 0; i < value.fields.size(); i++) {
                    String[] items = value.fields.get(i);
                    String fieldCode = "\r\n    @Db2Field(fieldIndex = %s, type = Db2Type.%s, signed = %s)".formatted(i, items[1], items[0]);
                    String fieldName;

                    if (fieldFix.containsKey(items[2])) {
                        fieldName = fieldFix.get(items[2]);
                    } else {
                        fieldName = Character.toLowerCase(items[2].charAt(0)) + new StringBuilder(items[2]).substring(1);
                    }
                    int index = builder.indexOf(fieldName + ";");

                    if (index == -1) {
                        throw new RuntimeException("Not found field: " + fieldName + " in " + key + ".java");
                    }

                    for (int j = index; j > 0; j--) {
                        if (builder.charAt(j) == '\r') {
                            index = j;
                            break;
                        }
                    }

                    builder.insert(index, fieldCode);

                }

                //System.out.println(builder.toString());
                Files.write(sourceFile, builder.toString().getBytes());

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

    }
}