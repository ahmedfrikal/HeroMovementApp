package fr.GoDev.HeroMovement.rabat.utils;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.Map;

public class YamlPropertiesLoader {
    private final Map<String, Object> properties;

    public YamlPropertiesLoader(String yamlFileName) {
        Yaml yaml = new Yaml();
        try (InputStream input = getClass().getResourceAsStream(yamlFileName)) {
            if (input == null) {
                throw new IllegalArgumentException("Unable to find " + yamlFileName);
            }
            properties = yaml.load(input);
        } catch (Exception ex) {
            throw new RuntimeException("Failed to load YAML file", ex);
        }
    }

    @SuppressWarnings("unchecked")
    public String getProperty(String key) {
        return ((Map<String, Object>) properties.get(key)).get("file").toString();
    }


}
