package com.arjunproject.ex27_Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectDropdown32 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement drpdwnCountryEle = driver.findElement(By.xpath("//select[@class='form-control']"));
        Select  drpdwnCountry = new Select(drpdwnCountryEle);

        //Select option from the dropdown
        //drpdwnCountry.selectByVisibleText("Canada");
        //drpdwnCountry.selectByValue("india");
        //drpdwnCountry.selectByIndex(3);

        //Capture all the options and print them
        List<WebElement> allOptions = drpdwnCountry.getOptions();
        System.out.println("Number of options in a drop down :"+allOptions.size());

        //Printing the options
//        for (int i=0;i<allOptions.size();i++)
//        {
//            System.out.println(allOptions.get(i).getText());
//        }

        //Using enhanced for loop
        for (WebElement option:allOptions)
        {
            System.out.println(option.getText());
        }
    }
}
