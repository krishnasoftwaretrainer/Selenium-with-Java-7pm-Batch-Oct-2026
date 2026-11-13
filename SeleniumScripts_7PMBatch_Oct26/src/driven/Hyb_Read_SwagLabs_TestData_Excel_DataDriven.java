package driven;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Hyb_Read_SwagLabs_TestData_Excel_DataDriven 
{
    XSSFWorkbook workbook;
    XSSFSheet sheet;

    // Constructor
    public Hyb_Read_SwagLabs_TestData_Excel_DataDriven(String excelSheetPath) throws IOException 
    {
        try (FileInputStream inputstream = new FileInputStream(excelSheetPath))
        {
            workbook = new XSSFWorkbook(inputstream);
        }
    }

    // Method-1: Read Excel Data
    public String getExcelData(int SheetIndex, int rows, int columns)
    {
        sheet = workbook.getSheetAt(SheetIndex);

        if (sheet.getRow(rows) == null || sheet.getRow(rows).getCell(columns) == null)
        {
            return "";
        }

        DataFormatter formatter = new DataFormatter();

        String data = formatter.formatCellValue(sheet.getRow(rows).getCell(columns));

        return data;
    }

    // Method-2: Get Row Count
    public int getRowCount(int SheetIndex)
    {
        int rowcount = workbook.getSheetAt(SheetIndex).getLastRowNum();

        rowcount = rowcount + 1;

        return rowcount;
    }

}


