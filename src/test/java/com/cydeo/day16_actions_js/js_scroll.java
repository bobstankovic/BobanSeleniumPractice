package com.cydeo.day16_actions_js;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class js_scroll {

    @Test
    public void scrollTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("etsy.url"));
        WebElement email = Driver.getDriver().findElement(By.name("email_address"));

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        js.executeScript("arguments[0].scrollIntoView(true)", email);
        //js.executeScript("window.scrollBy(0, -1000)");

        Faker faker = new Faker();

        email.sendKeys(faker.internet().emailAddress());
        email.clear();

    }
}
