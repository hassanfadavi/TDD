package com.companynames.Utils;

public class StringUtils {

    String str;


    public static String toUpperCase(String str){
        if(str==null)
            throw new IllegalArgumentException("string value can not be null");

        return str.toUpperCase();
    }



    public static String toLowerCase(String str){
        if(str==null)
            throw new IllegalArgumentException("string value can not be null");

        return str.toLowerCase();
    }




}
