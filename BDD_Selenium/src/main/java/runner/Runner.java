package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = "featureFiles",
		glue="stepdefinitions", dryRun = false
		,plugin = "html:target/output.html",
		tags="@actitime"
)
public class Runner extends AbstractTestNGCucumberTests {

}
