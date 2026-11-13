package exceloperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel_Operations 
{

	//@Test
	public void SingleSheetsCreation() throws IOException
	{
		File file=new File("D:\\Selenium7pmBatch\\ExcelOperations\\SampleSheet.xlsx");
		FileOutputStream fileout=new FileOutputStream(file);
		
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet("Sample Sheet1");
		System.out.println("Sheet Created");
		wb.write(fileout);
		wb.close();
		
	}
	//@Test
	public void MultipleSheetsCreation() throws IOException
	{
		File file=new File("D:\\Selenium7pmBatch\\ExcelOperations\\SampleSheet.xlsx");
		FileOutputStream fileout=new FileOutputStream(file);
		
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet1=wb.createSheet("Sample Sheet1");
		XSSFSheet sheet2=wb.createSheet("Sample Sheet2");
		XSSFSheet sheet3=wb.createSheet("Sample Sheet3");
		XSSFSheet sheet4=wb.createSheet("Sample Sheet4");
		XSSFSheet sheet5=wb.createSheet("Sample Sheet5");
		System.out.println("Sheets Created");
		wb.write(fileout);
		wb.close();
		
	}
	
	//@Test
	public void WriteData() throws IOException
	{
		File file=new File("D:\\Selenium7pmBatch\\ExcelOperations\\SampleSheet.xlsx");
		FileOutputStream fileout=new FileOutputStream(file);
		
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet1=wb.createSheet("Sample Sheet1");
		XSSFRow row1=sheet1.createRow(5);
		row1.createCell(3).setCellValue("Krishna");
		
		System.out.println("Data Written Success");
		wb.write(fileout);
		wb.close();
		
	}
	
	//@Test
	public void WriteSetsOfData() throws IOException
	{
		File file=new File("D:\\Selenium7pmBatch\\ExcelOperations\\SampleSheet.xlsx");
		FileOutputStream fileout=new FileOutputStream(file);
		
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet1=wb.createSheet("Sample Sheet1");
		XSSFRow row1=sheet1.createRow(5);
		row1.createCell(0).setCellValue("Krishna");
		row1.createCell(1).setCellValue("Krishna");
		row1.createCell(2).setCellValue("Krishna");
		row1.createCell(3).setCellValue("Krishna");
		row1.createCell(4).setCellValue("Krishna");
		
		XSSFRow row2=sheet1.createRow(8);
		row2.createCell(0).setCellValue("Krishna");
		row2.createCell(1).setCellValue("Krishna");
		row2.createCell(2).setCellValue("Krishna");
		row2.createCell(3).setCellValue("Krishna");
		row2.createCell(4).setCellValue("Krishna");
		System.out.println("Data Written Success");
		wb.write(fileout);
		wb.close();
		
	}
	

@Test
public void ReadData() throws IOException {

    String filepath = "D:\\Selenium7pmBatch\\ExcelOperations\\ReadData.xlsx";

    FileInputStream file = new FileInputStream(filepath);

    XSSFWorkbook wb = new XSSFWorkbook(file);

    XSSFSheet sheet1 = wb.getSheet("Sheet1");

    XSSFRow row1 = sheet1.getRow(7);

    XSSFCell cell1 = row1.getCell(0);
    XSSFCell cell2 = row1.getCell(1);
    XSSFCell cell3 = row1.getCell(2);
    XSSFCell cell4 = row1.getCell(3);
    System.out.println(cell1.getStringCellValue());
    System.out.println(cell2.getStringCellValue());
    System.out.println(cell3.getStringCellValue());
    System.out.println(cell4.getStringCellValue());

    wb.close();
    file.close();
}

}
