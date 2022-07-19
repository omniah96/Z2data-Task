package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CheckBoxPage;

public class CheckBoxTest extends BaseTest{
 
	CheckBoxPage check;

	@Test
	public void testCheckBoxes() {
		
		check = new CheckBoxPage(driver);
		
		check.navigate();
		
		boolean isDisplayed1 = check.clickFirstBox();
		boolean isDisplayed2 =check.clickSecondBox();
		Assert.assertTrue(isDisplayed1);
		Assert.assertTrue(isDisplayed2);
		
	}
}
