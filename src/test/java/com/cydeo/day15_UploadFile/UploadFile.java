package com.cydeo.day15_UploadFile;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadFile {

    String path = "C:\\Users\\boban\\OneDrive\\Desktop\\some-file.txt";

    @Test
    public void uploadTest() throws InterruptedException {

        Driver.getDriver().get(ConfigurationReader.getProperty("upload.url"));
        Driver.getDriver().findElement(By.id("uploadfile_0")).sendKeys(path);
        Driver.getDriver().findElement(By.id("terms")).click();
        Driver.getDriver().findElement(By.id("submitbutton")).click();
        WebElement message = Driver.getDriver().findElement(By.id("res"));
        Thread.sleep(1000);
        Assert.assertEquals("1 file\nhas been successfully uploaded.", message.getText());

    }

    @Test
    public void test2(){
        Driver.getDriver().get(ConfigurationReader.getProperty("upload.cydeo"));
        Driver.getDriver().findElement(By.id("file-upload")).sendKeys(path);
        Driver.getDriver().findElement(By.id("file-submit")).click();
        WebElement message = Driver.getDriver().findElement(By.xpath("//h3[.='File Uploaded!']"));
        Assert.assertEquals("File Uploaded!", message.getText());
        Driver.closeDriver();

    }
}
