package com.arjunproject.ex32_KeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class OpenTheLinkInNewTab48 {
    public static void main(String[] args)  {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        WebElement regLink = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        Actions act = new Actions(driver);

        // Open the registration page in a new tab using Ctrl+Click
        act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();

        // Get all window handles
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> ids = new ArrayList<>(windowHandles);

        // Identify the registration page (new tab)
        String homeWindow = driver.getWindowHandle(); // Current window handle
        String registrationWindow = ids.stream()
                .filter(id -> !id.equals(homeWindow))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Registration window not found"));

        // Switch to the registration page
        driver.switchTo().window(registrationWindow);
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Arjun");

        // Switch back to the home page
        driver.switchTo().window(homeWindow);
        driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("TShirts");

        // Close all windows
        //driver.quit();

    }
}
