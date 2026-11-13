package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class POM_By_Locators 
{
	WebDriver driver;
	@Test
	public void LoginSwag() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		SwagLogin_POM_By pomby=new SwagLogin_POM_By(driver);
	pomby.swaglogin("standard_user","secret_sauce");
	}

}
