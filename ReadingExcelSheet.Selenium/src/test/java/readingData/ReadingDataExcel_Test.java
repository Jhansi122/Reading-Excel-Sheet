package readingData;

import excelData.ExcelDataConfig;

public class ReadingDataExcel_Test {

public static void main(String args[]) {
	

	
	
		ExcelDataConfig ex = new ExcelDataConfig("C:\\Program Files\\Selenium\\WorkBook.xlsx\\");
		System.out.println("Data is " +ex.getData(0, 0, 0));
		
		
	
	
}

}