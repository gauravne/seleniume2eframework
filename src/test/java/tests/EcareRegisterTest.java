package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class EcareRegisterTest {
	
	@Test
	public void EcareRegister() throws InterruptedException {
	
		WebDriver driver = new EdgeDriver();
		WebDriverManager.edgedriver().setup();
		
		driver.get("http://localhost:3000/store/");
		driver.manage().window().maximize();
		driver.findElement(By.id("store-nav-register")).click();
		
		
		driver.findElement(By.xpath("//input[@id='reg-first-name']")).sendKeys("AI");
		driver.findElement(By.xpath("//input[@id='reg-last-name']")).sendKeys("Automation");
		driver.findElement(By.id("reg-email")).sendKeys("gaurav.neware@gmail.com");
		driver.findElement(By.id("reg-phone")).sendKeys("9843324322");
		//driver.findElement(By.id("reg-dob")).sendKeys("09-08-2000");
		WebElement date = driver.findElement(By.id("reg-dob"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='2000-08-09';", date);
		driver.findElement(By.id("reg-password")).sendKeys("Admin@123");
		driver.findElement(By.id("reg-confirm-password")).sendKeys("Admin@123");
	//	js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//input[@id='reg-terms']")));
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='reg-terms']")).click();
		driver.findElement(By.id("reg-gdpr-consent")).click();
		driver.findElement(By.id("reg-submit-btn")).click();
		//driver.quit();

	}

}
