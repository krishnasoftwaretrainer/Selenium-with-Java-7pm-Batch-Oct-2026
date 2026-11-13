package dataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelTestData_DataDriven 
{
	XSSFWorkbook wb;
	public ReadExcelTestData_DataDriven(String excelpath) throws IOException
	{
		FileInputStream fis=new FileInputStream(excelpath);
		 wb =new XSSFWorkbook(fis);
	}
	
	public String getData(String SheetName,int row,int cell)
	{
		XSSFSheet sheet=wb.getSheet(SheetName);
		return 
		sheet.getRow(row).getCell(cell).toString();
	}
	
	public int getRowCount(int SheetNumber)
	{
		return 
				wb.getSheetAt(SheetNumber)
		.getLastRowNum()+1;
	}
}
