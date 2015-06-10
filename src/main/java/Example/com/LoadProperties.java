package Example.com;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Bhaygashri on 25/05/2015.
 */
public class LoadProperties {

    static Properties prop;
    static FileInputStream input;
    static String propertiesFileLoation="src/test/java/TestProperties/";
    static String propertyFileName ="TestData.Properties";

    public static String getProperties(String key) {

        prop= new Properties();
        try {
            // provding property file path as input
            input = new FileInputStream(propertiesFileLoation + propertyFileName);
            prop.load(input);
            input.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        return prop.getProperty(key);

    }

}
