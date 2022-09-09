package com.asian.step_definitions;

import com.asian.pages.TaskLoginPage;
import com.asian.utilities.ConfigurationReader;
import com.asian.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TaskStepDefinitons {

    TaskLoginPage taskLoginPage = new TaskLoginPage();


    @Given(": User is on the homepage")
    public void user_is_on_the_homepage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("asian.url"));

    }


    @When("User enters a valid email into the email input box")
    public void user_enters_a_valid_email_into_the_email_input_box() {

        taskLoginPage.emailInputBoxLoginPage.sendKeys(ConfigurationReader.getProperty("asian.email"));

    }
    @When("User enters a valid password into the password input box")
    public void user_enters_a_valid_password_into_the_password_input_box() {

        taskLoginPage.passwordInputBoxLoginPage.sendKeys(ConfigurationReader.getProperty("asian.password"));

    }
    @When("User clicks the submit button")
    public void user_clicks_the_submit_button() {

        taskLoginPage.subitButtonLoginPage.click();

    }
    @Then("User should be able to login successfully")
    public void user_should_be_able_to_login_successfully() {

        String expectedURL = "console";

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedURL));


    }


    @When("User enters a invalid email into the email input box")
    public void userEntersAInvalidEmailIntoTheEmailInputBox() {

        taskLoginPage.emailInputBoxLoginPage.sendKeys("sst@hotmail.com");
    }

    @Then("{string} error message can be displayed on the login part")
    public void errorMessageCanBeDisplayedOnTheLoginPart(String message) {

        Assert.assertTrue(taskLoginPage.inalidUsernameOrPasswordErrorMessage.getText().trim().equals(message));

    }

    @And("User enters a invalid password into the password input box")
    public void userEntersAInvalidPasswordIntoThePasswordInputBox() {

        taskLoginPage.passwordInputBoxLoginPage.sendKeys("aaa");

    }

    @When("User doesn't enter email into the email input box")
    public void userDoesnTEnterEmailIntoTheEmailInputBox() {

        taskLoginPage.emailInputBoxLoginPage.sendKeys("");

    }

    @And("User doesn't enter password into the password input box")
    public void userDoesnTEnterPasswordIntoThePasswordInputBox() {

        taskLoginPage.passwordInputBoxLoginPage.sendKeys("");
    }


    @When("User clicks the forgot password link")
    public void userClicksTheForgotPasswordLink() {

        taskLoginPage.forgotPasswordLink.click();
    }

    @And("User enters valid email into the forgot password section email input box")
    public void userEntersValidEmailIntoTheForgotPasswordSectionEmailInputBox() {

        taskLoginPage.emailForgotPassword.sendKeys(ConfigurationReader.getProperty("asian.email"));
    }

    @And("User clicks the the forgot password section submit button")
    public void userClicksTheTheForgotPasswordSectionSubmitButton() {

        taskLoginPage.submitButtonForgotPassword.click();

    }

    @Then("{string} message can be displayed on the part")
    public void messageCanBeDisplayedOnThePart(String message) {

        Assert.assertTrue(taskLoginPage.emailReceiveMessageForgotPassword.getText().equals(message));

    }


    @And("User enters invalid email into the forgot password section email input box")
    public void userEntersInvalidEmailIntoTheForgotPasswordSectionEmailInputBox() {

        taskLoginPage.emailForgotPassword.sendKeys("123");

    }

    @Then("{string} message can not be displayed on the part")
    public void messageCanNotBeDisplayedOnThePart(String message) {

        Assert.assertFalse(taskLoginPage.emailReceiveMessageForgotPassword.getText().equals(message));

    }

    @And("User enters unregistered email into the forgot password section email input box")
    public void userEntersUnregisteredEmailIntoTheForgotPasswordSectionEmailInputBox() {

        taskLoginPage.emailForgotPassword.sendKeys("sst@hotmail.com");

    }

    @And("User does not enter email into the forgot password section email input box")
    public void userDoesNotEnterEmailIntoTheForgotPasswordSectionEmailInputBox() {

        taskLoginPage.emailForgotPassword.sendKeys("");

    }



    @Then("{string} error message can be displayed on the part")
    public void errorMessageCanBeDisplayedOnThePart(String message) {

        Assert.assertTrue(taskLoginPage.pleaseSpecifyUsernameForgotPasswordMessage.getText().trim().equals(message));

    }
}
