package org.page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.utilities.SeleniumCommonFunction;

import static org.testng.Assert.*;

public class MobilePageObject {
    WebDriver driver;
    final static Logger logger= LoggerFactory.getLogger(MobilePageObject.class);
    public  MobilePageObject(WebDriver driver){
        logger.info("Object creation start----------------------");
        this.driver=driver;
        PageFactory.initElements(driver,this);
        logger.info("Object created ----------------------");

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
        logger.info("Verify Mobile Link----------------------");
        assertEquals(true, SeleniumCommonFunction.isElementDisplayed(driver,mobileLink1));
        logger.info("Mobile Link Verified ------------------------");
    }
    public void clickOnMobileLink(){
        logger.info("Click on Mobile Link");
        driver.findElement(mobileLink1).click();
        logger.info("Clicked on Mobile---------------");
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
