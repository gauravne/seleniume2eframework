package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
	import org.testng.annotations.Test;

	import basics.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginTest extends BaseTest {

	@Test
	public void login () throws InterruptedException
	{
		driver.findElement(By.id("login-email")).sendKeys("Admin@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("admin123");
		driver.findElement(By.id("login-submit-btn")).submit();
		Thread.sleep(1000);
		WebElement element1 = driver.findElement(By.id("add-to-cart-2"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,9000)");
		
		Actions actions = new Actions(driver);
		actions.scrollToElement(element1).perform();
		
		//js.executeScript("arguments[0].scrollIntoView(true);", element);
		driver.findElement(By.id("add-to-cart-2")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='store-nav-cart']")).click();
		driver.findElement(By.id("proceed-to-checkout-btn")).click();
		
		driver.findElement(By.id("ship-address1")).sendKeys("kharadi");
		driver.findElement(By.id("ship-city")).sendKeys("Pune");
		driver.findElement(By.id("ship-state")).sendKeys("Maha");
		driver.findElement(By.id("ship-zip")).sendKeys("123456");
		Thread.sleep(1000);
		WebElement element2 = driver.findElement(By.id("pay-cod-label"));
		actions.scrollToElement(element2).perform();
		driver.findElement(By.id("pay-cod-label")).click();
		driver.findElement(By.id("order-notes")).sendKeys("Hello My order");
		Thread.sleep(1000);
		WebElement element3 = driver.findElement(By.id("place-order-btn"));
		actions.scrollToElement(element3).perform();
		driver.findElement(By.id("place-order-btn")).click();
		
		String actualtext = "Order Placed Successfully!";
		Assert.assertEquals(actualtext, "Order Placed Successfully!");
		Thread.sleep(3000);
		driver.quit();
		
	}		
	
}
