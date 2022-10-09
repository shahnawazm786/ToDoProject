package org.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks {
    public static WebDriver driver;
    @Before
    public void setup(){
        /*String browser=System.getenv("browser");
        if(browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
        }
        else if(browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
        }*/
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://amazon.in");

    }
    @After
    public void cleanUp(Scenario scenario){
        if(scenario.isFailed()){
            String name=scenario.getName().replace(" ","_");
            TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
            byte[] screen=takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screen,"img/png",name);
        }
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
