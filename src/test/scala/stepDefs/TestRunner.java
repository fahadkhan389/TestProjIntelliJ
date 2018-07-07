package stepDefs;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:Test.feature",glue = "classpath:stepDefs",plugin = "html:target/selenium-reports")
public class TestRunner {
}
