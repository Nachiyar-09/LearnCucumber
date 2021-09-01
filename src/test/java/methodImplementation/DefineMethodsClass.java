package methodImplementation;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import applicationPages.LoginPageClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DefineMethodsClass {
	
		WebDriver driver;
	    String URL = "https://opensource-demo.orangehrmlive.com";
	    String ActualTitle = "OrangeHRM";
	    String VerifyLandingPage;
	    LoginPageClass objlogin;
	    
	  
		
	
		public void confirmTitle(){
			String title = driver.getTitle();
			if(ActualTitle.contentEquals(title))
			   System.out.println("Title Matches! Login Successfull!!");
			else
				System.out.println("Title not matches!");
		
			}
		public void setUsernameandPassword(String username, String password)
		{
			objlogin.Username.sendKeys(username);
			objlogin.Password.sendKeys(password);
			objlogin.LoginButton.click();}
			
		public void LandingPageValidation(){
			
			 VerifyLandingPage = objlogin.Welcomeoption.getText();
			if(VerifyLandingPage=="Welcome")
				System.out.println("User is in Landing page!!");
			else
				System.out.println("Oops user is not in landing page");}
		
		
		}
		
