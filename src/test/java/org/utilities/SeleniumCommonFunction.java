package org.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class SeleniumCommonFunction {
    static WebDriverWait wait;
    public static boolean isElementDisplayed(WebDriver driver, By locator){
        wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.ignoring(NoSuchElementException.class, IllegalStateException.class);
        return wait.until(d->d.findElement(locator).isDisplayed());
    }
    public static boolean isElementDisplayed(WebDriver driver, WebElement element){
        wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.ignoring(NoSuchElementException.class, IllegalStateException.class);
        return wait.until(d->element.isDisplayed());
}

    public static void waitForElementVisibility(WebDriver driver, WebElement element){

    }
    public static void waitForElementVisibility(WebDriver driver, By locatory){

    }
    public static void clickElement(WebDriver driver,By locator){
        wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.ignoring(NoSuchElementException.class, IllegalStateException.class);
        wait.until(d->d.findElement(locator)).click();
    }
}
