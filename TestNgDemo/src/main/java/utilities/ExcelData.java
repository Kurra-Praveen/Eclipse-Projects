package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelData {

	@DataProvider(name="excel")
	public Object[][] dataread() throws Exception {

		File file = new File("./testData/testData.xlsx");

		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheetAt(0);

		int rows = sheet.getPhysicalNumberOfRows();
		
		int coloums=sheet.getRow(0).getLastCellNum();
		
		System.out.println(rows+" "+coloums);
		
		Object[][]data=new Object[rows-1][coloums];
		
		for(int i=0;i<rows-1;i++) {
			
			for(int j=0;j<coloums;j++) {
								
				data[i][j] = sheet.getRow(i+1).getCell(j).getStringCellValue();
								
				
			}
		}
		
		return data;

	}
}
