package Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(
   //path of feature file
   features = {"src/main/resources/Feature/ex1.feature"},
   //path of step definition file
   glue = "StepDefi",
		    plugin = {"pretty", "html:target/cucumber-reports.html"},
		    monochrome =true,
		    dryRun =true 
		    
  
  
   
   )
public class Testrunner {

}
