package test_libraryProject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import libraryproject.searchclass;

public class searchbook {
	public	String subject,substring;
		private searchclass s=new searchclass();
		private searchclass s2=new searchclass();
		private searchclass s3=new searchclass();
		private searchclass s4=new searchclass();
		private searchclass s5=new searchclass();
		private searchclass s6=new searchclass();
		private searchclass s7=new searchclass();
		public String str1;
		public String str2;
		public String str3;
		public String str4;
		public String str5;
		public String str6;
		public String str7;
		@Given("^i want to search by substrig titel$")
		public void i_want_to_search_by_substrig_titel() throws Throwable {
			subject="titel";
		   
		}

		@When("^i complet action Boolean\\.parseBoolean\\(\"(.*?)\"\\)$")
		public void i_complet_action_Boolean_parseBoolean(String g)   {
			  substring="Soft";
			 
			str1=s.find(substring,subject).toString();
		
			 System.out.print(str1+"\n");
		}
		

		@Then("^i have result$")
		public  void i_have_result( ) throws Throwable {
		
			Assert.assertTrue(str1.equalsIgnoreCase("found"));
		}

		
		
		
////////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		@Given("i want to search by substrig author")
		public void i_want_to_search_by_substrig_author() {
			subject="author";
		}

		@When("i complet action about author Boolean.parseBoolean\\({string})")
		public void i_complet_action_about_author_boolean_parse_boolean(String string) {
			  substring="Sommerville";
				 
				str2=s2.find(substring,subject).toString();
				
				 System.out.print(str2+"\n");
		}

		@Then("i have result about author")
		public void i_have_result_about_author() {
		    
			Assert.assertTrue(str2.equalsIgnoreCase("found"));
		}
		
		
		

/////////////////////////////////////////////////////////////////////////////////////////////


@Given("i want to search by substrig ISBN")
public void i_want_to_search_by_substrig_isbn() {
	subject="ISBN";
}

@When("i complet action about ISBN Boolean.parseBoolean\\({string})")
public void i_complet_action_about_isbn_boolean_parse_boolean(String string) {
	substring="2011111111";
	 
	str3=s3.find(substring,subject).toString();
	
	 System.out.print(str3+"\n");
}

@Then("i have result about ISBN")
public void i_have_result_about_isbn() {
   
	Assert.assertTrue(str3.equalsIgnoreCase("found"));
}
////////////////////////////////////////////////////////////////////////

@Given("i want to search by substrig signature")
public void i_want_to_search_by_substrig_signature() {
	subject="signature";
}

@When("i complet action about signature Boolean.parseBoolean\\({string})")
public void i_complet_action_about_signature_boolean_parse_boolean(String string) {
	substring="2011";
	 
	str5=s5.find(substring,subject).toString();
	
	 System.out.print(str5+"\n");
}

@Then("i have result about signature")
public void i_have_result_about_signature() {
   
	Assert.assertTrue(str5.equalsIgnoreCase("found"));
}

/////////////////////////////////////////////////////////////

@Given("i want to search by substrig in library when logged in")
public void i_want_to_search_by_substrig_in_library_when_logged_in() {
	subject="signature";
}

@When("i complet action about search when logged in Boolean.parseBoolean\\({string})")
public void i_complet_action_about_search_when_logged_in_boolean_parse_boolean(String string) {
	substring="2011";
	str7=s7.find(substring,subject).toString();
	System.out.print(str7+"\n");
}

@Then("i have result about search when logged in")
public void i_have_result_about_search_when_logged_in() {
	Assert.assertTrue(str7.equalsIgnoreCase("found"));
}





////////////////////////////////////////////////////////////////////

@Given("i want to search by subject when no books match")
public void i_want_to_search_by_subject_when_no_books_match()
 {
	subject="subject";
}

@When("i complet action by subject Boolean.parseBoolean\\({string})")
public void i_complet_action_by_subject_boolean_parse_boolean(String string) {
	substring="0000";
	str6=s6.find(substring,subject).toString();
	
	 System.out.print(str6+"\n"); 
}

@Then("i dont have result for a subject")
public void i_dont_have_result_for_a_subject() {
	Assert.assertTrue(str6.equalsIgnoreCase("found"));
}



///////////////////////////////////////////////////////////////////
@Given("i want to search by substrig")
public void i_want_to_search_by_substrig() {
	subject="substring";
}

@When("i complet action  Boolean.parseBoolean\\({string})")
public void i_complet_action_boolean_parse_boolean(String string) {
	substring="Soft";
	 
 str4 = s4.find(substring,subject).toString();
	
	 System.out.print(str4+"\n");
}

@Then("i dont have result for a substring")
public void i_dont_have_result_for_a_substring() {
   
	Assert.assertTrue(str4.equalsIgnoreCase("found"));
}


}
