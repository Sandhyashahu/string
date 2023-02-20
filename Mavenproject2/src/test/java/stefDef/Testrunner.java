package stefDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/resources/Features",
glue= {"stepDef"}, 
monochrome=true,
plugin={"pretty","html:target/HTMLReport"}, 
tags="@regression")

public class Testrunner {
	
	
}
