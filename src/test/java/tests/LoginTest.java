package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import basics.BaseTest;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.OrderSubmitPage;
import pages.ProductPage;


public class LoginTest extends BaseTest {

	@Test
	public void login () throws InterruptedException
	{
		//Login page
		LoginPage lg = new LoginPage(driver);
		lg.Applogin("Admin@gmail.com", "admin123");
		
		//Product and cart
		ProductPage pp = new ProductPage(driver);
		pp.product();
		
		//checkout details
		CheckoutPage cp = new CheckoutPage(driver);
		cp.checkoutdetails();
		
		//submit order
		OrderSubmitPage order = new OrderSubmitPage(driver);
		order.ordersubmit();
		
	}
	
	
}
