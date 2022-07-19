package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class W3ScoolsPage {

	WebDriver driver;

	public W3ScoolsPage(WebDriver driver) {
		this.driver = driver;
	}

	String url = "https://www.w3schools.com/html/html_tables.asp";

	// locators

	By fourthCountry = By.xpath("//table[@id='customers']//child::tr[4]//td[text()='Austria']");

	public void navigate() {
		driver.navigate().to(url);

	}

	public String getFourthCountryText() {
		String FourthCountryText = driver.findElement(fourthCountry).getText();
		return FourthCountryText;
	}


}
