package step_definations;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeaturesFiles",glue="step_definations",tags={"@smoke"}, plugin={"html:target/cucumber-html-report","json:target/cucumber-json-report","pretty:target/cucumber-pretty-report","usage:target/cucumber-usage-report","junit:target/cucumber-junit-report"})
public class Runner {

}
