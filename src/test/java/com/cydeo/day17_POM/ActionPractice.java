package com.cydeo.day17_POM;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionPractice {

    @Test
    public void cydeoPractice() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("drop"));
        WebElement small = Driver.getDriver().findElement(By.id("draggable"));
        WebElement big = Driver.getDriver().findElement(By.id("droptarget"));

        Actions actions = new Actions(Driver.getDriver());
        //actions.dragAndDrop(small,big).perform();

        Assert.assertTrue(big.getText().equals("Drag the small circle here."));

        actions.moveToElement(small).clickAndHold().moveToElement(big).release().perform();
        Assert.assertTrue(big.getText().equals("You did great!"));

        actions.moveToElement(small).clickAndHold().moveByOffset(100,100).release().perform();
        Assert.assertTrue(big.getText().equals("Try again!"));
        Thread.sleep(1000);

        actions.moveToElement(small).clickAndHold().moveByOffset(100,100).perform();
        Thread.sleep(1000);
        System.out.println("big.getText() = " + big.getText());
        Assert.assertTrue(big.getText().equals("Drop here."));
        Driver.closeDriver();
    }


}
