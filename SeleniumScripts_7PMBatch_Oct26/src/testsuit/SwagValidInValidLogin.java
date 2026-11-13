package testsuit;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

public class SwagValidInValidLogin extends BrowserConfig {


	@Test(priority=1)
	public void SwaglabsValidInValidLogin() throws InterruptedException
	{
		driver.findElement(By.tagName("input")).clear();
		driver.findElement(By.tagName("input")).sendKeys("standard_user");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("dfhdhd");
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		Thread.sleep(2000);
	}
}
