package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class BestSellers extends Utility {
    By ratesDropDown=By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[6]/a");
    By nameAtoZDropDown=By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[4]/a");
    By unicornMeatCan=By.xpath("//ul[@class='products-grid grid-list']/li[5]");
    By addToCartOnProductsFrame=By.xpath("//ul[@class='products-grid grid-list']/li[5]/div/div[2]/div[4]/div/button");
    By verifyProductAddedText=By.xpath("//li[@class='info']");
    By closeXSign=By.xpath("//a[@title='Close']");
    By cartSign=By.xpath("//div[@id='header']/div[4]");
    By clickOnCart=By.xpath("//span[contains(text(),'View cart')]");


    public void clickOnRatesFromSortBestSellersDropdown(){
        clickOnElement(ratesDropDown);
    }
    public void clickOnNameAtoZFromBestSellersDropDown(){
        clickOnElement(nameAtoZDropDown);
    }
    public void mouseHoverToUnicornMeat(){
        mouseHoverToElement(unicornMeatCan);
    }
    public void mouseHoverAndClickOnAddToCartOnFrame(){
        mouseHoverToElementAndClick(addToCartOnProductsFrame);
    }
    public String verifyProductAddedToCartTextOnBestSellersPage(){
        return getTextFromElement(verifyProductAddedText);
    }
    public void clickOnXSign(){
        clickOnElement(closeXSign);
    }
    public void clickOnCartIconAnsClickOnViewCartButton(){
        clickOnElement(cartSign);
        clickOnElement(clickOnCart);
    }

}
