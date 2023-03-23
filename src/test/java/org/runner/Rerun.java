package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="@target/rerun.txt",glue = "org.stepdefinition",
plugin = {"pretty","html:target/cucmberReport.html"})
public class Rerun {

}
