package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties configFile;

    static {
        try{
            String path = "src/test/java/configuration.properties";
            FileInputStream fileInputStream = new FileInputStream(path);
            configFile = new Properties();
            configFile.load(fileInputStream);
            fileInputStream.close();


        } catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("Failed to process");
        }
    }

    public static String getProperty(String keyName){
        return configFile.getProperty(keyName);
    }
}


