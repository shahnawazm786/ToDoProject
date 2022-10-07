package org;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerClassExampleInSelenium {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://amazon.in");
        List<WebElement> elements=driver.findElements(By.xpath("//a"));
        /*for(int i=0; i<elements.size();i++){
            System.out.println(elements.get(i).getText());
        }*/
        Consumer<WebElement> consumer=(element)-> System.out.println(element.getText());
        elements.forEach(consumer);
        // Multiline Consumer for remove blanks
        Consumer<WebElement> consumer1= (element)->{
            if(!element.getText().isEmpty()){
                System.out.println(element.getText());
            }
        };
        elements.forEach(consumer1);
        driver.quit();
    }
}
