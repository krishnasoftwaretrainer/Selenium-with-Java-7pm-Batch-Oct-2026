package basicSeleniumScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alerts extends BaseClass
{

	public void Simplealert() throws InterruptedException 
	{
		WebElement alertbox1=driver.findElement(By.xpath("//button[@onclick=\"alertbox()\"]"));
		alertbox1.click();
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();
		
	}
	
	public void Conformationalert() throws InterruptedException 
	{
		WebElement AlertwithOKCancel=driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]"));
		AlertwithOKCancel.click();
		Thread.sleep(2000);
		WebElement displayconfirmbox=driver.findElement(By.xpath("//button[text()=\"click the button to display a confirm box \"]"));
		displayconfirmbox.click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		//alert.accept();
		alert.dismiss();
		
	}
	public void Promptalert() throws InterruptedException 
	{
		WebElement Alertwithtextbox=driver.findElement(By.xpath("//a[@href=\"#Textbox\"]"));
		Alertwithtextbox.click();
		Thread.sleep(1000);
		WebElement promptbox=driver.findElement(By.xpath("//button[text()=\"click the button to demonstrate the prompt box \"]"));
		promptbox.click();
		Thread.sleep(1000);
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(1000);
		alert.sendKeys("Selenium");
		Thread.sleep(1000);
		alert.accept();
		//alert.dismiss();
		WebElement alerttext =driver.findElement(By.id("demo1"));
		System.out.println(alerttext.getText());
		Thread.sleep(1000);
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException 
	{
		BrowserConfg("https://demo.automationtesting.in/Alerts.html");
		Alerts alert=new Alerts();
		//alert.Simplealert();
		//alert.Conformationalert();
		alert.Promptalert();
	}
}
