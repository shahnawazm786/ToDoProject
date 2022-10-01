package org.general;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Page3 {
    @Test
    public void lambdaFunctionExample(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://amazon.in");

        driver.findElements(By.xpath("//a"))
                .stream()
                .map(e->e.getText())
                .filter(s->!s.isEmpty() || s!=null)
                .distinct()
                .sorted()
                .filter(s->s.startsWith("C")||s.startsWith("D"))
                        .forEach(s->System.out.println(s));
            driver.quit();
    }
}
