package org.general;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Page1 {
   WebDriver driver=Hooks.driver;
    @BeforeTest
    public void startApps(){
        //WebDriverManager.chromedriver().setup();
        //driver=new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://google.co.in");

    }
    @Test
    public void searchTest(){
        WebElement element=driver.findElement(By.name("q"));

        JavascriptExecutor jse=(JavascriptExecutor)driver;
        String jscript="arguments[0].remove()";
        jse.executeScript(jscript,element);


       /* new WebDriverWait(driver,Duration.ofSeconds(20))
                .ignoring(StaleElementReferenceException.class)
                .ignoring(TimeoutException.class)
                .until(ExpectedConditions.visibilityOf(element))
                .sendKeys("KAZ Online" + Keys.ENTER);
        */
        //  use of function interface

        /*new WebDriverWait(driver,Duration.ofSeconds(20))
                .until(d->d.findElement(By.name("q")));
                element.sendKeys("KAZ Online" + Keys.ENTER);

         */
        // use multiline lambda function
        /*new WebDriverWait(driver,Duration.ofSeconds(20))
                .until(d->{
                    d.navigate().refresh();
                    return d.findElement(By.name("q"));
                        }).sendKeys("Kaz Onlinne"+Keys.ENTER); */
   // element.sendKeys("Kaz Online"+Keys.ENTER);

        new WebDriverWait(driver,Duration.ofSeconds(20))
                .until(d->{
                    if(!d.findElements(By.name("q")).isEmpty()){
                        return d.findElement(By.name("q"));
                    }else {
                        d.navigate().refresh();
                        return null;
                    }
                }).sendKeys("Kaz Onlinne"+Keys.ENTER);

    }
    /*@AfterTest
    public void quitApps(){
    driver.quit();
    }*/
}
