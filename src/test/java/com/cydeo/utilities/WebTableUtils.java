package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {

    public static String returnOrderDate (WebDriver driver, String customerName){
        return driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr/td[2][.='"+ customerName + "']/following-sibling::td[3]")).getText();
    }

    public static void verifyDate (WebDriver driver, String customerName, String date){
        String tableDate = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr/td[2][.='"+ customerName + "']/following-sibling::td[3]")).getText();
        Assert.assertEquals(date, tableDate);
    }
}
