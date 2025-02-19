package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/test2.feature",
        glue = {"stepDefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestRunner2 {
}
