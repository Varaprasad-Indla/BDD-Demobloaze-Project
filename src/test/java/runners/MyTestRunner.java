package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {"src/test/resources/Features/Ecommerce.feature"},
    glue = {"StepDefinitions", "Hooks"},
    tags = "@Sanity",
    		plugin = {
    			    "pretty",
    			    "json:target/cucumber.json",
    			    "html:target/cucumber-reports.html",
    			    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    			}
)
public class MyTestRunner extends AbstractTestNGCucumberTests {
}