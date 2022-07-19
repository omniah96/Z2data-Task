package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExcelDownloadPageConfirmation {
	
	WebDriver driver;
	
	public ExcelDownloadPageConfirmation(WebDriver driver) {
		this.driver = driver;
	}
	
	//locators
	
	By downloadConfirmationButton = By.partialLinkText("Download");
	
	//actions
	public void clickConfirmationButton() {
		
		driver.findElement(downloadConfirmationButton).click();
	}

}
