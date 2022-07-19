package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	String url = "https://www.google.com";
	// locators
	By searchBox = By.xpath("//input[@name='q']");
	By searchSecondResult = By.xpath("//div[@class='TbwUpd NJjxre']//cite[@class='iUh30 qLRx3b tjvcx']//span[text()='https://www.javatpoint.com']");
	By searchThirdResult = By.xpath("//div[@class='TbwUpd NJjxre']//cite[@class='iUh30 qLRx3b tjvcx']//span[text()='https://www.tutorialspoint.com']");

	// actions

	public void navigate() {
		driver.navigate().to(url);
	}

	public void searchMethod() {
		driver.findElement(searchBox).sendKeys("Selenium Tutorial" + Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public String getSearchResult() {

		String searchSecondResultText = driver.findElement(searchSecondResult).getText();
		return searchSecondResultText;
	}

	public String getSearchResultSecond() {

		String searchThirdResultText = driver.findElement(searchThirdResult).getText();
		return searchThirdResultText;
	}

}
