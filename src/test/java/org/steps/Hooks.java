package org.steps;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
    @Before
    public void setup(){
        String browser=System.getenv("browser");
        if(browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
        }
        else if(browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
        }

    }
}
