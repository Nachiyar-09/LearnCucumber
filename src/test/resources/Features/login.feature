Feature: Login Actions

Scenario Outline: Login with valid credentials
     Given user navigates to the URL 
     When  user provides the "<username>" and "<password>"
     Then  user should navigate to application
     
 Examples:
       | username| password |
       | Admin   | admin123 |
       

     	