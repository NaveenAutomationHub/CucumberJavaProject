Feature: Free CRM Test with DataDriven Using Maps

Scenario: Create DataDriven testing using Maps 

 Given Login to Free CRM
 When Enter valid username and password
 |username|password|
 |naveendommata|Welcome@123|
 Then Go to deals page , enter datails title , company, and salary
 |firstname|lastname|amount|
 |dealspage|CTS|50000|
 |newdealspage|WF|60000|
 |newdeal|CG|20000|
        
