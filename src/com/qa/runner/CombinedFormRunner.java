package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features={"C://Users/Naveen.Dommata/Desktop/CucumberProjectUsingDataTables/src/com/qa/features/combinedForm.feature"},
glue={"com/qa/stepdefinations"},
format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, 
dryRun= false,
monochrome=true
)
public class CombinedFormRunner {

}
