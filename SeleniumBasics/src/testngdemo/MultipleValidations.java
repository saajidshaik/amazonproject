package testngdemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleValidations {
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
	@Test
	public void Verifytext() {
		String expectedtext = "Welcome to your professional community";
		String actualtext = driver.findElementByCssSelector("#main-content > section.section.hero > div > h1").getText();
		Assert.assertEquals(actualtext, expectedtext);
		
	}
	@Test
	public void VerifySignInbtnisEnabled() {
		boolean signInBtnStatus =driver.findElementByCssSelector("#main-content > section.section.hero > div > h1").isEnabled();
		Assert.assertTrue(signInBtnStatus);
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	
	
	
}


