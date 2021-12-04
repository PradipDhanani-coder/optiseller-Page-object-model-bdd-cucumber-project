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
public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    WebElement _allowCoookie;
    @FindBy(partialLinkText = "Sign")
    WebElement _signInFeature;




    public void clickOnSignInButton(){
        Reporter.addStepLog("Clicking on Sign In button " + _signInFeature.toString());
        clickOnElement(_signInFeature);
        log.info("Clicking on Sign In button " + _signInFeature.toString());
    }
    public void clickOnAllowCookieButton(){
        Reporter.addStepLog("Clicking on Allow Cookie button " + _allowCoookie.toString());
        clickOnElement(_allowCoookie);
        log.info("Clicking on Allow Cookie button " + _allowCoookie.toString());
    }


}
