package ui;

import org.testng.annotations.Test;

public class DataProviderDemoTest {

	@Test(dataProvider = "dataSet",dataProviderClass = common.DataProviderDemo.class)
	public void test(String usrName, String pswd) {
		System.out.println(usrName+"        "+pswd);
	}
	
	@Test(dataProvider = "dataSet",dataProviderClass = common.DataProviderDemo.class)
	public void test1(String usrName, String pswd, String tst) {
		System.out.println(usrName+"        "+pswd+"        "+tst);
	}
	
}
