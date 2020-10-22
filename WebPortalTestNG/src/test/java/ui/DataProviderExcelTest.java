package ui;

import org.testng.annotations.Test;

public class DataProviderExcelTest {

	@Test(dataProvider = "dataSetXls",dataProviderClass = common.DataProviderExcel.class)
	public void test(String usrName, String pswd) {
		System.out.println(usrName+"        "+pswd);
	}
		
}
