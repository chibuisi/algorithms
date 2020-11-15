package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class ConfigFileProperties {
    private static Properties properties;
    private static Lock lock = new ReentrantLock();
    private static final String CONFIG_PROPERTIES = "config.properties";
    private static final InputStream inputStream = ConfigFileProperties.class.getClassLoader().getResourceAsStream(CONFIG_PROPERTIES);

    private ConfigFileProperties(){

    }

    public static Properties getInstance(){
        if(properties == null){
            synchronized (lock){
                if(properties == null){
                    properties = new Properties();
                    try{
                        if(inputStream != null){
                            properties.load(inputStream);
                        }
                        else
                            throw new FileNotFoundException("Porperty File Not Found");
                        //String rootPath = new Thread().getContextClassLoader().getResource("").getPath();
                        //properties.load(new FileInputStream(rootPath+"/config.properties"));
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }
        return properties;
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }

    public static void main(String[] args) {
        Properties properties = ConfigFileProperties.getInstance();
        System.out.println(properties.getProperty("app.global.name"));
    }
}
