package com.asian.pages;

import com.asian.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(partialLinkText = "Register")
    public WebElement registerTab;

    @FindBy(id = "email")
    public WebElement emailRegisterInputBox;

    @FindBy(id = "password")
    public WebElement passwordRegisterInputBox;

    @FindBy(id = "password-confirm")
    public WebElement passwordConfirmInputBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement registerButton;

    @FindBy(xpath = "//span[.='Invalid email address.']")
    public WebElement invalidEmailAdressMessage;

    @FindBy(xpath = "//span[.='Email already exists.']")
    public WebElement EmailAAlreadyExistMessage;

    @FindBy(id = "username")
    public WebElement emailSignInInputBox;

    @FindBy(id = "password")
    public WebElement passwordSignInInputBox;

    @FindBy(id = "kc-login")
    public WebElement signInButton;

    @FindBy(id = "input-error")
    public WebElement invalidUsernamePasswordMessage;

    @FindBy(partialLinkText = "Forgot Password")
    public WebElement forgotPasswordLink;

    @FindBy(id = "username")
    public WebElement forgotPasswordEmailInputBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement forgotPasswordSubmitButton;

    @FindBy(xpath = "//span[contains(text(), 'You should receive')]")
    public WebElement forgotPasswordErrorMessage;




}
