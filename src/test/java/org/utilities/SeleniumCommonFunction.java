package org.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumCommonFunction {
    static WebDriverWait wait;
    public static boolean isElementDisplayed(WebDriver driver, By locator){
        wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        return true;
    }
    public static void waitForElementVisibility(WebDriver driver, WebElement element){

    }
    public static void waitForElementVisibility(WebDriver driver, By locatory){

    }
}
