package com.arjunproject.ex27_Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleHiddenDropdown34 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
         Thread.sleep(5000);

        //Login steps
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //Clicking on PIM
        driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();

        //Clicking on Job Title Dropdown
    driver.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[6]/div[1]/div[2]/div[1]/div[1]")).click();
    Thread.sleep(5000);

      //Select single option
       driver.findElement(By.xpath("//span[normalize-space()='QA Engineer']")).click();

     //count number of options
        List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//span"));
        System.out.println("Number of options :"+options.size());

        //Printing options
           for(int i=0;i<options.size();i++){
            System.out.println(options.get(i).getText());
        }

       //Enhanced for loop
//        for(WebElement option:options){
//            if(option.getText().equals("QA Lead")){
//                option.click();
//                break;
//            }
//        }

    }
}
