package testsuit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BrowserConfig 
{
	public static WebDriver driver;
	@BeforeSuite
	public void BrowserOpen()
	{
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	@AfterSuite
	public void BrowserClose()
	{
		driver.close();
	}
}
