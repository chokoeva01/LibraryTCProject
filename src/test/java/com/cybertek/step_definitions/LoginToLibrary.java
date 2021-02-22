package com.cybertek.step_definitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import sun.awt.ConstrainableGraphics;

import javax.security.auth.login.Configuration;

public class LoginToLibrary extends LoginPage {

    LoginPage loginPage= new LoginPage();
    @Given("User is on Library login {string} page")
    public void user_is_on_library_login_page(String url) {

      Driver.getDriver().get(ConfigurationReader.getProperty(url));

      loginUser.sendKeys(ConfigurationReader.getProperty("student11user"));
      password.sendKeys(ConfigurationReader.getProperty("student11pass"));
      button.click();


    }

    @Given("the user login as a {string}")
    public void the_user_login_as_a(String string) {



    }
    @Then("the user on  {string}")
    public void the_user_on(String string) {

    }







}
