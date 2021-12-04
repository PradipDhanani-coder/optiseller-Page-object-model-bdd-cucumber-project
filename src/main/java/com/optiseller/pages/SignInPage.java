package com.optiseller.pages;

import com.cucumber.listener.Reporter;
import com.optiseller.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Pradip
 */
public class SignInPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//b[contains(text(),'SIGN IN TO CONTINUE')]")
    WebElement _signInToContinueMessage;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement _emailAddressField;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement _passwordField;
    @FindBy(xpath = "//button[@id='btnLogin']")
    WebElement _clickSignInBtn;
    @FindBy(xpath = "//span[contains(text(),'Invalid username or password.')]")
    WebElement _signInErrorMessage;

    public String getSignInToContinueMessage() {
        Reporter.addStepLog("Getting Sign In To Continue Message " + _signInToContinueMessage.toString());
        log.info("Getting Sign In To Continue Message " + _signInToContinueMessage.toString());
        return getTextFromElement(_signInToContinueMessage);

    }

    public void enterEmailAddress(String emailAddress) {
        Reporter.addStepLog("Enter email Address " + emailAddress + "On Email Field " + _emailAddressField.toString());
        sendTextToElement(_emailAddressField, emailAddress);
        log.info("Enter email " + emailAddress + "On Email Field " + _emailAddressField.toString());
    }
    public void enterPassword(String password) {
        Reporter.addStepLog("Enter password " + password + "On Password Field " + _passwordField.toString());
        sendTextToElement(_passwordField, password);
        log.info("Enter password " + password + "On Password Field " + _passwordField.toString());
    }

    public void clickOnSignInBtn() {
        Reporter.addStepLog("Clicking on Sign In button " + _clickSignInBtn.toString());
        clickOnElement(_clickSignInBtn);
        log.info("Clicking on Sign In button " + _clickSignInBtn.toString());
    }
    public String signInErrorMessage(){
        Reporter.addStepLog("Sign In Error Message " + _signInErrorMessage.toString());
        log.info("Sign In Error Message " + _signInErrorMessage.toString());
        return getTextFromElement(_signInErrorMessage);
    }


}
