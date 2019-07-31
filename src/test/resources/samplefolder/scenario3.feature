Feature: Testme login functonality
Background: Display WELCOME
Given Display welcome message
Scenario Outline: login with valid data
Given user opens TestMeApp on chrome browser
When user enters  "<username>" and "<password>" field

Then click on login button
Then verify login result  success
Examples: 
|username|password|
|Lalitha|Password123|
#|sample123|password123|