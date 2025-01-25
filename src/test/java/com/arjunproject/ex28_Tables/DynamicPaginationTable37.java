package com.arjunproject.ex28_Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DynamicPaginationTable37 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.opencart.com/admin/index.php");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.xpath("//input[@id='input-username']"));
        username.clear();
        username.sendKeys("demo");

        WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
        password.clear();
        password.sendKeys("demo");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

       // driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//a[@class='collapse show']")).click(); //Clicking Parent Element
        driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();

       //Showing 1 to 10 of 14652 (1466 Pages)
        String text = driver.findElement(By.xpath("//div[contains(text(),'Showing')]")).getText();
        System.out.println(text);

        int total_pages = Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));

//        //Repeating pages
//        for (int p=1;p<=5;p++) {
//            if (p > 1) {
//                WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()=\"+p+\"]"));
//                active_page.click();
//                Thread.sleep(5000);
//            }
//        }

     //Repeating pages
        for (int p=1; p<=total_pages; p++)
        {
            if (total_pages>1)
            {
                WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
                active_page.click();
            }

            int rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
            System.out.println("Number of rows: "+rows);
        }

        // Locate the rows of the table
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr"));

        //Reading the data from the page
        // Iterate through the rows
        for (int r = 1; r <= rows.size(); r++) {
            // Locate and extract data from each cell
            String customerName = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr[" + r + "]//td[2]")).getText();
            String customerEmail = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr[" + r + "]//td[3]")).getText();
            String customerStatus = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr[" + r + "]//td[5]")).getText();

            // Print the extracted data
            System.out.println(customerName + " " + customerEmail + " " + customerStatus);
        }

        // Close the browser
        driver.quit();
    }
}
