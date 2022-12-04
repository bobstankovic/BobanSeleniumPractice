package com.cydeo.day12_singltenDriver;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DriverTest {

    @Test
    public void testDriverUtility(){
        WebDriver driver = Driver.getDriver();
        System.out.println("driver.getWindowHandles() = " + driver.getWindowHandles());


    }

}
