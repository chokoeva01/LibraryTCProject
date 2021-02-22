package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.LocalDate;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id="inputEmail")
    public WebElement loginUser;
     @FindBy(id="inputPassword")
    public WebElement password;
     @FindBy(xpath = "//button[.='Sign in']")
    public WebElement button;
    public void loginAsStudent(String student11user){
        loginUser.sendKeys(ConfigurationReader.getProperty(student11user));
        password.sendKeys(ConfigurationReader.getProperty("student11pass"));
        button.click();
}


}
