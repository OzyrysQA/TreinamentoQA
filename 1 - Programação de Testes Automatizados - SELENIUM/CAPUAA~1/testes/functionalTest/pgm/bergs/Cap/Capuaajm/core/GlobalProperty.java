package bergs.Cap.Capuaajm.core;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class GlobalProperty {
    
    public static String getProperty(String key) {
        Properties property = new Properties();
        String value = null;
        
        try {
            property.load(
                new FileInputStream(
                        "resources"+File.separator+
                        "environment.properties"));            
                value = property.getProperty(key);                        
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }
}