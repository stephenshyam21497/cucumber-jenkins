Feature: Login functionality
Description: Registered user login to the application by entering username and password

Mapping: John would like access the online shopping page.He should be registered and should registered credentials to get logged in to the application
Scenario: login with valid data
When user opens newtors applications on chrome browser
When user enters "mercury" in username and password field
When click on signin button
Then verify login result as  success