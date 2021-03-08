package test_libraryProject;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith (Cucumber.class)
@CucumberOptions(plugin= "html: a/cucumber.html", features="use_case",glue= {"test_libraryProject"}

)
public class testcase {

}
