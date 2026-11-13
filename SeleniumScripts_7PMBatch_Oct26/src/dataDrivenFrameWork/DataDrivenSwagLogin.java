package dataDrivenFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenSwagLogin 
{
	WebDriver driver;

	@Test(dataProvider="SwagTestData")
	public void LoginSwag(String susername,String spassword) throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.tagName("input")).sendKeys(susername);
		driver.findElement(By.name("password")).sendKeys(spassword);
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		Thread.sleep(2000);
		driver.close();
	}

	@DataProvider(name = "SwagTestData")
	public Object[][] SwagLoginData() throws IOException {
	
		String exceldatapath="D:\\Selenium7pmBatch\\ExcelOperations\\DataDrivenTestData.xlsx";
		
		ReadExcelTestData_DataDriven testdata=new ReadExcelTestData_DataDriven(exceldatapath);
		
		int rows=testdata.getRowCount(0);
		
		Object[][] credationls=new Object[rows-1][2];
		
		for(int i=1;i<rows;i++)
		{
			credationls[i-1][0]=testdata.getData("Sheet1", i, 0);
			credationls[i-1][1]=testdata.getData("Sheet1", i, 1);
		}
		
		
		return credationls; 
			
	}
}