package com.cydeo.day16_actions_js;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class actionScroll {
    @Test
    public void actionTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("practice.page.url"));
        WebElement cydeo = Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement home = Driver.getDriver().findElement(By.linkText("Home"));

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(cydeo).click().perform();
        BrowserUtils.switchWindowAndVerify("Practice");

        actions.moveToElement(home).click().perform();
        BrowserUtils.switchWindowAndVerify( "Practice");


    }

}
