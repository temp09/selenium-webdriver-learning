package tescases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngAssertion {
	
	@Test
	public void validateTitle() {
	String expected_title = "yahoo.com";  // from excel
	String actual_title = "gamil.com";  // from selenium
	
	/*
	 * if (actual_title.equals(expected_title)){
	 * System.out.println(" Test case passed"); }else {
	 * System.out.println("Test case failed"); }
	 */
	//Assert.assertEquals(actual_title, expected_title);
	//Assert.assertTrue(false, "Element not found");
	Assert.fail("Failing the test as condition not met");
	
	}

}
