package com.UI_Automation.StepDefinition;

import com.UI_Automation.Pages.loginPage;
import com.UI_Automation.Utilities.Driver;
import com.UI_Automation.Utilities.configurationReader;
import com.UI_Automation.Utilities.waits;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;

import javax.swing.text.Utilities;

public class login_step {

   loginPage loginpage=new loginPage();

    @Given("user on the login page")
    public void user_on_the_login_page1() {
      Driver.getDriver().get(configurationReader.getProperty("homePage"));

    }

    @When("user enter valid email and password")
    public void user_enter_valid_email_and_password() {
       // System.out.println("user enter valid email and password");
        loginpage.emailBox.sendKeys(configurationReader.getProperty("email"));
        loginpage.passwordBox.sendKeys(configurationReader.getProperty("passWord"));
        loginpage.loginButton.click();
        waits.implicitWait(20);
    }
    @Then("display  dashboard")
    public void dispalyDashboard() {
        String expectedTitle="Dashboard ‹ Imaginative Captures — WordPress";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }






    @When("user enter incorrect email and password")
    public void user_enter_incorrect_email_and_password() {
        loginpage.emailBox.sendKeys("ncjbfd@gmail.com");
        loginpage.passwordBox.sendKeys("kdjkwehfdkjewuro34875843");
        loginpage.loginButton.click();
        waits.implicitWait(20);
    }
    @Then("display error message1 {string}")
    public void display_error_message1(String string) {
     String expextedError=string;
     String actualError=loginpage.errorMessage.getText();
     Assert.assertEquals(expextedError,actualError);

    }





    @When("user enter incorrect email and correct password")
    public void user_enter_incorrect_email_and_correct_password() {
        loginpage.emailBox.sendKeys("ncjbfd@gmail.com");
        loginpage.passwordBox.sendKeys(configurationReader.getProperty("passWord"));
        waits.implicitWait(20);
        loginpage.loginButton.click();

    }
    @Then("display error message2 {string}")
    public void display_error_message2(String string) {
        String expextedError=string;
        String actualError=loginpage.errorMessage.getText();
        Assert.assertEquals(expextedError,actualError);
    }





    @When("user enter correct email and incorrect password")
    public void user_enter_correct_email_and_incorrect_password() {
        loginpage.emailBox.sendKeys("peride.ab@gmail.com");
        loginpage.passwordBox.sendKeys("kdjkwehfdkjewuro34875843");
        waits.implicitWait(20);
        loginpage.loginButton.click();

    }
    @Then("display error message contains {string}")
    public void display_error_message_contains(String string) {

        String expextedError=string;
        String actualError=loginpage.errorMessage.getText();
        Assert.assertTrue(  actualError.contains(expextedError)   );
    }



}
