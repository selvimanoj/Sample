package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
		features="C:\\ProjectPage\\PomProjet3\\src\\test\\java\\com\\feature\\Automation.feature", glue="StepDefinition", dryRun= false, monochrome= true, tags="search")
public class TestRunner {

}
