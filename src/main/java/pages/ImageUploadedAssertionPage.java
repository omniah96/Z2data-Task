package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ImageUploadedAssertionPage {
	
	WebDriver driver;
	
	public ImageUploadedAssertionPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//loctaors
	
	By successMessage = By.xpath("//div[@class='example']//h3[text()='File Uploaded!']");
	
	//actions
	
	public String getSuccessMessage() {
		String successMessageText = driver.findElement(successMessage).getText();
		return successMessageText;
		
	}

}
