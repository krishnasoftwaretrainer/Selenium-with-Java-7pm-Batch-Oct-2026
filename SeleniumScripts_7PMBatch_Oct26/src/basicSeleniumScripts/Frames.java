package basicSeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Frames extends BaseClass
{
	public void singlefarme() throws InterruptedException 
	{
		// 1.By using Index
		// driver.switchTo().frame(0);

		// 2.ID or Name
		// driver.switchTo().frame("SingleFrame");
		// WebElement
		WebElement frame1 = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(frame1);
		Thread.sleep(2000);
		WebElement textbox1 = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		textbox1.sendKeys("Sample1");
	}

	public void nestedfarme() throws InterruptedException 
	{
		BrowserConfg();
		WebElement IframewithinanIframe=driver.findElement(By.xpath("//a[@href=\"#Multiple\"]"));
		IframewithinanIframe.click();
		Thread.sleep(2000);
		
		WebElement Outerframe=driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
		driver.switchTo().frame(Outerframe);
		Thread.sleep(2000);
		WebElement Innerframe=driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]"));
		driver.switchTo().frame(Innerframe);
		Thread.sleep(2000);
	
		WebElement textbox1 = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		textbox1.sendKeys("Sample2");
		Thread.sleep(2000);
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		WebElement singleframe=driver.findElement(By.xpath("//a[@href=\"#Single\"]"));
		singleframe.click();
		
		
	}
	public static void main(String[] args) throws InterruptedException {

		Frames frame=new Frames();
		frame.nestedfarme();
	}

}
