package org.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    
}
