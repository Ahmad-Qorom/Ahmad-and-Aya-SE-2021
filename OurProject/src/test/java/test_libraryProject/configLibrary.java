package test_libraryProject;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)       
@CucumberOptions(plugin="html: Admin_login/test_Login.html",features="use_cases",glue="test_libraryProject") 
public class configLibrary
{

}
