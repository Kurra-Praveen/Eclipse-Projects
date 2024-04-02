package utility;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	XSSFWorkbook workBook;

	XSSFSheet sheet;

	public ExcelData(String sheetName) {

		File file = new File("./src/test/resources/excelTestData.xlsx");

		try {
			FileInputStream fis = new FileInputStream(file);

			workBook = new XSSFWorkbook(fis);

		} catch (IOException e) {

			System.out.println("Unable to access file");

			e.printStackTrace();
		}
		sheet = workBook.getSheet(sheetName);

	}

}
