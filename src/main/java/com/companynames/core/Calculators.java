package com.companynames.core;

public class Calculators {


    public static int sum(int a, int b) {
        return a + b;
    }


    public static int sum(int a, int b, int c) {
        return sum(a, b) + c;
    }

    public static int multiply(int a, int b) {
        return (a * b);
    }

    public static int multiply(int a, int b,int c) {
        return (multiply(a,b)*c);
    }


    public static int subtract(int a, int b) {
        return a-b;
    }

    public static int subtract(int a, int b,int c) {
        return sum(a,b)-c;
    }

    public static int division(int a,int b){
        if(b==0) throw new ArithmeticException("can not divided by zero");

        return (a/b);
    }







}