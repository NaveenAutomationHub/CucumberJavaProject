package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features={"features/tagging.feature"},
glue={"stepDefination"},
format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, 
dryRun=false,
monochrome=true,
tags={"~@End2EndTest" , "~@SmokeTest", "~@RegressionTest"}
)
public class TaggingRunner {

	
	
}



// ORed : tags ={"@SmokeTest , @End2EndTest" } execute all test cases tagged as @SmokeTest, @End2EndTest

//ANDed : tags ={"@SmokeTest" , "@End2EndTest" } execute all test cases tagged as @SmokeTest and @End2EndTest

// ~ : is used to skip/ignore the tags(~@SmokeTest)