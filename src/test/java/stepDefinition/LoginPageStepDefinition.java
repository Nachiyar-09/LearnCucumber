package stepDefinition;

import java.sql.Driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import methodImplementation.DefineMethodsClass;
import net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition;


public class LoginPageStepDefinition {
      WebDriver driver;
      String URL = "https://opensource-demo.orangehrmlive.com";
	DefineMethodsClass objmethod;
	@Before
	public void InitialSetUp(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);}
	
	@Given("^user navigates to the URL$")
	public void user_navigates_to_the_URL() {
	    // Write code here that turns the phrase above into concrete actions
	  
	   objmethod.confirmTitle();
	}

	@When("^user provides the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_provides_the_and(String username, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    objmethod.setUsernameandPassword(username, password);
	    
	}

	@Then("^user should navigate to application$")
	public void user_should_navigate_to_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    objmethod.LandingPageValidation();}


}
