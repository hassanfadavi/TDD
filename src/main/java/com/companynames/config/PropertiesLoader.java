package com.companynames.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {


    private static final Properties properties = new Properties();

    static {
        // Static block to load application properties when the class is loaded
        try (InputStream input = PropertiesLoader.class
                .getClassLoader()
                .getResourceAsStream("application.properties")) {

            // Check if the properties file exists in the resources package
            if (input == null)
                throw new RuntimeException("Application properties not found under resources package");
            // Load the properties from the input stream
            properties.load(input);
        } catch (IOException e) {
            // Handle any IO exceptions during properties loading
            throw new RuntimeException("Failed to load application properties");
        }
    }


    public static String get(String key){

            return properties.getProperty(key);

    }


    public static String get(String key,String defaultValue){
        return properties.getProperty(key,defaultValue);

//        return (properties.getProperty(key)==null || properties.getProperty(key).isEmpty() ) ? defaultValue : properties.getProperty(key);

    }


//    check the loading is working
//    public static void main(String[] args) {

//        System.out.println(PropertiesLoader.get("app.name","TDD Framework"));
//           String appName= PropertiesLoader.get("app.name","TDD Frameworks");
//        System.out.println(appName);
//        System.out.println(appName);

//        System.out.println(PropertiesLoader.get("app.name"));
//        System.out.println(PropertiesLoader.properties);

//        System.out.println(PropertiesLoader.get("base.url"));

//    }


























}
