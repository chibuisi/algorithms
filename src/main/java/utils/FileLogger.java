package utils;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FileLogger {
    private static Logger logger;
    private static FileHandler fileHandler;
    private static SimpleFormatter formatter = new SimpleFormatter();
    private static final String LOG_FILE = "app.logger.file";

    static{
        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        String loggerFile = ConfigFileProperties.getInstance().getProperty(LOG_FILE);
        try {
            fileHandler = new FileHandler(rootPath+loggerFile,true);
        }
        catch (SecurityException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        logger = Logger.getLogger("MyFileLogger");
        fileHandler.setFormatter(formatter);
        logger.addHandler(fileHandler);
        //logger.setUseParentHandlers(false);
    }

    public static void log(Level level, String messge){
        logger.log(level,messge);
    }
    public static void info(String message){
        logger.log(Level.INFO,message);
    }
    public static void warn(String message){
        log(Level.WARNING,message);
    }
    public static void debug(String message){
        log(Level.FINE,message);
    }
    public static void error(String message){
        log(Level.SEVERE,message);
    }

    public static void main(String[] args) {
        FileLogger.error("The second log message");
    }
}
