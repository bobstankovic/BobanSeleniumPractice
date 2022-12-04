package com.cydeo.day12_singltenDriver;

import org.testng.annotations.Test;

public class LearningProperties {

    @Test
    public void test(){
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.name"));
    }
}
