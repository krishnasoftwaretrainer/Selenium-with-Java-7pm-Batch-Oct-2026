package testngscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DataProvider_SwagAllLogin {

	@DataProvider(name = "SwagTestData")
	public Object[][] SwagLoginData() {
		return new Object[][] { 
			{ "standard_user", "secret_sauce" }, 
			{ "standard_user", "gdfhdfh" },
				{ "sdgsdg", "vsgs" }, 
				{ "", "" }, 
				};
	}

	WebDriver driver;

	@BeforeMethod
	public void BrowserConfig() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}

	@Test(dataProvider = "SwagTestData")
	public void SwagLoginPage(String susername, String spassword) throws InterruptedException 
	{
		driver.findElement(By.tagName("input")).sendKeys(susername);
		driver.findElement(By.name("password")).sendKeys(spassword);
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		Thread.sleep(2000);
	}

	@AfterMethod
	public void BrowserTeardown() {
		driver.close();
	}
}
