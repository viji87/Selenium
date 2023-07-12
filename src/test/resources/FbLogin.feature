@Feature3
Feature: To validate login function of Amazon Application

Background:
Given To Launch the browser and maximize window

@smoke1
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

@sticky1
Scenario Outline:  To validate positive and negative combination of login functionality
When user has to hit the facebook url
And user has to pass the data "<emailData>"in email field
And user has to pass the data "<passwordData>"in password field
And user has to click the login button
Then user has to close the browser

Examples:
|emailData           | passwordData |
|mvijitha87@gmail.com| inmakes      |
|devyashvin@gmail.com| selenium     |
|abc@gmail.com       | 8976590      |
|selenium@gmail.com  | 2098765      |
|vijitha88@yahoo.com | selenium     |






