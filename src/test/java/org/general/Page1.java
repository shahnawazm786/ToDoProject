package org.general;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Page1 {
    WebDriver driver;
    @BeforeTest
    public void startApps(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://google.co.in");

    }
    @Test
    public void searchTest(){
        WebElement element=driver.findElement(By.name("q"));
        new WebDriverWait(driver,Duration.ofSeconds(20))
                .until(ExpectedConditions.visibilityOf(element))
                .sendKeys("KAZ Online" + Keys.ENTER);
    }
    @AfterTest
    public void quitApps(){
    //driver.quit();
    }
}
