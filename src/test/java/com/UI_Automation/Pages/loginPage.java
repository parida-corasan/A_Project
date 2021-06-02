package com.UI_Automation.Pages;

import com.UI_Automation.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

public loginPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}


@FindBy(id = "user_login")
    public WebElement emailBox;


    @FindBy(id = "user_pass")
    public WebElement passwordBox;


    @FindBy(id = "wp-submit")
    public WebElement   loginButton;


    @FindBy(linkText = "Lost your password?")
    public WebElement forgotPasswordLink;


    @FindBy
    public WebElement  remmemberMecheckBox;


    @FindBy(id = "rememberme")
    public WebElement  eyeButton;


    @FindBy(linkText = "← Go to Imaginative Captures")
    public WebElement gotoCaptureLink;

    @FindBy(id = "login_error")
    public WebElement errorMessage;







}
