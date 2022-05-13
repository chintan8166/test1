package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Training workspace\\Cucumber\\src\\test\\java\\feature\\RememberMe.feature", glue={"stepdefination"},
plugin= {"pretty", "json:target/HTmlreports2.json"},monochrome=true,dryRun=true, tags="@regression and not  @smoke")
public class TestRunner {

}
