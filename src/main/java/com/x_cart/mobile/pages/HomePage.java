package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By shippingTab=By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[3]/a");
    By newTab=By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[4]/a");
    By comingSoonTab=By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[5]/a");
    By contactUsTab=By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[6]/a");
    By hotDealLink=By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]");
    By saleLink=By.xpath("//li[@class='leaf has-sub']/ul/li[1]");
    By bestSellersLink=By.xpath("//li[@class='leaf has-sub']/ul/li[2]");

    public void clickOnShippingTab(){
        clickOnElement(shippingTab);
    }
    public void clickOnNewTab(){
        clickOnElement(newTab);
    }
    public void clickOnComingSoonTab(){
        clickOnElement(comingSoonTab);
    }
    public void clickOnContactUs(){
        clickOnElement(contactUsTab);
    }
    public void clickOnSaleLinkFromHotDealDropDown() throws InterruptedException {
        mouseHoverToElement(hotDealLink);
        mouseHoverToElementAndClick(saleLink);
    }
    public void clickOnBestSellersFromHotDealDropDown(){
        mouseHoverToElement(hotDealLink);
        mouseHoverToElementAndClick(bestSellersLink);
    }
}
