package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class CartPage extends Utility {
    By cartTitle=By.id("page-title");
    By verifySubTotal=By.xpath("//ul[@class='sums']/li/span");
    By verifyTotal=By.xpath("//ul[@class='totals']/li[4]/span");
    By goToCheckOut=By.xpath("//li[@class='button main-button']/button");
    By emptyCart=By.xpath("//div[@class='cart-buttons']/form/a");
    By emptyCartTitle=By.xpath("//div[@class='list-container']/h1");

    public String VerifyYourShoppingCartTitle(){
        return getTextFromElement(cartTitle);
    }
    public String VerifySubTotal(){
        return getTextFromElement(verifySubTotal);
    }
    public String verifyTotal(){
        return getTextFromElement(verifyTotal);
    }
    public void clickOnGoToCheckoutButton(){
        clickOnElement(goToCheckOut);
    }
    public void clickOnEmptyYourCart(){
        clickOnElement(emptyCart);
    }
    public String verifyCartIsEmptyTitle(){
        return getTextFromElement(emptyCartTitle);
    }
}
