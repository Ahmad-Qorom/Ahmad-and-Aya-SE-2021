package test_libraryProject;
import static org.junit.Assert.assertTrue;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import library_project.ProductionCode2;
//import java.util.ArrayList;

public class addBookSteps
{
	private boolean loggedIn;
    private static ProductionCode2 book=null;	
	private boolean done=false;
    
	public addBookSteps(ProductionCode2 book)
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
	       done= book.addBook("Software Engineer","Haya Sam","somm2011", "2011111111");	
	       done= book.addBook("Java","Sommerville", "somm2011", "2011222222");
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
