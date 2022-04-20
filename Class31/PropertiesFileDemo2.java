package Class31;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo2 {
    public static void main(String[] args) throws IOException {
        //first step locating the file that we want to read.
        String path = "C:\\Users\\kshah\\Desktop\\Syntax Class file\\Batch 12\\Config.properties";
        //navigating to that location
        FileInputStream fileInputStream = new FileInputStream(path);
//That special class which knows hpw tp read the.properties file
        Properties properties = new Properties();
        //Loading all the dat from the file to properties object
        properties.load(fileInputStream);
        System.out.println(properties.get("username"));
        System.out.println(properties.get("password"));
    }


}
