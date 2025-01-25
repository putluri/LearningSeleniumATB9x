package com.arjunproject.ex42_BrokenLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

//   1) Link href="https://xyz.com"
//   2) https://xyz.com ---> server ---> status code
// 3) status code <400 not a broken link.

public class BrokenLinks61 {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total no of links: " + links.size());

        for (WebElement link : links) {
            String hrefValue = link.getAttribute("href");
            System.out.println(hrefValue);

            if (hrefValue == null || hrefValue.isEmpty()) {
                System.out.println("href value is null or empty. So not possible to check");
                continue;
            }

            // Hit URL to the server
            try {
                URL linkUrl = new URL(hrefValue); // Convert href value from string to URL format.
                HttpURLConnection connection = (HttpURLConnection) linkUrl.openConnection();
                connection.setRequestMethod("GET");
                connection.connect();

                int statusCode = connection.getResponseCode();
                if (statusCode >= 400) {
                    System.out.println("Broken link: " + hrefValue + " with status code: " + statusCode);
                } else {
                    System.out.println("Not Broken link: " + hrefValue + " with status code: " + statusCode);
                }
                connection.disconnect();
            } catch (MalformedURLException e) {
                System.out.println("URL is malformed: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("IOException occurred while checking the link: " + hrefValue + " Error: " + e.getMessage());
            }
        }

        driver.quit();
    }
}
