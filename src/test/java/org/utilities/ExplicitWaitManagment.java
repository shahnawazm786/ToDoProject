package org.utilities;

import org.general.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitManagment {

    public static WebElement performanceExplicitWait(WaitStrategy waitStrategy, By by){
        WebElement element=null;
        if(waitStrategy==WaitStrategy.CLICKABLE){
            element= new WebDriverWait(Hooks.driver, Duration.ofSeconds(20))
                    .ignoring(NoSuchElementException.class)
                    .until(ExpectedConditions.elementToBeClickable(by));
        }
        else if(waitStrategy==WaitStrategy.PERSENCE){
            element= new WebDriverWait(Hooks.driver, Duration.ofSeconds(20))
                    .ignoring(NoSuchElementException.class)
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
        }
        else if(waitStrategy==WaitStrategy.HANDLESTALEELEMENT){
            element= new WebDriverWait(Hooks.driver, Duration.ofSeconds(20))
                    .ignoring(NoSuchElementException.class)
                    .until(ExpectedConditions.elementToBeClickable(by));
        }
        return element;
    }
}
