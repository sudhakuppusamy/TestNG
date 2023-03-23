package org.runner;

import org.junit.runner.RunWith; 

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\Vasanth_Home\\eclipse-workspace\\Cucumber\\src\\test\\java\\feature"	,glue = "org.stepdefinition",
dryRun = false,
monochrome= true,
publish =false)
//tags= "@demoqa")
//plugin = {"pretty","html:target/cucmberReport.html", "json:target/cucmberReport.json","html:target/cucmberReport.xml","rerun:target/rerun.txt"})

public class Runner {

}
//3.141.59
//4.6.0