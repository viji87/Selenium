@Feature2
Feature: To validate login function of Amazon Application

Background: 
Given To Launch the browser and maximize window
 
@smoke
Scenario: To validate login with valid email and invalid password
Given To Launch the browser and maximize window
When To launch the URL of amazon application
And To Click the signin button
And To pass the valid email
And To Click the continue button
And To pass the invalid Password
And To Click the Signin Button
And To Check whether navigate home page or not
Then To Close the Browser

@stickyy
Scenario: To validate login with mobile number
When To lauch the URL of flipkart application
And To click the login button
And To Pass the valid mobile number
And To Click the ROTP button
Then To close the Browser

 

