package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",glue="stepDefinations",
monochrome=true, plugin={"html:target/cucumber3.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
