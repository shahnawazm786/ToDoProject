package org.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MobilePageObject {
    WebDriver driver;
    public  MobilePageObject(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    
}
