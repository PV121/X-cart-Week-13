package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class SecureCheckOut extends Utility {
    By verifyTitle=By.xpath("//div[@class='checkout-block']/h1");
    By firstName=By.id("shippingaddress-firstname");
    By lastName=By.id("shippingaddress-lastname");
    By address=By.id("shippingaddress-street");
    By countryfield = By.id("shippingaddress-country-code");
    By state=By.id("shippingaddress-custom-state");
    By checkBox=By.xpath("//div[@class='subbox create checkbox']/label/input");
    By password=By.id("password");
    By localShipping=By.xpath("//ul[@class=\"shipping-rates\"]/li[2]/div/label/input");
    By cod=By.id("pmethod6");
    By total=By.xpath("//div[@class='total clearfix']/span/span");
    By placeOrder=By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/button[1]");
    By title=By.id("page-title");

    public String verifySecureCheckoutTitle(){
        return getTextFromElement(verifyTitle);
    }
    public void firstNameField(String fName){
        sendTextToElement(firstName,fName);
    }
    public void lastNameField(String lName){
        sendTextToElement(lastName,lName);
    }
    public void addressField(String add){
        sendTextToElement(address,add);
    }
    public void countryfield(String country){ sendTextToElement(countryfield,country);}
    public void stateField(String stateName){
        sendTextToElement(state,stateName);
    }
    public void clickOnCreateAccountCheckBox(){
        clickOnElement(checkBox);
    }
    public void passwordField(String pass){
        sendTextToElement(password,pass);
    }
    public void clickOnLocalShippingCheckBox(){
        // clickOnElement(localShipping);
        mouseHoverToElement(localShipping);
        mouseHoverToElementAndClick(localShipping);
    }
    public void clickOnCodCheckBox(){
        // clickOnElement(cod);
        mouseHoverToElement(cod);
        mouseHoverToElementAndClick(cod);
    }
    public String verifyTotal(){
        return getTextFromElement(total);
    }
    public void clickOnPlaceOrder(){
        clickOnElement(placeOrder);
    }
    public String verifyThankYouText(){
        return getTextFromElement(title);
    }
}
