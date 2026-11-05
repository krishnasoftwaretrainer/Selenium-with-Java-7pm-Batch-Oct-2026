package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
		//Header Rows
		int rowcolumns = driver.findElements(By.xpath("//table//thead/tr/th")).size();
		System.out.println("Header Rows:"+rowcolumns);

		//Total Body Rows
//		int rows = driver.findElements(By.xpath("//table//tbody/tr")).size();
//		System.out.println("Total Body Rows: " + rows);

		//Total Body Columns
//		int columns = driver.findElements(By.xpath("//table//tbody/tr[1]/td")).size();
//		System.out.println("Total Body Columns: " + columns);

//		// Print a specific cell
//		String data1 = driver.findElement(By.xpath("//table//tbody/tr[2]/td[3]")).getText();
//		System.out.println(data1);

		// Print a specific row
//
//		List<WebElement> row = driver.findElements(By.xpath("//table//tbody/tr[2]/td"));
//
//		for (int r = 1; r < row.size(); r++) 
//		{
//			String rvalue=row.get(r).getText();
//			System.out.println(rvalue);
//		}

//		// Print all rows and columns.
//		List<WebElement> rows1 = driver.findElements(By.xpath("//table//tbody/tr"));
//
//		for (int r = 1; r <= rows1.size(); r++) 
//		{
//		List<WebElement> columns2 = driver.findElements(By.xpath("//table//tbody/tr[" + r + "]/td"));
//
//			for (int c = 1; c <= columns2.size(); c++) {
//				String value = driver.findElement(By.xpath("//table//tbody/tr[" + r + "]/td[" + c + "]")).getText();
//
//				System.out.print(value + "  ");
//			}
//
//			System.out.println();
//		}
		driver.close();
	}

}
