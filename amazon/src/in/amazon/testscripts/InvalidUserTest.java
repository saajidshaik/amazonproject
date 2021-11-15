package in.amazon.testscripts;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import in.amazon.pages.BuyPhone;
import in.amazon.pages.LandingPage;
import in.amazon.pages.Mobiles;
import in.amazon.pages.SignIn;

public class InvalidUserTest {
	
	WebDriver driver;
	 
	@BeforeTest
	public void launchApplication( ) {
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://Amazon.in");
	}
	@Test
	public void InvalidUserShouldNotBeAbleToLogin() {
		LandingPage landingPage =new LandingPage(driver);
		landingPage.hoverOverhelloSignIn();
		
		landingPage.clickSignInBtn();
		
		SignIn SignIn = new SignIn(driver);
		SignIn.enterUsername("batman4456@gmail.com");
		
		SignIn.clickContinueBtn();
		
		String ecpectedErrmsg = "We cannot find an account with that email address";
		String actualErrMsg = SignIn.geterrMsg();
		Assert.assertEquals(actualErrMsg, ecpectedErrmsg);
	}
		
		@AfterTest
		public void closeTheBrowser() {
			driver.quit();
			
		}
		
		
		
	}



