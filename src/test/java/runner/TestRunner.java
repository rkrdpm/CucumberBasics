package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by Raj on 2/10/17.
 */
@CucumberOptions(features={"src/test/features"},glue="steps", format = {"json:target/cucumber.json","html:target/site/cucumber-pretty"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
