Feature: Test tagged hooks

@First
Scenario: This is a first test
Given this is a first step
When this is a second step
Then this is a third step

@Second
Scenario: This is a second test
Given this is a first step
When this is a second step
Then this is a third step

@Third
Scenario: This is a third test
Given this is a first step
When this is a second step
Then this is a third step