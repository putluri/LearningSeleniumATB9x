package com.arjunproject.ex29_DatePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatepickerDemo39 {

    //Select month & year
    static void selectMonthAndYear(WebDriver driver, String month, String year) {
        while (true) {
            String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            if (currentMonth.equals(month) && currentYear.equalsIgnoreCase(year)) {
                break;
            } else
                driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
            // driver.findElement(By.xpath("//span[contains(text(),'Prev')]")).click();
        }
    }

    static void selectDate(WebDriver driver, String date)
    {
        //Select the date
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
        for (WebElement dt:allDates)
        {
            if (dt.getText().equals(date))
            {
                dt.click();
                break;
            }
        }
    }
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        //Switch to frame
        driver.switchTo().frame(0);

        //Method 1 using sendkeys()
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("01/06/2025");

       //Method 2 using Datepicker.
       String year = "2025";
       String month = "July";
       String date = "06";

        driver.findElement(By.xpath("//input[@id='datepicker']")).click(); //Opens the datepicker
         selectMonthAndYear(driver,month,date);
         selectDate(driver, date);

        }
    }

