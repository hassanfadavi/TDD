package base;

import com.companynames.config.PropertiesLoader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    // Load base URL and debug logging flag from properties using the PropertiesLoader class
   public static final Logger  logger= LogManager.getLogger(BaseTest.class);

    // Variables to hold base URL and debug logging state
    protected  String baseUrl;
   protected boolean debugging;


    // Setup method executed before each test
   @BeforeEach          //before every individual test
   public void setUp(){
       // Load base URL and debug logging flag from properties using the PropertiesLoader class
       baseUrl= PropertiesLoader.get("base.url");
       debugging=Boolean.parseBoolean(PropertiesLoader.get("enable.debug.logging")) ;


       // Configure log level based on the debugLogging flag
       if(debugging){   //if is true
           // If debug logging is enabled, set the root log level to DEBUG
           Configurator.setRootLevel(Level.DEBUG);
           logger.debug("Enable debug mode");
       }else {
           // If debug logging is disabled, set the root log level to INFO
           Configurator.setRootLevel(Level.INFO);
       }
       // Log the base URL that was loaded
       logger.info("Base URL:{} " ,baseUrl);

   }

    // Log a message at either DEBUG or INFO level based on debugLogging flag
    public void log(String message){
       if(debugging){
           // Log at DEBUG level if debug logging is enabled
           logger.debug(message);
       }else{
           // Log at INFO level if debug logging is disabled
           logger.info(message);
       }

   }


}
