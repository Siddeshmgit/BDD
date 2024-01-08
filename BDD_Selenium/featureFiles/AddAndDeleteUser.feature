@actitime
Feature: Add User
Scenario Outline: Add and delete an user in actitime application 

Given User enters "http://localhost/login.do" in the browser
When Login page is displayed he enters username as "admin" and password as "manager" and he clicks on login btn
Then home page should be displayed 
And the user clicks on User tab
Then User tab page should be displayed 
And he clicks on add user button
And He enters "<firstname>","<lastname>","<email>","<username>", "<password>","<retypePwd>"
And clicks on create user button
Then user should be created
And click on created user 
And click on delete button
Then alert popup should be displayed and click on ok button in the popup
And click on logout button and close the browser

Examples:

|firstname |lastname| email| username |password |retypePwd|
| Dinga| Dingi | dinga@123|DINGA | DINGI | DINGI|