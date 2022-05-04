package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class CategoriesPage extends Utility {
    By categoriesText = By.xpath("//div[@class='list-container']/h1");
    By hotDealCategoriesText=By.id("page-title");
    By sortBy=By.xpath("//div[@class='sort-box']/div");
    By nameAtoZ=By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[5]/a");
    By sortByDropDownText=By.xpath("//span[@class='sort-by-value']");
    By namePriceLowHigh=By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[3]/a");
    By ratesFromSaleDropDown=By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[7]/a");
    By nameZtoA=By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[5]/a");
    By highToLow=By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[3]/a");
    By ratesFromBestSellerDropDown=By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[6]/a");
    By nameAtoZFromBestSellerDropDown=By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[4]/a");

    public String getCategoriesText() {
        return getTextFromElement(categoriesText);
    }
    public String getTextFromHotDealCategoriesPage(){
        return getTextFromElement(hotDealCategoriesText);
    }
    public void mouseHoverToSortBy(){
        mouseHoverToElement(sortBy);
    }
    public void clickOnNameAtoZFromSortBy(){
        mouseHoverToElementAndClick(nameAtoZ);
    }
    public String getTextFromSortByDropDown(){
        return getTextFromElement(sortByDropDownText);
    }
    public void clickOnNamePriceLowHighFromDropDown(){
        clickOnElement(namePriceLowHigh);
    }
    public void clickOnRatesFromDropDown(){
        clickOnElement(ratesFromSaleDropDown);
    }
    public void clickOnNameZtoA(){
        clickOnElement(nameZtoA);
    }
    public void clickOnHighToLow(){
        clickOnElement(highToLow);
    }
    public void clickOnRatesFromSortBestSellersDropdown(){
        clickOnElement(ratesFromBestSellerDropDown);
    }
    public void clickOnNameAtoZFromBestSellersDropDown(){
        clickOnElement(nameAtoZFromBestSellerDropDown);
    }
}
