package org.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.SeleniumCommonFunction;

import static org.testng.Assert.*;

public class MobilePageObject {
    WebDriver driver;
    public  MobilePageObject(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    // Element description
    @FindBy(css = "a[data-csa-c-content-id='nav_cs_mobiles']")
    private WebElement mobileLink;
    @FindBy(xpath = "//span[text()='Category']")
    private WebElement catgoryText;

    By mobileLink1=By.cssSelector("a[data-csa-c-content-id='nav_cs_mobiles']");
    By mobileAccessoriesLink=By.xpath("//a//span[text()='Mobile Accessories']");
    By exploreShopByCategoryText=By.cssSelector("//h2[text()='Shop by Category']");
    By exploreByCategoryText=By.xpath("//h2[text()='Explore by category']");
    public void veifyMobileLink(){
        assertEquals(true, SeleniumCommonFunction.isElementDisplayed(driver,mobileLink1));
    }
    public void clickOnMobileLink(){
        driver.findElement(mobileLink1).click();
    }
    public void verifyCatoryText(){
        assertEquals(true, SeleniumCommonFunction.isElementDisplayed(driver,catgoryText));
    }
    public void clickOnMobileAccessoriesLink(){
        SeleniumCommonFunction.clickElement(driver,mobileAccessoriesLink);
    }
    public void verifyBySearchByCategory(){
        assertEquals(true,SeleniumCommonFunction.isElementDisplayed(driver,exploreByCategoryText));
        //assertFalse(true);
    }
}
