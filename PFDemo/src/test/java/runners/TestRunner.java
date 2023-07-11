package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\features", glue= {"stepDefinitions"},
monochrome = true,
plugin = {"pretty","html:target/HtmlReports/report.html",
		"json:target/JSONReports/report.json",
		"junit:target/JUnitReports/reports.xml"}
		)
public class TestRunner {

}
