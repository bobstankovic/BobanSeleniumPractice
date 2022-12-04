package com.cydeo.utilities;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;

public class CRM_Utilities extends TestBase {


    public static void logInCRM(WebDriver driver) {
        driver.get("https://login2.nextbasecrm.com/");
        String username = "helpdesk1@cybertekschool.com";
        String password = "UserUser";

        WebElement userBox = driver.findElement(By.name("USER_LOGIN"));
        userBox.sendKeys(username);

        WebElement passwordBox = driver.findElement(By.name("USER_PASSWORD"));
        passwordBox.sendKeys(password);

        WebElement logInButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        logInButton.click();

    }

    public static void logInCRM(WebDriver driver, String username, String password) {
        driver.get("https://login2.nextbasecrm.com/");

        WebElement userBox = driver.findElement(By.name("USER_LOGIN"));
        userBox.sendKeys(username);

        WebElement passwordBox = driver.findElement(By.name("USER_PASSWORD"));
        passwordBox.sendKeys(password);

        WebElement logInButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        logInButton.click();

    }

}
