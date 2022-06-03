package TestRunnerCA;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/FeatureCA", glue = {"StepDefinitionCA","HooksApplied"}, tags = { "@test1" }, plugin = {"pretty", "html:Reports/CucumberReport"}, monochrome = true)

public class RunnerAPI extends AbstractTestNGCucumberTests {

}
