package testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBT {
	WebDriver driver;
    
	@Parameters("browser")
	@BeforeTest
	public void  launchApplication(String browser) {
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
			
		}
		
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
		String actualtext = driver.findElement(By.xpath("//h1[contains(@data-test-id,'hero__headline')]")).getText();
		Assert.assertEquals(actualtext, expectedtext);
		
	}
	@Test
	public void VerifySignInbtnisEnabled() {
		boolean signInBtnStatus =driver.findElement(By.xpath("//button[contains(@type,'submit')]")).isEnabled();
		Assert.assertTrue(signInBtnStatus);
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	
	
	
}



