package com.arjunproject.ex23_Closing_SpecificBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class TestSelenium26 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
        Set<String> windowIDs = driver.getWindowHandles();
        for (String winid:windowIDs)
        {
            String title = driver.switchTo().window(winid).getTitle();
            System.out.println(title);
            if (title.equals("OrangeHRM") || (title.equals("Human Resources Management Software | OrangeHRM")))
            {
                driver.close();
            }
        }

    }
}
