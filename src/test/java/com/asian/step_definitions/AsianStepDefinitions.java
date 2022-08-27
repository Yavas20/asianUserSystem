package com.asian.step_definitions;

import com.asian.pages.LoginPage;
import com.asian.utilities.ConfigurationReader;
import com.asian.utilities.Driver;
import com.sun.source.tree.AssertTree;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.lang.module.Configuration;

public class AsianStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("asian.url"));
    }

    @When("User click the register tab")
    public void user_click_the_register_tab() {

        loginPage.registerTab.click();
    }

    @And("User enter an email into the email input box")
    public void userEnterAnEmailIntoTheEmailInputBox() {

        loginPage.emailRegisterInputBox.sendKeys(ConfigurationReader.getProperty("asian.email"));

    }

    @When("User enter a password into the password input box")
    public void user_enter_a_password_into_the_password_input_box() {

        loginPage.passwordRegisterInputBox.sendKeys(ConfigurationReader.getProperty("asian.password"));
    }


    @When("User re-enter the password into the input box")
    public void user_re_enter_the_password_into_the_input_box() {

        loginPage.passwordConfirmInputBox.sendKeys(ConfigurationReader.getProperty("asian.password"));

    }

    @When("User click the register button")
    public void user_click_the_register_button() {

        loginPage.registerButton.click();
    }

    @Then("Verify that user can land on homepage")
    public void verify_that_user_can_land_on_homepage() {

        String expectedURL = "console";
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedURL));
    }


    @When("User enter a valid email into the email input box")
    public void userEnterAValidEmailIntoTheEmailInputBox() {

        loginPage.emailSignInInputBox.sendKeys(ConfigurationReader.getProperty("asian.registeredEmail"));
    }

    @And("User enter a valid password into the password input box")
    public void userEnterAValidPasswordIntoThePasswordInputBox() {

       loginPage.passwordSignInInputBox.sendKeys(ConfigurationReader.getProperty("asian.registeredPassword"));
    }

    @And("User click the click sign in button")
    public void userClickTheClickSignInButton() {

        loginPage.signInButton.click();

    }


    @And("User enter an invalid password into the password input box")
    public void userEnterAnInvalidPasswordIntoThePasswordInputBox() {

        loginPage.passwordSignInInputBox.sendKeys("qa");

    }

    @Then("Verify that “Invalid username or password.” message can be displayed")
    public void verifyThatInvalidUsernameOrPasswordMessageCanBeDisplayed() {

        String expectedMessage = "Invalid username or password";
        Assert.assertTrue(loginPage.invalidUsernamePasswordMessage.getText().contains(expectedMessage));
    }

    @When("User enter an invalid email into the email input box")
    public void userEnterAnInvalidEmailIntoTheEmailInputBox() {

        loginPage.emailSignInInputBox.sendKeys("sdet@hotmail.com");
    }

    @And("User enter an invalid email into the register email input box")
    public void userEnterAnInvalidEmailIntoTheRegisterEmailInputBox() {

        loginPage.emailRegisterInputBox.sendKeys("qa");
    }


    @Then("Verify that “Invalid email address.” message can be displayed")
    public void verifyThatInvalidEmailAddressMessageCanBeDisplayed() {

        String expectedMessage = "Invalid email address";
        Assert.assertTrue(loginPage.invalidEmailAdressMessage.getText().contains(expectedMessage));
    }

    @And("User enter the registered email into the register email input box")
    public void userEnterTheRegisteredEmailIntoTheRegisterEmailInputBox() {

        loginPage.emailRegisterInputBox.sendKeys(ConfigurationReader.getProperty("asian.registeredEmail"));

    }

    @Then("Verify that “Email already exists.” message can be displayed")
    public void verifyThatEmailAlreadyExistsMessageCanBeDisplayed() {

        String expectedMessage = "Email already exists";
        Assert.assertTrue(loginPage.EmailAAlreadyExistMessage.getText().contains(expectedMessage));
    }
}
