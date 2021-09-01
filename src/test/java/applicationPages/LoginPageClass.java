package applicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageClass {
   WebDriver driver;
   
	@FindBy(id ="txtUsername")
	public static WebElement Username;

	@FindBy(id ="txtPassword")
	public static WebElement Password;
	
	@FindBy(id ="btnLogin")
	public static WebElement LoginButton;
	
	@FindBy(id="welcome")
	public static WebElement Welcomeoption;

	public LoginPageClass(WebDriver driver){
		this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
}
