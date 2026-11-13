package testngscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertions {

WebDriver driver;
	
	@Test(priority=0)
	public void SwagValidLogin()
	{
		SoftAssert soft=new SoftAssert();
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.tagName("input")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce1");
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		String exceptedURL="https://www.saucedemo.com/inventory.html";
		String actuvalURL=driver.getCurrentUrl();
//		Assert.assertEquals(actuvalURL, exceptedURL);  //Hard
		soft.assertEquals(actuvalURL, exceptedURL);  //Soft 
		driver.close();
		soft.assertAll();
	}
}
