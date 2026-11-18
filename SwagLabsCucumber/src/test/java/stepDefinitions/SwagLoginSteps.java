package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class SwagLoginSteps
{
	WebDriver driver;
	@Given("user is on SwagLabs Login Page")
	public void user_is_on_swag_labs_login_page() throws InterruptedException 
	{
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}
	@When("user enters valid username {string}")
	public void user_enters_valid_username(String username) throws InterruptedException 
	{
		driver.findElement(By.tagName("input")).sendKeys("username");
		Thread.sleep(2000);
	}
	@And("user enters valid password {string}")
	public void user_enters_valid_password(String password) throws InterruptedException 
	{
		driver.findElement(By.name("password")).sendKeys("password");
		Thread.sleep(2000);
	}
	@And("user clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException 
	{
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		Thread.sleep(2000);
	}
	@Then("user should be redirect to Products page")
	public void user_should_be_redirect_to_products_page() throws InterruptedException 
	{
		driver.getCurrentUrl().contains("inventory.html");
		System.out.println("Login Success");
		driver.close();
		Thread.sleep(2000);
	}

}
