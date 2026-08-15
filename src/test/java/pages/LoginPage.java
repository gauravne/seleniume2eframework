package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basics.BaseTest;

public class LoginPage {
	

	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	//WebDriver driver;
	private By usernametext = By.id("login-email");
	private By passwordtext = By.id("login-password");
	private By loginbtn = By.id("login-submit-btn");
	
	public void Applogin(String username,String password)
	{
		driver.findElement(usernametext).sendKeys(username);
		driver.findElement(passwordtext).sendKeys(password);
		driver.findElement(loginbtn).click();
		
	}

}
