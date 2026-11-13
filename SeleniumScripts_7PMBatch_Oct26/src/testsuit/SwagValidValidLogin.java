package testsuit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SwagValidValidLogin extends BrowserConfig
{
	//WebDriver driver;
	@Test(priority=0)
	public void SwaglabsValidValidLogin() throws InterruptedException
	{
		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.tagName("input")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		driver.navigate().back();
		Thread.sleep(2000);
	}
}
