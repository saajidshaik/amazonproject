package testngdemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Verifytitle {
	ChromeDriver driver;

	@BeforeTest
	public void  launchApplication() {
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://linkedin.com/");
	}
	
	@Test
	public void titleVerification() {
		String expectedTitle ="LinkedIn: Log In or Sign Up";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	//@AfterTest
	//public void closeBrowser() {
	///	driver.quit();
	}
	
	
	


