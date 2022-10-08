package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "org.steps",
        tags = "@@mobilelink",
        monochrome = true,
        plugin = {"html:target/cucumber/report.html"}
)
public class Acceptance extends AbstractTestNGCucumberTests {
}
