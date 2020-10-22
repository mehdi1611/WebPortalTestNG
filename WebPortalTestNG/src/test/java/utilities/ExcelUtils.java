package utilities;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
//	static String path = System.getProperty("user.dir");
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	
	public ExcelUtils(String excelPath,String sheetName) {
		try {
			workbook	  = new XSSFWorkbook(excelPath);
			sheet		  = workbook.getSheet(sheetName);
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}

	public int getRowCount() {
		int rowCount = 0;
		rowCount 	 = sheet.getPhysicalNumberOfRows();
		return rowCount;
	}

	public int getColCount() {
		int colCount = 0;
		colCount 	 = sheet.getRow(0).getPhysicalNumberOfCells();
		return colCount;
	}
	public String getCellData(int row,int col) {
		String cellData = "";
		cellData = sheet.getRow(row).getCell(col).getStringCellValue();
		return cellData;
	}
	
}
