package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

import java.util.Random;

public class LoginPage extends Utility {
    By loginToAccText=By.xpath("//h3[contains(text(),'Log in to your account')]");
    By emailField=By.id("email");
    By continueBtn=By.xpath("//span[contains(text(),'Continue')]");

    public String verifyLogInToYourAccountText(){
        return getTextFromElement(loginToAccText);
    }
    public void sendEmailToEmailIdField(){
        Random randomGenerator = new Random();// random generator class
        int randomInt = randomGenerator.nextInt(1000);
        sendTextToElement(emailField,"username" + randomInt + "@gmail.com");
    }
    public void clickOnContinueBtn(){
        clickOnElement(continueBtn);
    }
}
