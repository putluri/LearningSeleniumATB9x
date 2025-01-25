package com.arjunproject.ex24_Handle_Checkboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestSelenium27 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //Select specific checkbox
        //driver.findElement(By.xpath("//input[@id='sunday']")).click();

       //Select all checkboxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
//        for (int i=0; i<checkboxes.size();i++)
//        {
//            checkboxes.get(i).click();
//        }

        //Select by enhanced loop
//        for (WebElement checkbox:checkboxes)
//        {
//            checkbox.click();
//        }

        //Select last 3 checkboxes
        //total no of checkboxes - how many checkboxes to be selected = starting index
        //7-2=5 (Starting Index)
//        for (int i=4;i<checkboxes.size();i++)
//        {
//            checkboxes.get(i).click();
//        }

        //Select last 3 checkboxes
//        for (int i=0;i<3;i++)
//        {
//            checkboxes.get(i).click();
//        }

        //Unselect the checkboxes if they are selected
        for (int i=0;i<3;i++)
        {
            checkboxes.get(i).click();
        }

        Thread.sleep(5000);

        for (int i=0;i<checkboxes.size();i++)
        {
            if (checkboxes.get(i).isSelected()) {
                checkboxes.get(i).click();
            }
        }

    }
}
