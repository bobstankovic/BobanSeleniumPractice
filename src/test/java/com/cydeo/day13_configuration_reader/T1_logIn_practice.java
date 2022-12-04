package com.cydeo.day13_configuration_reader;

import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_logIn_practice {

    @Test
    public void logInCRM(){
        WebDriver driver = Driver.getDriver();
        driver.get(ConfigurationReader.getProperty("env"));
        CRM_Utilities.logInCRM(driver, ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        Assert.assertTrue(driver.getTitle().contains("Portal"));
        Driver.closeDriver();
    }

}
