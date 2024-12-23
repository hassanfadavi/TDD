package com.companynames.config;

public class ApplicationConfig {



    //Application constants
    //direct write
    public static final String APP_NAME="TDD Framework";   //as default
    public static final String APP_version="1.0.0";  //default
    //or call it
    //    public static final String APP_NAME=System.getProperty("app.name","1.0.0");

    public static final String ENV=System.getProperty("env","dev");  //as default

    public static final String BASE_URL=ENV.equals("prod")
            ? "https://api.production.com"
            :"https://api.staging.com";   // or System.getProperty("base.url","https://api.staging.com")

    public static final boolean ENABLE_DEBUG_LOGGING=ENV.equals("dev");











;



}
