package tescases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestTestcaseDependency {
	
	@BeforeTest
	public void openDatabaseConnection() {
		
		System.out.println("Openning Data Base Connection");
	}
	
	@AfterTest
	public void closeDatabaseConnection() {
		
		System.out.println("Closing Data Base Connection");
	}
	
	@BeforeMethod
	public void launchBrowser() {
		
		System.out.println("Launching Browser");
	}
	
	@AfterMethod
	public void closeBrowser() {
		
		System.out.println("Closing Browser");
	}
	
	
	
	@Test(priority=1)
	public void doRegistration() {
		SoftAssert softAssert = new SoftAssert();
		System.out.println("Registrar to Browser");
		Assert.fail("Registration not successful"); 
		//softAssert.fail("Registration not successful");
	}
	
	@Test(priority=2,dependsOnMethods="doRegistration",alwaysRun=true)
	public void doLogin() {
		
		System.out.println("Login to Browser"); // it will skip when use Hadr assert but for softAssert it will not skip
	}
	
	@Test(priority=3,dependsOnMethods="doRegistration")
	public void doLogout() {
		
		System.out.println("Logout from Browser");
	}


}
