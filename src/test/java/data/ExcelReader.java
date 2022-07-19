package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	FileInputStream fis = null;
	XSSFWorkbook wb;
	XSSFSheet sheet;

	public FileInputStream getFileInputStream() {

		String filePath = System.getProperty("user.dir") + "/src/test/java/data/gantt-chart_L.xlsx";
		File srcFile = new File(filePath);
		try {
			fis = new FileInputStream(srcFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return fis;
	}

	public int getExcelData() throws IOException {

		fis = getFileInputStream();
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);

		int totalRows = (sheet.getLastRowNum() + 1);
		return totalRows;
		
		//XSSFWorkbook wb = new XSSFWorkbook(fis);
		//wb.close();

	}
	

}
