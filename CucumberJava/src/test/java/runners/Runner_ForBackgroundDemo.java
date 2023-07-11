package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\features\\BackgroundDemo.feature",
glue = {"stepDefinitions"},
monochrome = true,
plugin= {"pretty","html:target/HTMLReports/report.html",
"json:target/JSONReports/report.json",
"junit:target/JUnitReport/report.xml"
}

)
public class Runner_ForBackgroundDemo {

}
