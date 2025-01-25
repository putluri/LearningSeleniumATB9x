package com.arjunproject.ex27_Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BootStrap_Dropdown33 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click(); //Opens thr dropdwn Options

        //1) Select single option
        //driver.findElement(By.xpath("//input[@value=\"Java\"]")).click();

       //2) Capture multiple options and find out the size.
        List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//label"));
        System.out.println("Number of options :"+options.size());

        //3) Printing options from dropdown
//        for(WebElement op:options)
//        {
//            System.out.println(op.getText());
//        }

        //4) Select multiple options
        for(WebElement op:options)
        {
            String opt = op.getText();
            if(opt.equals("Angular") || opt.equals("Java") || opt.equals("MySQL"))
            {
                op.click();
            }
        }
    }
}
