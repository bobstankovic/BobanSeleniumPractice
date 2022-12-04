package com.cydeo.day10_iFrame_CrmApp;

import com.cydeo.base.TestBase;
import com.cydeo.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class day10_iFrame_CRM extends TestBase {

    @Test
    public void sendingAppMsg(){
        driver.get("https://login2.nextbasecrm.com/");

        //CRM_Utilities.logInCRM(driver);

        CRM_Utilities.logInCRM(driver,"hr1@cydeo.com","UserUser");

        WebElement more = driver.findElement(By.id("feed-add-post-form-link-text"));
        more.click();

        WebElement appreciation = driver.findElement(By.xpath("//span[.='Appreciation'] [@class='menu-popup-item-text']"));
        appreciation.click();

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        WebElement bodyText = driver.findElement(By.xpath("//body[@style='min-height: 184px;']"));
        bodyText.sendKeys("Thanks");

        driver.switchTo().defaultContent();

        WebElement send = driver.findElement(By.id("blog-submit-button-save"));
        //send.click();


        WebElement message = driver.findElement(By.xpath("(//div[@class=' feed-post-contentview feed-post-text-block-inner'])[1]"));
        System.out.println("message.getText() = " + message.getText());
        Assert.assertEquals("Thanks", message.getText());


    }

}
