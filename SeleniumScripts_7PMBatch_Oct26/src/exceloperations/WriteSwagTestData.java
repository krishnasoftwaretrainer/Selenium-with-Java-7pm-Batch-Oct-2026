package exceloperations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteSwagTestData 
{
	public static void main(String[] args) throws IOException {
		
		File file=new File("D:\\Selenium7pmBatch\\ExcelOperations\\SwagTestDataWrite.xlsx");
		FileOutputStream fileout=new FileOutputStream(file);
		
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet1=wb.createSheet("SwagData");
		
		XSSFRow row1=sheet1.createRow(0);
		row1.createCell(0).setCellValue("UserName");
		row1.createCell(1).setCellValue("Password");
		
		XSSFRow row2=sheet1.createRow(1);
		row2.createCell(0).setCellValue("standard_user");
		row2.createCell(1).setCellValue("secret_sauce");
		
		XSSFRow row3=sheet1.createRow(2);
		row3.createCell(0).setCellValue("standard_user");
		row3.createCell(1).setCellValue("invalidpwd");
		
		XSSFRow row4=sheet1.createRow(3);
		row4.createCell(0).setCellValue("invalid_user");
		row4.createCell(1).setCellValue("secret_sauce");
		
		XSSFRow row5=sheet1.createRow(4);
		row5.createCell(0).setCellValue("invalid_user");
		row5.createCell(1).setCellValue("invalidpwd");
				
		System.out.println("Data Written Success");
		wb.write(fileout);
		wb.close();
	}

}
