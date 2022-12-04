package com.cydeo.day11_webTables;

import com.cydeo.base.TestBase;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

public class WebTablePractice extends TestBase {

    @Test
    public void order_name_verify_test(){
        driver.get("https://practice.cydeo.com/tables");

        driver.findElement(By.xpath("//table[@id='table1']"));

        List<WebElement> firstRow = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr[1]/td"));
        for (WebElement each : firstRow)
            System.out.println("each.getText() = " + each.getText());


        System.out.println("end");
    }

    @Test
    public void test1(){
        driver.get("https://practice.cydeo.com/web-tables");

        WebElement cellBobMartinName = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr/td[2][.='Bob Martin']"));
        Assert.assertEquals("Bob Martin", cellBobMartinName.getText());

        WebElement cellDate = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr/td[2][.='Bob Martin']/following-sibling::td[3]"));
        Assert.assertEquals("12/31/2021", cellDate.getText());

    }

    @Test
    public void test2(){
        driver.get("https://practice.cydeo.com/web-tables");
        String date = WebTableUtils.returnOrderDate(driver, "Ned Stark");
        Assert.assertEquals("05/12/2021", date);

    }

}
