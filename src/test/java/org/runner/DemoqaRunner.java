package org.runner;

import org.junit.runner.RunWith; 

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\Vasanth_Home\\eclipse-workspace\\Cucumber\\src\\test\\java\\feature\\demoqa.feature"	,glue = "org.stepdefinition",
dryRun = false,
monochrome= true,
publish =false)
//tags= "@demoqa")
public class DemoqaRunner {

}
