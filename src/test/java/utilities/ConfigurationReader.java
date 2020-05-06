package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties  configFile;

    static{
        String path = "configuration.properties";
        try{
            FileInputStream input = new FileInputStream(path);

            configFile = new Properties();
            configFile.load(input);
            input.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static String getProperty(String keyName){
        return configFile.getProperty(keyName);

    }
}
