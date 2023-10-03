package reading_dataprovider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Excel_data {
	public static FileInputStream ip;
	
	public static XSSFWorkbook workbook ;
	
	public static XSSFSheet sheet;
  
	
	@DataProvider(name = "Rediff")
	
	public Object[][] getRediffExelData() throws IOException {
		Object[][] data = Excel_data.readFromEcel("Login");
		return data;
	}

	public static Object[][] readFromEcel(String sheetName) throws IOException {
		
		ip = new FileInputStream("/home/aditya/Documents/eclipse-workspace/AUTOMATION_PROJECT/src/test/java/reading_dataprovider/Dataprovider.xlsx");
	
		
		
		workbook = new XSSFWorkbook(ip);
		
		
		sheet = workbook.getSheet(sheetName);
		
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[rows][cols];
		
		for (int i = 0; i<rows; i++ ) {
			XSSFRow row = sheet.getRow(i+1);
		
			for (int j = 0; j<cols ; j++) {
				XSSFCell cell = row.getCell(j);
			
				CellType cellType = cell.getCellType();
				
				
					
				}
			}
		
	return data;
	}
}
