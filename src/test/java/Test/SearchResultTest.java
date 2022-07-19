package Test;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;

public class SearchResultTest extends BaseTest{

	HomePage home;
		
	@Test
	public void checkFirstSearchResult() {
		home = new HomePage(driver);
		
		home.navigate();
		
		home.searchMethod();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String searchSecondResultText = home.getSearchResult();
		Assert.assertEquals(searchSecondResultText, "https://www.javatpoint.com");
	}

	@Test
	public void checkSecondSearchResult() {
		home.navigate();
		home.searchMethod();
		String searchThirdResultText = home.getSearchResultSecond();
		Assert.assertEquals(searchThirdResultText, "https://www.tutorialspoint.com");
	}

	

}
