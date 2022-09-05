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
import org.openqa.selenium.interactions.Actions;

import java.lang.module.Configuration;
import java.util.List;

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

    @When("User enter a valid {string} into the email input box")
    public void userEnterAValidIntoTheEmailInputBox(String email) {
        loginPage.emailSignInInputBox.sendKeys(email);
    }

    @And("User enter a valid {string} into the password input box")
    public void userEnterAValidIntoThePasswordInputBox(String password) {
        loginPage.passwordSignInInputBox.sendKeys(password);
    }

    @When("User click the forgot password link")
    public void userClickTheForgotPasswordLink() {

        loginPage.forgotPasswordLink.click();
    }

    @And("User enter invalid email into the forgot your password email input box")
    public void userEnterInvalidEmailIntoTheForgotYourPasswordEmailInputBox() {

        loginPage.forgotPasswordEmailInputBox.sendKeys("123");
    }

    @And("User click the submit button")
    public void userClickTheSubmitButton() {

        loginPage.forgotPasswordSubmitButton.click();
    }

    @Then("Verify that “Invalid email address.” message can be displayed on forgot your password section")
    public void verifyThatInvalidEmailAddressMessageCanBeDisplayedOnForgotYourPasswordSection() {

        String expectedMessage = "Invalid email address";
        Assert.assertTrue(loginPage.forgotPasswordErrorMessage.getText().contains(expectedMessage));

    }

    @And("User enter unregistered email into the forgot your password email input box")
    public void userEnterUnregisteredEmailIntoTheForgotYourPasswordEmailInputBox() {

        loginPage.forgotPasswordEmailInputBox.sendKeys("sdetsdet@asian.com");
    }


    @Then("Verify that “Unregistered email address.” message can be displayed on forgot your password section")
    public void verifyThatUnregisteredEmailAddressMessageCanBeDisplayedOnForgotYourPasswordSection() {

        String expectedMessage = "Unregistered email address";
        Assert.assertTrue(loginPage.forgotPasswordErrorMessage.getText().contains(expectedMessage));

    }


    @When("User click the Korean language option")
    public void userClickTheKoreanLanguageOption() {

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(loginPage.languageEnglish).perform();
        loginPage.languageKorean.click();


    }

    @Then("Verify that Korean words can be displayed on the login part")
    public void verifyThatKoreanWordsCanBeDisplayedOnTheLoginPart(List<String> words) {

        System.out.println(loginPage.signInIntoYourAccountLoginWord.getText());
        Assert.assertTrue(loginPage.signInIntoYourAccountLoginWord.getText().equals(words.get(0)));

        System.out.println(loginPage.emailLoginWord.getText());
        Assert.assertTrue(loginPage.emailLoginWord.getText().equals(words.get(1)));

        System.out.println(loginPage.passwordLoginKoreanWord.getText());
        Assert.assertTrue(loginPage.passwordLoginKoreanWord.getText().equals(words.get(2)));

        System.out.println(loginPage.rememberMeLoginKoreanWord.getText().trim());
        Assert.assertTrue(loginPage.rememberMeLoginKoreanWord.getText().trim().equals(words.get(3)));

        System.out.println(loginPage.forgotPasswordLink.getText());
        Assert.assertTrue(loginPage.forgotPasswordLink.getText().equals(words.get(4)));

        System.out.println(loginPage.signInButton.getAttribute("value"));
        Assert.assertTrue(loginPage.signInButton.getAttribute("value").equals(words.get(5)));

        System.out.println(loginPage.registerTab.getText());
        Assert.assertTrue(loginPage.registerTab.getText().equals(words.get(6)));


    }

    @When("User click the Japanese language option")
    public void userClickTheJapaneseLanguageOption() {

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(loginPage.languageEnglish).perform();
        loginPage.languageJapanese.click();

    }

    @Then("Verify that Japanese words can be displayed on the login part")
    public void verifyThatJapaneseWordsCanBeDisplayedOnTheLoginPart(List<String> words) {

        System.out.println(loginPage.signInIntoYourAccountLoginWord.getText());
        Assert.assertTrue(loginPage.signInIntoYourAccountLoginWord.getText().equals(words.get(0)));

        System.out.println(loginPage.emailLoginJapaneseWord.getText());
        Assert.assertTrue(loginPage.emailLoginJapaneseWord.getText().equals(words.get(1)));

    }

    @When("User click the Chinese language option")
    public void userClickTheChineseLanguageOption() {

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(loginPage.languageEnglish).perform();
        loginPage.languageChinese.click();
    }

    @Then("Verify that Chinese words can be displayed on the login part")
    public void verifyThatChineseWordsCanBeDisplayedOnTheLoginPart(List<String> words) {

        System.out.println(loginPage.signInIntoYourAccountLoginWord.getText());
        Assert.assertTrue(loginPage.signInIntoYourAccountLoginWord.getText().equals(words.get(0)));

        System.out.println(loginPage.emailLoginWord.getText());
        Assert.assertTrue(loginPage.emailLoginWord.getText().equals(words.get(1)));
    }

    @And("User enter an invalid email into the register email inputBox")
    public void userEnter_AnInvalidEmailIntoTheRegisterEmailInputBox() {

        loginPage.emailRegisterInputBox.sendKeys("ggg@gmail");

    }

    @And("User enter a {string} into the password input box")
    public void userEnterAIntoThePasswordInputBox(String password) {
        loginPage.passwordRegisterInputBox.sendKeys(password);
    }

    @And("User re-enter the {string} into the input box")
    public void userReEnterTheIntoTheInputBox(String password) {

        loginPage.passwordConfirmInputBox.sendKeys(password);
    }

    @Then("Verify that user cannot land on homepage")
    public void verifyThatUserCannotLandOnHomepage() {

        String expectedURL = "console";
        Assert.assertFalse(Driver.getDriver().getCurrentUrl().contains(expectedURL));
    }


    @When("User enter an invalid email {string} into the email input box")
    public void userEnterAnInvalidEmailIntoTheEmailInputBox(String email) {
        loginPage.emailSignInInputBox.sendKeys(email);
    }

    @And("User enter a valid password {string} into the password input box")
    public void userEnterAValidPasswordIntoThePasswordInputBox(String password) {

        loginPage.passwordSignInInputBox.sendKeys(password);
    }
}
