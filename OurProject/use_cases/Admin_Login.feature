Feature: Admin_Login
This feature to admin login

Scenario: Admin want to log in in his account with valid credentials
Given Admin not log in
When Admin assert valid credentials
Then Admin will log in in his account

Scenario: Admin want to log in in his account with error in password
Given Admin not log in
When Admin assert wrong password
Then Admin will not lon in in his account
