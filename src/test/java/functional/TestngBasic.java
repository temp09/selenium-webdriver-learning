package functional;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngBasic {
	
	
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
		
		System.out.println("Registrar to Browser");
	}
	
	@Test(priority=2)
	public void doLogin() {
		
		System.out.println("Login to Browser");
	}
	
	@Test(priority=3)
	public void doLogout() {
		
		System.out.println("Logout from Browser");
	}

}
