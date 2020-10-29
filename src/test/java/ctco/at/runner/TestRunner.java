package ctco.at.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"ctco.at.stepDefs", "ctco.at.hooks"}
)
public class TestRunner {

}
