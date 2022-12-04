package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

    public static void switchWindowAndVerify(WebDriver driver,String expectedInUrl,String expectedTitle) {

        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String eachWindow : allWindowHandles) {
            // driver.switchTo().window(eachWindow); syntax will switch each windows and driver will be able to see each window
            driver.switchTo().window(eachWindow);
            //  System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains(expectedInUrl)) {
                break;
            }
        }

//        5. Assert:Title contains “Etsy”
        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle), "Title verification failed!");
    }

    public static void switchWindowAndVerify(WebDriver driver ,String expectedTitle) {

        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String eachWindow : allWindowHandles) {
            // driver.switchTo().window(eachWindow); syntax will switch each windows and driver will be able to see each window
            driver.switchTo().window(eachWindow);
            //  System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

            if (driver.getTitle().contains(expectedTitle)) {
                break;
            }
        }

//        5. Assert:Title contains “Etsy”
        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle), "Title verification failed!");
    }

    public static void verifyTitle(WebDriver driver,String expectedTitle) {
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }



}
