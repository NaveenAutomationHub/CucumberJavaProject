Feature: Free CRM DealsPage Test

Scenario: Create New Deals under Deals Page

 Given Login to Free CRM
 When Enter valid username and password
 |naveendommata|Welcome@123|
 Then Go to deals page , enter datails title , company, and salary
 |dealspage|CTS|50000|
        
