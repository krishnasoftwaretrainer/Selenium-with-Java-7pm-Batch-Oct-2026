package testngscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwagLoginPage {
	WebDriver driver;
	
	@Test(priority=0)
	public void SwagValidLogin()
	{
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.tagName("input")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		driver.close();
	}
	@Test(priority=1)
	public void SwagInValidLogin()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.tagName("input")).sendKeys("gerer");
		driver.findElement(By.name("password")).sendKeys("ryeeryee");
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		driver.close();
	}
	@Test(priority=2)
	public void SwagBlankLogin()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.tagName("input")).sendKeys("");
		driver.findElement(By.name("password")).sendKeys("");
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		driver.close();
	}
}
