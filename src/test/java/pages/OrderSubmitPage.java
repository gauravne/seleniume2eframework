package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class OrderSubmitPage {
	
	WebDriver driver;
	public OrderSubmitPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public void ordersubmit()
	{
		String actualtext = "Order Placed Successfully!";
		Assert.assertEquals(actualtext, "Order Placed Successfully!");
	
	}


}
