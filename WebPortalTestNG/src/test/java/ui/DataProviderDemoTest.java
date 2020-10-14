package ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemoTest {

	@Test(dataProvider = "dataSet")
	public void test(String usrName, String pswd) {
		System.out.println(usrName+"        "+pswd);
	}
	
	@Test(dataProvider = "withName")
	public void test1(String usrName, String pswd, String tst) {
		System.out.println(usrName+"        "+pswd+"        "+tst);
	}
	
	@DataProvider(name="withName")
	public Object[][] dataSet1() {
		 return new Object[][]{
			{"user1","pass1","test1"},
			{"user2","pass2","test2"},
			{"user3","pass3","test3"},
			{"user4","pass4","test4"},
		};
	}
	
	@DataProvider
	public Object[][] dataSet2() {
		Object[][] dataSet = new Object[4][2];
		
		//first row
		dataSet[0][0] = "user1";
		dataSet[0][1] = "pass1";
		
		//second row
		dataSet[1][0] = "user2";
		dataSet[1][1] = "pass2";

		//third row
		dataSet[2][0] = "user3";
		dataSet[2][1] = "pass3";

		//forth row
		dataSet[3][0] = "user4";
		dataSet[3][1] = "pass4";
		
		return dataSet;
	}
	
}
