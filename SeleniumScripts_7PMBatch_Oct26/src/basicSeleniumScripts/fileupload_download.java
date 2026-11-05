package basicSeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload_download 
{
	 WebDriver driver;
	public void fileupload() throws InterruptedException
	{	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		Thread.sleep(1000);
		WebElement browse=driver.findElement(By.id("input-4"));
		//browse.sendKeys("C:\\Users\\HP\\OneDrive\\Pictures\\134356469600071741.jpg");
		browse.sendKeys("C:\\Users\\HP\\OneDrive\\Pictures\\134356469600071741.jpg");
		browse.sendKeys("C:\\Users\\HP\\OneDrive\\Pictures\\134356469600071741.jpg");
		browse.sendKeys("C:\\Users\\HP\\OneDrive\\Pictures\\134356469600071741.jpg");
	
	}

	public void download()
	{
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		fileupload_download file=new fileupload_download();
		file.fileupload();
	}
}
