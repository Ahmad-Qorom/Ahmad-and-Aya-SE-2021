package test_libraryProject;
import static org.junit.Assert.assertTrue;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import library_project.productionCode;

public class test_Admin_login
{
	
	private boolean password;
	private productionCode z;
	
	public test_Admin_login(productionCode z) 
	{
		this.z = z;
	}

	@Given("Admin not log in")
	public void admin_not_log_in() 
	{
	    System.out.println("not logging yet");
	}

	@When("Admin assert valid credentials")
	public void admin_assert_valid_credentials()
	{
	    password=z.iscorrect(true);
	}

	@Then("Admin will log in in his account")
	public void admin_will_log_in_in_his_account()
	{
	    assertTrue(password);
	}

	@When("Admin assert wrong password")
	public void admin_assert_wrong_password()
	{
	    password=z.iscorrect(false);
	}

	@Then("Admin will not lon in in his account")
	public void admin_will_not_lon_in_in_his_account() 
	{
	    assertTrue(!password);
	}

}
