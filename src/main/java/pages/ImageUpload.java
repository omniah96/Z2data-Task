package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ImageUpload {
	
	WebDriver driver;
	String url = "http://the-internet.herokuapp.com/upload";
	String filePath = "C:\\Users\\AFQ-EG-LPTP-111\\Desktop\\ISTQB Certificate.jpg";
	
	public ImageUpload(WebDriver driver) {
		this.driver=driver;
	}
	

	public void navigate() {
		driver.navigate().to(url);
	}
	
	//locators
	By browse = By.id("file-upload");
	By uploadButton = By.id("file-submit");
	
	
	//actions
	public void uploadImage() {
		driver.findElement(browse).sendKeys(filePath);
		driver.findElement(uploadButton).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
