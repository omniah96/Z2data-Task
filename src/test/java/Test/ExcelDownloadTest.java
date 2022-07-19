package Test;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import data.ExcelReader;
import pages.ExcelDownloadPage;
import pages.ExcelDownloadPageConfirmation;

public class ExcelDownloadTest extends BaseTest {

	ExcelDownloadPage exopject;
	ExcelDownloadPageConfirmation exConfirmationopj;

	ExcelReader exropj;

	@Test
	public void excelDownloadTest() throws IOException {

		exopject = new ExcelDownloadPage(driver);
		exConfirmationopj = new ExcelDownloadPageConfirmation(driver);
		exopject.navigate();
		
		exopject.scrollWithJs();
		
		exopject.clickDownloadButton();
		exopject.clickXicon();
		/*Alert promptAlert = driver.switchTo().alert();
		promptAlert.dismiss();*/
	

		exConfirmationopj.clickConfirmationButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		exropj.getFileInputStream();
		int colCount = exropj.getExcelData();
		System.out.println(colCount);
		Assert.assertEquals(colCount, 36);

	}	
	
}
