package Test;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.W3ScoolsPage;

public class W3ScoolsTest extends BaseTest {

	W3ScoolsPage w3Opject;

	@Test
	public void checkCountryCompany() {

		w3Opject = new W3ScoolsPage(driver);
		w3Opject.navigate();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String FourthCountryText = w3Opject.getFourthCountryText();
		Assert.assertEquals(FourthCountryText, "Austria");
	}
}
