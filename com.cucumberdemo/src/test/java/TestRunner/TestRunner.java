package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:feature"
		,glue={"C:\\Users\\Admin\\eclipse-workspace\\com.cucumberdemo\\src\\test\\java\\Stepdefinition"},
		plugin={"pretty","html:target/cucumber-report.html"},
		monochrome = true
		)
public class TestRunner {

}

