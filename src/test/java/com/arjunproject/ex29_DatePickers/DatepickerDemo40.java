package com.arjunproject.ex29_DatePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatepickerDemo40 {

    // Method to select a future date
    static void selectFutureDate(WebDriver driver, String year, String month, String date) {
        while (true) {
            String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            // Break the loop when the desired month and year are reached
            if (currentMonth.equalsIgnoreCase(month) && currentYear.equals(year)) {
                break;
            } else {
                // Click the "Next" button to navigate through months
                driver.findElement(By.xpath("//a[@data-handler='next']")).click();
            }
        }

        // Select the specific date
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
        for (WebElement dt : allDates) {
            if (dt.getText().equals(date)) {
                dt.click();
                break;
            }
        }
    }

    // Method to select a past date
    static void selectPastDate(WebDriver driver, String year, String month, String date) {
        while (true) {
            String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            // Break the loop when the desired month and year are reached
            if (currentMonth.equalsIgnoreCase(month) && currentYear.equals(year)) {
                break;
            } else {
                // Click the "Previous" button to navigate through months
                driver.findElement(By.xpath("//a[@data-handler='prev']")).click();
            }
        }

        // Select the specific date
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
        for (WebElement dt : allDates) {
            if (dt.getText().equals(date)) {
                dt.click();
                break;
            }
        }
    }

    public static void main(String[] args) {
        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        // Switch to the frame containing the datepicker
        driver.switchTo().frame(0);

        // Method 1: Using sendKeys() to directly input the date
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("01/06/2025");

        // Method 2: Using the date picker UI
        driver.findElement(By.xpath("//input[@id='datepicker']")).click(); // Opens the datepicker

        String year = "2022";
        String month = "May";
        String date = "10";

        // Use the future date selection method
       // selectFutureDate(driver, year, month, date);

        // Optionally, use the past date selection method
         selectPastDate(driver, year, month, date);

        // Close the browser
        driver.quit();
    }
}

