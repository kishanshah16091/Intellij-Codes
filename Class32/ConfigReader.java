package Class32;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static String getProperty(String key) throws IOException {
        //first step locating the file that we want to read.
        String path = "Files/Config.properties";
        // navigating to that location
        FileInputStream fileInputStream = new FileInputStream(path);
        //That special class which knows how to read the .properties file
        Properties properties = new Properties();
        //loading all the data from the file to properties object
        properties.load(fileInputStream);
        return properties.getProperty(key);

    }
}