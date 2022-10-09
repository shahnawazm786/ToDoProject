package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "org.steps",
        tags = "@mobile",
        monochrome = true,
        plugin = { "pretty",
                "html:target/cucumber/cucumber-html-report",
                "json:target/cucumber/cucumber-json-report.json"
        }
)
public class Acceptance extends AbstractTestNGCucumberTests {
}
