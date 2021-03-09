package test_libraryProject;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith (Cucumber.class)
@CucumberOptions(plugin= "html: html/cucumber.html", features="use_cases",glue= {"test_libraryProject"}

)
public class testcase {

}
