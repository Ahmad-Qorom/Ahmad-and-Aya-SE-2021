Feature: search book
Scenario: Searching for a substring of the title  
Given i want to search by substrig titel
When i complet action Boolean.parseBoolean("true")
Then i have result


Scenario: Searching for a substring of the author
Given i want to search by substrig author
When i complet action about author Boolean.parseBoolean("true")
Then i have result about author



Scenario: Searching for a substring of the ISBN
Given i want to search by substrig ISBN
When i complet action about ISBN Boolean.parseBoolean("true")
Then i have result about ISBN


Scenario: Searching for a substring of the signature
Given i want to search by substrig signature
When i complet action about signature Boolean.parseBoolean("true")
Then i have result about signature


Scenario: Searching for a substring when logged in
Given i want to search by substrig in library when logged in
When i complet action about search when logged in Boolean.parseBoolean("true")
Then i have result about search when logged in





Scenario: Searching for a subject when no books match 
Given i want to search by subject when no books match 
When i complet action by subject Boolean.parseBoolean("true")
Then i dont have result for a subject


Scenario: Searching for a substring 
Given i want to search by substrig 
When i complet action  Boolean.parseBoolean("true")
Then i dont have result for a substring