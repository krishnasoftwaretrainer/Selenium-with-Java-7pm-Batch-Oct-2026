package basicSeleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		//int a=10 String name="Krishna";
		/*firstname.sendKeys("Krishna");
		Thread.sleep(2000);
		WebElement lastname=driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
		lastname.sendKeys("Rao \n Ramesh");
		WebElement address=driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]"));
		address.sendKeys("Ameerpet,\nHyderabad,\n500010");
		
		
		//Radio Button
		WebElement maleradio=driver.findElement(By.xpath("//input[@value=\"Male\"]"));
		maleradio.click();
		Thread.sleep(2000);
		WebElement femaleradio=driver.findElement(By.xpath("//input[@value=\"FeMale\"]"));
		femaleradio.click();
		*/
		/*
		WebElement cricketcheck=driver.findElement(By.id("checkbox1"));
		
//		cricketcheck.click();
//		Thread.sleep(2000);
//		
		if(!cricketcheck.isSelected() && cricketcheck.isEnabled() &&cricketcheck.isDisplayed())
		{
			cricketcheck.click();
			System.out.println("I am Clicked");
			
		}
		else
		{
			System.out.println("Already Selected");
		}
		*/
		/*
		List<WebElement> cricketcheck=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		
		
		for(int i=0;i<cricketcheck.size();i++)
		{
			if(!cricketcheck.get(i).isSelected() && cricketcheck.get(i).isEnabled() &&cricketcheck.get(i).isDisplayed())
			{
			cricketcheck.get(i).click();
			Thread.sleep(2000);
		}
		} */
		
//		firstname.clear();
//		Thread.sleep(2000);
//		firstname.sendKeys("Rama Rao");
		
		/*
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Krishna");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Rama Rao");
		*/
		
		
		
		
		
		
//		//driver.manage().window().minimize();
//		Thread.sleep(2000);
//		driver.manage().window().maximize();

	}

}
