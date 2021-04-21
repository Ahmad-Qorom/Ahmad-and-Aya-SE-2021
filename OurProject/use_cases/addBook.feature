Feature: Add Book 
This Feature To add book in library by administrator

Scenario:  The Administrator add a book when he logged in 
Given      the administrator is logged in
When       the administrator add a book to the library 
Then       the book will be added to the library and it can borrow and research



Scenario:  The Administrator add a book when he logged out
Given      administrator is not logded in
When       the administrator add a book to the library 
Then       the book will not be added to the library 