package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\vishnu\\eclipse-workspace\\Cucumber Projects\\datatable.feature",
		glue = {"stepDefinitionDataTable"})
public class TestRunnerDatatable {

}
