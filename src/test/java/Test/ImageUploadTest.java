package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ImageUpload;
import pages.ImageUploadedAssertionPage;

public class ImageUploadTest extends BaseTest{
  
	ImageUpload imup;
	ImageUploadedAssertionPage imageUploaded;

	

	
	@Test
	public void checkUploadImage() {
		imup = new ImageUpload(driver);
		imageUploaded = new ImageUploadedAssertionPage(driver);
		
		imup.navigate();
		imup.uploadImage();
		String successMessageText = imageUploaded.getSuccessMessage();
		Assert.assertEquals(successMessageText, "File Uploaded!");
		
	}
}
