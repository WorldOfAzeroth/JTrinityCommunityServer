package com.pandaria.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.toml.TomlMapper;
import org.springframework.boot.env.OriginTrackedMapPropertySource;
import org.springframework.boot.env.PropertySourceLoader;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ConfigurationSourceLoader implements PropertySourceLoader {

    private static final TomlMapper mapper = new TomlMapper();
    @Override
    public String[] getFileExtensions() {
        return new String[]{"conf"};
    }

    @Override
    public List<PropertySource<?>> load(String name, Resource resource) throws IOException {

        final Map<String, Object> resultMap =  mapper.readValue(resource.getInputStream(), new TypeReference<>() {
        });
        Map<String, Object> flatMap = new HashMap<>();

        flatMap(null, resultMap, flatMap);

        OriginTrackedMapPropertySource propertySource = new OriginTrackedMapPropertySource(Optional.ofNullable(name).orElseGet(resource::getFilename), flatMap);
        return List.of(propertySource);
    }

    private static void flatMap(String prefix, Map<String, Object> source, Map<String, Object> result) {
        source.forEach((k, v) -> {
            String key = prefix == null ? k : prefix.toLowerCase() + "." + k;
            if(v instanceof Map map) {
                flatMap(key, map, result);
            } else {
                result.put(key, v);
            }
        });
    }

}
