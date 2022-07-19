package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ExcelDownloadPage {
	
	WebDriver driver;
	String url = "https://www.vertex42.com/ExcelTemplates/excel-gantt-chart.html";
	public ExcelDownloadPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//locators
	By downloadExcelButton = By.xpath("//a[@class='btnDL'][@href='/Links/go2.php?urlid=file-GanttChart365']");
	By xIcon = By.xpath("//*[@id=\"dismiss-button\"]/div/svg");
	
	//actions
	
	public void navigate() {
		driver.navigate().to(url);
	}
	
	public void scrollWithJs() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//jse.executeScript("scrollBy(0,10000)");
		jse.executeScript("window.scrollBy(0,12000);");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	public void clickDownloadButton() {
	
		driver.findElement(downloadExcelButton).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void clickXicon() {
		
		driver.findElement(xIcon).click();
	}

}
