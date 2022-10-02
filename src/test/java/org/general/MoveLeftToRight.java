package org.general;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MoveLeftToRight {

    WebDriver driver;
    @Test
    public void moveCursorLeftToRight(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stackoverflow.com/questions/33094727/selenium-scroll-till-end-of-the-page");
        //(//pre[@class='lang-js s-code-block'])[1]
        WebElement element=driver.findElement(By.xpath("(//pre[@class='lang-js s-code-block'])[2]"));
        //WebElement element=driver.findElement(By.xpath("//span[text()='var scroll =  document.documentElement.scrollHeight;window.scrollTo(0, scroll); return scroll;']"));
        JavascriptExecutor jse1=(JavascriptExecutor)driver;
        //String script1="arguments[0].scrollIntoView(true)";
        String script1="window.scrollTo(0,1500)";
        jse1.executeScript(script1,element);

        JavascriptExecutor jse=(JavascriptExecutor) driver;
        //String script="arguments[0].scrollIntoView(true);";
        String script="arguments[0].scrollBy(500,0)";
        jse.executeScript(script,element);
    }
}
