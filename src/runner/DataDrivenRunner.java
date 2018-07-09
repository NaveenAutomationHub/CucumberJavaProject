package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features={"features/DataDrivenWithMaps.feature"},
glue={"stepDefination"},
format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, 
dryRun=false,
monochrome=true
)
public class DataDrivenRunner {

}
