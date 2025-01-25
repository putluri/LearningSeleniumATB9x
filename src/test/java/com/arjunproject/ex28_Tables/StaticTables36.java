package com.arjunproject.ex28_Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class StaticTables36 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // 1) Find total no of rows in a table.
        int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println("Total no of rows: " + rows);

        // driver.findElements(By.tagName("tr")).size(); //Single table.

        // 2) Find total no of columns in a table.
        int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println("Total no of columns: " + columns);

        // driver.findElements(By.tagName("th")).size(); //Single table.

        //3) Read data from specific Row and Column (Ex: 5th row and 1st column)
        String bookName =driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
        System.out.println(bookName);
        //4) Read data from all the Rows and Columns
//        for (int r=2; r<=rows; r++){
//            for (int c=1; c<=columns; c++){
//                String data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
//                System.out.print(data + " | ");
//            }
//            System.out.println();
//        }

       //5) Print book names whose author is "Mukesh"
//        for (int r=2; r<=rows; r++){
//            String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
//            if (authorName.equals("Mukesh")){
//                String bookName1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
//                System.out.println(authorName + " : " + bookName1);
//            }
//        }

        //6) Find the total prices of all the books listed
        int sum = 0;
        for (int r=2; r<=rows; r++){
            String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
            sum = sum + Integer.parseInt(price);
        }
        System.out.println("Total price of all books: " + sum);
    }
}
