package com.cydeo.day14_driverUtil_javaFaker;

import org.testng.annotations.Test;

public class SingletonPractice {

    @Test
    public void callingSingleton(){
        String str1 = Singleton.getWord();
        System.out.println("str1 = " + str1);

        String str2 = Singleton.getWord();
        System.out.println("str2 = " + str2);

        String str3 = Singleton.getWord();
        System.out.println("str3 = " + str3);
    }

    @Test
    public void test2(){
        System.out.println("Singleton.getWord() = " + Singleton.getWord());
    }

}
