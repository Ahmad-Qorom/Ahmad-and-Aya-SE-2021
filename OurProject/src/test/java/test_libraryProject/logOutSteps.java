package test_libraryProject;

import static org.junit.Assert.assertTrue;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import library_project.productionCode;

public class logOutSteps 
{
	
	public String s;
	public String exit="Exit";
	private productionCode logOut;
	
	public logOutSteps(productionCode logOut) 
	{
		this.logOut = logOut;
	}

	@Given("Admin login")
	public void admin_login() 
	{
		   s="log in";
	}

	@When("press to logout")
	public void press_to_logout() 
	{
		s=logOut.logOut();
	}

	@Then("Admin logout")
	public void admin_logout() 
	{
		assertTrue(exit.equals(s));
	}
}
