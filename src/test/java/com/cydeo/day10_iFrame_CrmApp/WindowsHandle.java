package com.cydeo.day10_iFrame_CrmApp;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowsHandle extends TestBase {

    @Test
    public void handleTest(){
        driver.get("https://practice.cydeo.com/windows");
        WebElement link = driver.findElement(By.linkText("Click Here"));
        link.click();
        driver.findElement(By.linkText("CYDEO")).click();

        Set<String> allWindows = driver.getWindowHandles();

        for (String each : allWindows){
            driver.switchTo().window(each);
            System.out.println("driver.getTitle() = " + driver.getTitle());
            if(driver.getTitle().equals("Cydeo"))
                break;
        }
        System.out.println("driver.getTitle() = " + driver.getTitle());

    }



}
