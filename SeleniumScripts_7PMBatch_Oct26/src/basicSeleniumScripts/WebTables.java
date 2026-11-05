package basicSeleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
		Thread.sleep(2000);
		//Header Rows Count
		/* int hrcount=driver.findElements(By.xpath("//table//thead/tr")).size();
		System.out.println("Head rows count:"+hrcount);
		
		//Header Columns Count
		int hcolcount=driver.findElements(By.xpath("//table//thead/tr/th")).size();
		System.out.println("Head columns count:"+hcolcount);
		
		//Print Body Rows Count
		int brcount=driver.findElements(By.xpath("//table//tbody/tr")).size();
		System.out.println("Body rows count:"+brcount);
		
		//Print Body Columns Count
		int bcolcount=driver.findElements(By.xpath("//table//tbody/tr/td")).size();
		System.out.println("Body columns count:"+bcolcount);
		
		//Specfic Cell Data
		String cdata=driver.findElement(By.xpath("//table//tbody/tr[2]/td[4]")).getText();
		System.out.println("Column Value:"+cdata); */
		
		//Print Specific Row
		/*
		List<WebElement> rowsize=driver.findElements(By.xpath("//table//tbody/tr[2]/td"));
		
		for(int i=0;i<rowsize.size();i++) //SR MC or MR SC , MR MC 
		{
			String rowvalue=rowsize.get(i).getText();
			System.out.println(rowvalue);
		} */
		
		//Print All Table Data Outer:Rows Inner:Columns 
		
		List<WebElement> rowsize=driver.findElements(By.xpath("//table//tbody/tr"));
		
		for(int i=1;i<rowsize.size();i++) //SR MC or MR SC , MR MC 
		{
		List<WebElement> columsize=driver.findElements(By.xpath("//table//tbody/tr/td"));
			for(int j=0;j<columsize.size();j++)
			{
				String tabledata=driver.findElement(By.xpath("//table//tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(tabledata);	
			}
		}
		
		
		Thread.sleep(1000);
		driver.close();

	}

}
