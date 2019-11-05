package myRunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\Training_h2a.06.17\\devils-workspace\\cucjenkins23\\features\\Assessment.feature", 
glue={"Assessment"},
monochrome=true,
plugin= {"pretty","json:target/cucumber.json"}
			)

public class TestRunner {

}

