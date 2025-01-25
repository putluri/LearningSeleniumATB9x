package com.arjunproject.ex54_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage2 {

    WebDriver driver;
    //constructor
    LoginPage2(WebDriver driver)
    {
      this.driver = driver;
        PageFactory.initElements(driver,this); //Mandatory
    }
    //Locators
//      By txt_username_loc = By.xpath("//input[@placeholder='Username']");
//     By txt_password_loc = By.xpath("//input[@placeholder='password']");
//     By txt_login_loc = By.xpath("//button[normalize-space()='Login']");

   //  @FindBy(xpath = "//input[@placeholder='Username']") WebElement txt_username;
   @FindBy(how = How.XPATH, using = "//input[@placeholder='Username']") WebElement txt_username;
    @FindBy(xpath = "//input[@placeholder='Password']") WebElement txt_password;
    @FindBy(xpath = "//button[normalize-space()='Login']") WebElement btn_login;
    @FindBy(tagName = "a") List<WebElement> links;

    //Action Methods
  public void setUserName(String user)

  {
      txt_username.sendKeys(user);
  }

    public void setPassword(String pwd)

    {
        txt_username.sendKeys(pwd);
    }

    public void clickLogin()

    {
        btn_login.click();
    }

}
