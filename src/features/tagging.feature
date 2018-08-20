Feature: Free CRM Application testing

@SmokeTest
Scenario: Login with correct username and password
Given This is a valid test

@RegressionTest
Scenario: Login with Incorrect username and password
Given This is a Invalid test

@End2EndTest
Scenario: Create a contact test
Given This is a contact test

@SmokeTest @RegressionTest
Scenario: Create a deals test
Given This is a deals test

@SmokeTest @End2EndTest
Scenario: Create a tasks test
Given This is a tasks test

@RegressionTest @End2EndTest
Scenario: Create a cases test
Given This is a cases test

@SmokeTest
Scenario: Create an email test
Given This is a email test

@End2EndTest
Scenario: Search an email test
Given This is a email test

@SmokeTest
Scenario: Search tasks test
Given This is a tasks test

Scenario: Closing test
Given This is to close the test