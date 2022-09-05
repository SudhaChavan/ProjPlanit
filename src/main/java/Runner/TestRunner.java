package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
//		 features = "./src/main/java/Features/ContactPage.feature",
	features = "./src/main/java/Features", 
		tags = {"@Testing" },
		glue = { "StepDefination" }, 
//		plugin = { "pretty","json:target/cucumber.html" },
				plugin = { "json:target/cucumber.html" },
		format = { "html:test-output" },
		monochrome = true

//		
//		monochrome = true, //display the console output in a proper readable format
//		strict = true, //it will check if any step is not defined in step definition file
//		dryRun = false //to check the mapping is proper between feature file and step def file
//		//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
)

public class TestRunner {

}
