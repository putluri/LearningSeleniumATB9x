package com.arjunproject.ex27_Dropdowns;

import net.bytebuddy.agent.builder.AgentBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggestDropdown35 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("selenium");
        List<WebElement> list = (List<WebElement>) driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i).getText());
            if (list.get(i).getText().contains("selenium webdriver")) {
                list.get(i).click();
                break;
            }
        }

    }
}
