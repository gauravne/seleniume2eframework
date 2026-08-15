package basics;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public WebDriver driver; 
	public FileReader fr;
	public Properties p = new Properties();
	
	@BeforeTest
	public void SetUP() throws IOException
	{
		
		if (driver==null)
		{
			FileReader fr = new FileReader("C:\\Drive G\\Framework\\BankingFramework\\seleniume2e\\src\\test\\resources\\config\\config.properties");
			p.load(fr);
	
		}
		if(p.getProperty("browser").equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
			WebDriverManager.edgedriver().setup();
			driver.get(p.getProperty("testurl"));
			driver.manage().window().maximize();
		}
		if(p.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			WebDriverManager.chromedriver().setup();
			driver.get("http://localhost:3000/store/login");
			driver.manage().window().maximize();	
		}
			
	}

	@AfterTest
	public void TearDown()
	{
		driver.quit();
	}
	
}
