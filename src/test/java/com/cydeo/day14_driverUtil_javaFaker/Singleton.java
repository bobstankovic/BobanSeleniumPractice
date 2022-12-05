package com.cydeo.day14_driverUtil_javaFaker;

public class Singleton {

    private Singleton(){}

    private static String word;

    public static String getWord(){

        if(word == null){
            System.out.println("first time calling. Word is null. We assigning a value ");
            word = "something";

        }else {
            System.out.println("Word is already assigned and has a value");
        }
        return word;
    }
}
