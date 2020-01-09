package Tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class TestRunner_BDD {
	
	
	@RunWith(Cucumber.class)
	@CucumberOptions(features ="C:\\EclipseProjects\\MavenProject\\src\\test\\resources\\BDD_Feature",
	                 glue = {"C:\\EclipseProjects\\MavenProject\\src\\test\\java\\stepDefinations"},
	plugin={ "json:target/cucumber.json",
	"html:target/site/cucumber-pretty"})
	public class TestRunner {
	}

	

}
