package testsuit;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

public class SwagInValidValidLogin extends BrowserConfig {

	
	@Test(priority=2)
	public void SwaglabsInValidvalidLogin() throws InterruptedException
	{
		driver.findElement(By.tagName("input")).clear();
		driver.findElement(By.tagName("input")).sendKeys("gerer");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		Thread.sleep(2000);
	}
}
