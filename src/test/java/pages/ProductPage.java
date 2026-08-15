package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProductPage {
	
	WebDriver driver;
	private By addtocarebtn = By.id("add-to-cart-2");
	private By cartbtn = By.xpath("//*[@id='store-nav-cart']");
	private By proceedbtn = By.id("proceed-to-checkout-btn");
	public ProductPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Product 
	public void product()
	{
			WebElement element1 = driver.findElement(addtocarebtn);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			//js.executeScript("window.scrollBy(0,9000)");
			Actions actions = new Actions(driver);
			actions.scrollToElement(element1).perform();
			driver.findElement(addtocarebtn).click();
			driver.findElement(cartbtn).click();
			driver.findElement(proceedbtn).click();
	}

}
