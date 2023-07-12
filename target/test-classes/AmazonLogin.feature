@Feature1
Feature:
To validate sign in function of Amazon Application

@smoketest
Scenario: To sign in Amazon Account

Given To launch Browser and maximize window
When To launch URL of Amazon Application
And To click Sign in button
And To pass the email in email field
|mvijitha87@gmail.com|selenium@gmail.com|abc@gmail.com|inmakesinfotech@gmail.com|
And To click the continue button
And To pass the password in textbox field
|aldfkjd|alkfdjkl|dfjkd|kldjfkl|
|32423|3243546|654768|97696|
|vasdf334|dsfsd34|vijiinfotech|fdsfsd34|
And To click the signin button
Then To close the browser 