package com.github.jtrinity.config;

import org.springframework.boot.env.OriginTrackedMapPropertySource;
import org.springframework.boot.env.PropertySourceLoader;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ConfigurationSourceLoader implements PropertySourceLoader, ApplicationEventPublisherAware {

    @Override
    public String[] getFileExtensions() {
        return new String[]{"conf"};
    }

    @Override
    public List<PropertySource<?>> load(String name, Resource resource) throws IOException {
        Configuration configuration = Configuration.getInstance();
        configuration.load(resource);
        Map<String, Object> source = configuration.getConfig(resource.getFilename());
        OriginTrackedMapPropertySource propertySource = new OriginTrackedMapPropertySource(resource.getFilename(), source);
        return List.of(propertySource);
    }



    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        Configuration configuration = Configuration.getInstance();
        configuration.setReloadConsumer((s, diff) -> {
            publisher.publishEvent(new ConfigurationRefreshEvent(s, diff));
        });
    }
}
