Feature: Navigate to TideUS and check features 

Scenario: Log IN 

Given Initialize the browser with chrome 

 
When The user navigates to login page 
And  Enter his email id and password 
And  Click on Log In
Then he is logged into his account 
Then first test case is passed


Given Initialize the browser with chrome 
 And  The user clicks on register and navigates to register page 
When The user click on sign up now 
And Enter his name  email id and password 
Then he has signed up 

Scenario: Recover Password
 Given The user navigates to login page
When Clicks on Forgot Password 
And  Enter a valid  email id  to receive a link for password recovery 
And Click on submit
Then The user receives the password recovery link via mail 
When the user navigates through the link received via email
Then The System enables the user to set a new password 



Scenario: Search functionality
Given Initialize the browser with chrome 
 Given  The user is navigated to homepage
And Enter his search key in the  search box and press enter
Then he is navigated to the page with searched items 
And   search results are shown


Scenario: Latest News
Given Initialize the browser with chrome 
 Given  The user is navigated to homepage
And he clicks on what’s new 
Then he is navigated to the page with new contents 
And  :  The resulted page is latest news page

Scenario: Take the pledge 
Given The user is navigated to homepage
And he click on learn more in the top segment 
Then he is navigated to the page with Take the pledge button 
When  he clicks on the button 
Then  He has taken the pledge and thank you message is generated 


Scenario: shop products
Given The user is navigated to homepage
And he click on shop product in the top segment  and select powder
Then  he is navigated to the page with powder retailer details 
When   he clicks on find the retailer  the button 
Then   the results are displayed