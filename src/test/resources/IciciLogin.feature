Feature: To validate login function of ICICI Bank application

Background:
To launch the browser and maximize window

@sanity
Scenario: To validate login with valid userid and password
Given  To launch browser and maximize window
When To launch the URL of ICICI bank login page
And To click the login button
And To pass the valid userid
And To pass the valid password
Then  close the browser

@sticky
Scenario: to open the myntra page
When to launch the URL of Myntra page
Then To check whether it is working or not 
