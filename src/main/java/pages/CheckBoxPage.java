package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPage {
	
	WebDriver driver;
	
	String url = "http://the-internet.herokuapp.com/checkboxes";
	public CheckBoxPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigate() {
		driver.navigate().to(url);
	}

	By firstBox = By.xpath("//form[@id='checkboxes'][text()=' checkbox 1']");
	By secondBox = By.xpath("//form[@id='checkboxes']//input[2]");
	
	public boolean clickFirstBox() {
	 WebElement c1 = driver.findElement(firstBox);

	 c1.click();
	boolean isDisplayed1 = c1.isDisplayed();
	
	return isDisplayed1;
	
	}
	
	public boolean clickSecondBox() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement c2 = driver.findElement(secondBox);
		 boolean isDisplayed2 = c2.isDisplayed();
		 return isDisplayed2;
	}

}
