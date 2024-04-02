package runner;


import org.testng.annotations.Test;

import reusable.BaseClass;
import utilities.ExcelData;

public class AmazonMenuTest extends BaseClass {

	@Test(dataProvider = "excelData",dataProviderClass = ExcelData.class)
	public void testOne(String categeory,String subcategeory) {
		
		test=reports.createTest(this.getClass().getName()).assignAuthor("Praveen");
		
		products.clickMenu();
		
		try {
			products.clickCategeory(categeory);
			
			products.clickSubCategeory(subcategeory);
			
		} catch (Exception e) {
			
			testOne(categeory, subcategeory);
		}
		System.out.println("Sucessful..");
		
		
	}
}
