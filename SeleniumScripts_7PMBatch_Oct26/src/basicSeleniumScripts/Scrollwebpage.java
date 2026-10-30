package basicSeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Scrollwebpage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		/*
		js.executeScript("window.scrollBy(0,300)"); //To to Bottom
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-300)"); //Bottom to Top 
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(300,0)"); //Left to Right
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-300,0)"); //Right to Left
		*/
		
		//Specific WebElement
		WebElement Submit=driver.findElement(By.id("submitbtn"));
		js.executeScript("arguments[0].scrollIntoView(true)",Submit);
		
	}

}
