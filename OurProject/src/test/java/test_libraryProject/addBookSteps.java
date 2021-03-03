package test_libraryProject;
import static org.junit.Assert.assertTrue;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import library_project.productionCode;
//import java.util.ArrayList;

public class addBookSteps
{
	private boolean loggedIn;
    private productionCode book=null;	
	private boolean done=false;
    
	public addBookSteps(productionCode book)
	{
		this.book = book;
	}

	@Given("the administrator is logged in")
	public void the_administrator_is_logged_in()
	{
	   loggedIn=true;
	}

	@When("the administrator add a book to the library")
	public void the_administrator_add_a_book_to_the_library() 
	{
	    if(loggedIn)
	    {
	       done= book.addBook("Software Engineer","Haya Sam","0000", "2020",done);	
	       done= book.addBook("Java","Ashraf Armoosh", "0001", "2019", done);
	     //  book.printBook();
	    }
	}

	@Then("the book will be added to the library and it can borrow and research")
	public void the_book_will_be_added_to_the_library_and_it_can_borrow_and_research()
	{
		  assertTrue(done);
	}

	@Given("administrator is not logded in")
	public void administrator_is_not_logded_in() 
	{
	     loggedIn=false;
	}

	@Then("the book will not be added to the library")
	public void the_book_will_not_be_added_to_the_library() 
	{
		  assertTrue(!loggedIn);
	}

}
