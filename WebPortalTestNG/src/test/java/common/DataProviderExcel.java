package common;

import org.testng.annotations.DataProvider;

import utilities.ExcelUtils;

public class DataProviderExcel {
	@DataProvider(name = "dataSetXls")
	public Object[][] getDataSetExcelUserNamePassword() {
		String path		 = System.getProperty("user.dir");
		String excelPath = path+"/excel/dataSet.xls";
		String sheetName = "Feuil1";
		return dataSetExcel(excelPath, sheetName);
	}
	
	public static Object[][] dataSetExcel(String excelPath, String sheetName) {

		ExcelUtils excelFile = new ExcelUtils(excelPath, sheetName);
		int rowCount = excelFile.getRowCount();
		int colCount = excelFile.getColCount();

		Object[][] testData = new Object[rowCount - 1][colCount];

		// we start from 1 because we need to ignore the header
		for (int i = 1; i < excelFile.getRowCount(); i++) {
			for (int j = 0; j < 2; j++) {
				testData[i-1][j] = excelFile.getCellData(i, j);
			}
		}
		return testData;
	}

}