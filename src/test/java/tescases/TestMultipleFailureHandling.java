package tescases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestMultipleFailureHandling {
	
	@Test
	public void validateTitle() {
		
		System.out.println("Beginning test");
		String expected_title = "yahoo.com";  // from excel
		String actual_title = "gamil.com";  // from selenium
		
		
		SoftAssert softAssert = new SoftAssert();
		
		System.out.println("Validating titles");
		softAssert.assertEquals(actual_title, expected_title);
		
		System.out.println("Validating text box presence");
		softAssert.assertEquals(true, false, "Text box not presence");
		
		
		System.out.println("Validating images");
		softAssert.assertEquals(true, false, "Image not present");
		System.out.println("Ending test");
		
		softAssert.assertAll();
		
	}

}
