package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwagLogin_POM_By 
{
	WebDriver driver;
	
	public SwagLogin_POM_By(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By UsernameL=By.tagName("input");
	By PasswordL=By.name("password");
	By LoginL=By.xpath("//input[@value=\"Login\"]");
	
	public void enterUsername(String username)
	{
		driver.findElement(UsernameL).sendKeys(username);
	}

	public void enterPassword(String password)
	{
		driver.findElement(PasswordL).sendKeys(password);
	}
	
	public void login()
	{
		driver.findElement(LoginL).click();
	}
	
	public void swaglogin(String username,String password)
	{
		enterUsername(username);
		enterPassword(password);
		login();
	}
}
