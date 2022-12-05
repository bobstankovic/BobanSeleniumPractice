package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

    public static void switchWindowAndVerify(String expectedInUrl,String expectedTitle) {

        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        for (String eachWindow : allWindowHandles) {
            // driver.switchTo().window(eachWindow); syntax will switch each windows and driver will be able to see each window
            Driver.getDriver().switchTo().window(eachWindow);
            //  System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)) {
                break;
            }
        }

//        5. Assert:Title contains “Etsy”
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle), "Title verification failed!");
    }

    public static void switchWindowAndVerify(String expectedTitle) {

        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        for (String eachWindow : allWindowHandles) {
            // driver.switchTo().window(eachWindow); syntax will switch each windows and driver will be able to see each window
            Driver.getDriver().switchTo().window(eachWindow);
            //  System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

            if (Driver.getDriver().getTitle().contains(expectedTitle)) {
                break;
            }
        }

//        5. Assert:Title contains “Etsy”
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle), "Title verification failed!");
    }

    public static void verifyTitle(String expectedTitle) {
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }



}
