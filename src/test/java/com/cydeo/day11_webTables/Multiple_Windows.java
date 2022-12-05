package com.cydeo.day11_webTables;

import com.cydeo.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class Multiple_Windows {

    @Test
    public void windowsHandleTest(){

        Driver.getDriver().get("https://www.amazon.com/");

        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.open('https://facebook.com','_blank');");

        BrowserUtils.switchWindowAndVerify("Google");
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());

        BrowserUtils.switchWindowAndVerify("Facebook");
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());

        BrowserUtils.switchWindowAndVerify("Amazon");
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());

        BrowserUtils.switchWindowAndVerify("Etsy");
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());

        Driver.closeDriver();


    }
}
