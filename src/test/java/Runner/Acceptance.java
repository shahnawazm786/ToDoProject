package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "org.steps",
        tags = "@mobile",
        monochrome = true,
        plugin = {
        // "pretty"
   //             "html:target/cucumber/cucumber-html-report.html",
   //             "json:target/cucumber/cucumber-json-report.json",
   //             "pretty",
   //             "html:target/cucumber/index.html",
    //            "json:target/cucumber/cucumber.json"
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
)
public class Acceptance extends AbstractTestNGCucumberTests {
}
