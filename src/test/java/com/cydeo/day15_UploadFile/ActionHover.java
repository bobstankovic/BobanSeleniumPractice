package com.cydeo.day15_UploadFile;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionHover {

    @Test
    public void googleActionTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("googleUrl"));
        WebElement googleSearch = Driver.getDriver().findElement(By.xpath("(//input[@name='btnK'])[2]"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(googleSearch).perform();
    }

}
