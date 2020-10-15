package common;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderDemo {
	@DataProvider(name="dataSet")
	public Object[][] dataSet1(Method m) {
		
		Object[][] testData = null;
		
		if(m.getName().equals("test")) {
			testData = new Object[][]{
				{"user1","pass1"},
				{"user2","pass2"},
				{"user3","pass3"},
				{"user4","pass4"},
			};
		}
		else if(m.getName().equals("test1")) {
			testData = new Object[][]{
				{"user1","pass1","test1"},
				{"user2","pass2","test2"},
				{"user3","pass3","test3"},
				{"user4","pass4","test4"},
			};
		}
		return testData;
	}
	
//	@DataProvider(name="dataSet")
//	public Object[][] dataSet2() {
//		Object[][] dataSet = new Object[4][2];
//		
//		//first row
//		dataSet[0][0] = "user1";
//		dataSet[0][1] = "pass1";
//		
//		//second row
//		dataSet[1][0] = "user2";
//		dataSet[1][1] = "pass2";
//
//		//third row
//		dataSet[2][0] = "user3";
//		dataSet[2][1] = "pass3";
//
//		//forth row
//		dataSet[3][0] = "user4";
//		dataSet[3][1] = "pass4";
//		
//		return dataSet;
//	}
}
