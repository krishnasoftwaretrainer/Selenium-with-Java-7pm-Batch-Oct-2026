package dataDrivenFrameWork;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class SwagValidLogin_Properties {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
FileInputStream fis=new FileInputStream("D:\\QT\\eclipseprograms\\QT_Oct7PMBatch\\SeleniumScripts_7PMBatch_Oct26\\src\\dataDrivenFrameWork\\swagdata.properties");
		
		Properties prop=new Properties();
		prop.load(fis);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("swagurl"));
		Thread.sleep(2000);
		
		WebElement susername=driver.findElement(By.id(prop.getProperty("usernameLocatorID")));
		WebElement spassword=driver.findElement(By.id(prop.getProperty("passwordLocatorID")));
		WebElement slogin=driver.findElement(By.id(prop.getProperty("loginbuttonLocatorID")));
		
		susername.sendKeys(prop.getProperty("username"));
		spassword.sendKeys(prop.getProperty("password"));
		slogin.click();
			
		/*
		FileInputStream fis=new FileInputStream("D:\\QT\\eclipseprograms\\QT_Oct7PMBatch\\SeleniumScripts_7PMBatch_Oct26\\src\\dataDrivenFrameWork\\swagdata.properties");
		
		Properties prop=new Properties();
		prop.load(fis);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.tagName("input")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		*/
	}
}
