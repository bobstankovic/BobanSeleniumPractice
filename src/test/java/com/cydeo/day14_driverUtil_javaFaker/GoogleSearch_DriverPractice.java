package com.cydeo.day14_driverUtil_javaFaker;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearch_DriverPractice {

    @Test
    public void googleSearchDriverPractice(){
        Driver.getDriver().get(ConfigurationReader.getProperty("googleUrl"));
        Driver.getDriver().findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("apple"));
        System.out.println("SessionId = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());
        Driver.closeDriver();
    }



}
