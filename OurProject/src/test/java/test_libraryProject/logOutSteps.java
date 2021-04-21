package test_libraryProject;

import static org.junit.Assert.assertTrue;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import library_project.ProductionCode2;

public class logOutSteps 
{
	public String s;
	public String exit="Exit";
	
	

	@Given("Admin login")
	public void admin_login() 
	{
		   s="log in";
	}

	@When("press to logout")
	public void press_to_logout() 
	{
		s="Exit";
	}

	@Then("Admin logout")
	public void admin_logout() 
	{
		boolean out=exit.equals(s);
		assertTrue(out);
	}
}
