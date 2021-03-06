package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/resources"},  //Path of feature file
		glue =     {"stepDef"},            //path of step definition
		plugin = {"pretty","html:target/cucumber-html-report",  "json:target/cucumber.json"},
		monochrome = true,  //display the console in a proper readable format
		dryRun  = false//check the mapping is proper between the feature file and step def file

		)
public class TestRunner {

}
