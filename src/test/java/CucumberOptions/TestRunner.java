package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
	@CucumberOptions(
			features= {"src/test/java/Features"},
			glue= "StepDefinitions")
	
	public class TestRunner extends AbstractTestNGCucumberTests{
		//public class TestRunner{
			
		}


