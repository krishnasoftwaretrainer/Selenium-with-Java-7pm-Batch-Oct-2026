package testngscripts;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNGAnnotations 
{
	WebDriver driver;
	
	@BeforeMethod
	//@BeforeTest
	//@BeforeClass
	public void BrowserConfig() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}
	@Test(priority=0)
	public void SwagValidLogin()
	{
		driver.findElement(By.tagName("input")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
	}
	@Test(priority=1)
	public void SwagInValidLogin() throws InterruptedException
	{		
		driver.findElement(By.tagName("input")).sendKeys("gerer");
		driver.findElement(By.name("password")).sendKeys("ryeeryee");
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void SwagBlankLogin()
	{
		driver.findElement(By.tagName("input")).sendKeys("");
		driver.findElement(By.name("password")).sendKeys("");
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		
	}
	@AfterMethod
	//@AfterTest
	//@AfterClass
	public void BrowserTeardown()
	{
		driver.close();		
	}

}
