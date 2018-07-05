Feature: Test Free CRM Login

  Scenario Outline: Test login with valid credentials
    Given Open firefox and start application
    When I enter valid "<username>" and "<password>"
    Then user should be able to login successfully
    Then close the application

    Examples: 
      | username      | password    |
      | naveendommata | Welcome@123 |
      | naveendommata | Welcome@123 |
