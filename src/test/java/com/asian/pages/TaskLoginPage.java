package com.asian.pages;

import com.asian.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskLoginPage {

    public TaskLoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "username")
    public WebElement emailInputBoxLoginPage;

    @FindBy(id = "password")
    public WebElement passwordInputBoxLoginPage;

    @FindBy(id = "kc-login")
    public WebElement subitButtonLoginPage;

    @FindBy(id = "input-error")
    public WebElement inalidUsernameOrPasswordErrorMessage;

    @FindBy(partialLinkText = "Forgot Password?")
    public WebElement forgotPasswordLink;

    @FindBy(id = "username")
    public WebElement emailForgotPassword;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitButtonForgotPassword;

    @FindBy(xpath = "//span[.='You should receive an email shortly with further instructions.']")
    public WebElement emailReceiveMessageForgotPassword;

    @FindBy(id = "input-error-username")
    public WebElement pleaseSpecifyUsernameForgotPasswordMessage;








}


