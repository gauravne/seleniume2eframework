package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CheckoutPage {

	WebDriver driver;
	By shipaddresstext = By.id("ship-address1");
	By citytext = By.id("ship-city");
	By statetext = By.id("ship-state");
	By zipcode = By.id("ship-zip");
	By payondelivery = By.id("pay-cod-label");
	By ordernotes = By.id("order-notes");
	By orderplacebtn = By.id("place-order-btn");
	public CheckoutPage(WebDriver driver) {
		this.driver = driver;

	}

	public void checkoutdetails() {
		driver.findElement(shipaddresstext).sendKeys("kharadi");
		driver.findElement(citytext).sendKeys("Pune");
		driver.findElement(statetext).sendKeys("Maha");
		driver.findElement(zipcode).sendKeys("123456");
		Actions actions = new Actions(driver);
		WebElement element2 = driver.findElement(payondelivery);
		actions.scrollToElement(element2).perform();
		driver.findElement(payondelivery).click();
		driver.findElement(ordernotes).sendKeys("Hello My order");

		WebElement element3 = driver.findElement(orderplacebtn);
		actions.scrollToElement(element3).perform();
		driver.findElement(orderplacebtn).click();
	}

}
