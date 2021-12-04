package com.optiseller.cucumber.stepdef;

import com.optiseller.pages.HomePage;
import com.optiseller.pages.SignInPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Pradip
 */
public class SignInTest {
    @Given("^I am on Optiseller Home page$")
    public void iAmOnOptisellerHomePage() {
        new HomePage().clickOnAllowCookieButton();
    }

    @When("^I click on Sign In button$")
    public void iClickOnSignInButton() {
        new HomePage().clickOnSignInButton();


    }

    @Then("^I should be in Sign In page$")
    public void iShouldBeInSignInPage() {
        Assert.assertEquals(new SignInPage().getSignInToContinueMessage(), "SIGN IN TO CONTINUE");

    }

    @When("^I enter email Address \"([^\"]*)\" on email field$")
    public void iEnterEmailAddressOnEmailField(String emailAddress) {
        new SignInPage().enterEmailAddress(emailAddress);

    }

    @And("^I enter password \"([^\"]*)\" on Password field$")
    public void iEnterPasswordOnPasswordField(String password) {
        new SignInPage().enterPassword(password);

    }

    @And("^I click Sign In button$")
    public void iClickSignInButton() {
        new SignInPage().clickOnSignInBtn();
    }



    @Then("^System should show an error message$")
    public void systemShouldShowAnErrorMessage() {
        Assert.assertEquals(new SignInPage().signInErrorMessage(), "Invalid username or password.");
    }
}
