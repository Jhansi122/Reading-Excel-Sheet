package excelData;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public ExcelDataConfig (String excelPath)
	{
		try
		{
			File src= new File(excelPath);
			FileInputStream fis = new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
		} 
           catch (Exception e) 
		{
			System.out.println("Exception" +e.getMessage());
		}
		
	}
	
      public String getData(int sheetNumber, int row, int col)
      {
    	  sheet = wb.getSheetAt(sheetNumber);
    	  String data= sheet.getRow(row).getCell(col).getStringCellValue();
    	  return data;
      }
}


	








































