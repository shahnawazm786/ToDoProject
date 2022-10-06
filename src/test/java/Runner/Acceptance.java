package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "ava.org.steps",
        tags = "amazon"
)
public class Acceptance extends AbstractTestNGCucumberTests {
}
