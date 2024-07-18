package sn.lord.iot.communication.configfilemanager;



import sn.lord.iot.communication.utils.FileManager;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public abstract class ConfigurationFileManager {
    private static final String BASE_PATH = "/src/main/java/resources/";
    protected final Properties configProperties;

    protected ConfigurationFileManager(String fileName) {
        try {
            String currentPath = FileManager.getInstance().getAbsolutePath()+BASE_PATH+fileName;
            configProperties = new Properties();
            FileInputStream fis = new FileInputStream(currentPath);
            configProperties.load(fis);
            fis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public String getConfigValue(String key) {
        return configProperties.getProperty(key);
    }
}