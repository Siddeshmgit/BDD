Feature: DataDrivenTesting
Scenario: Passing data directly
Given User is present in orangeHrm login page "https://opensource-demo.orangehrmlive.com/"
When User enters username and password as "Admin" , "admin123"
#Given He enters 7
#Given He runs 12.5 km per day

Scenario: Passing data using data table with example
Given User is present in Orange HRM Login page
When he enters "<username>" and "<password>"
And he clicks on submit button
Then Login succesfully should be displayed
Examples:
|username|password|
|Admin|admin123|
|admin|manager|
