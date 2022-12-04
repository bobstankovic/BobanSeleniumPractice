package com.cydeo.day11_webTables;

import com.cydeo.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class Multiple_Windows extends TestBase {

    @Test
    public void windowsHandleTest(){

        driver.get("https://www.amazon.com");


        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");




       BrowserUtils.switchWindowAndVerify(driver, "Facebook");
        System.out.println("driver.getTitle() = " + driver.getTitle());

        BrowserUtils.switchWindowAndVerify(driver, "Google");
        System.out.println("driver.getTitle() = " + driver.getTitle());

        BrowserUtils.switchWindowAndVerify(driver, "Amazon");
        System.out.println("driver.getTitle() = " + driver.getTitle());

        BrowserUtils.switchWindowAndVerify(driver, "Etsy");
        System.out.println("driver.getTitle() = " + driver.getTitle());


    }
}
