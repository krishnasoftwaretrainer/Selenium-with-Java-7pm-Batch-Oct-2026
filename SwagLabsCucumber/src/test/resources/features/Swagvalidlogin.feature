Feature:SwagLabs Login Functionality 
Scenario:SwagLabs Valid Login

Given user is on SwagLabs Login Page 
When user enters valid username "standard_user" 
And user enters valid password "secret_sauce"
And user clicks on login button
Then user should be redirect to Products page