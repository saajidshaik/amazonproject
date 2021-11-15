package in.amazon.testscripts;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import in.amazon.pages.ApplePhone;
import in.amazon.pages.BuyPhone;
import in.amazon.pages.LandingPage;
import in.amazon.pages.Mobiles;

public class BuyMobilePhoneTest {
	
	WebDriver driver;
	 
	@BeforeTest
	public void launchApplication( ) {
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://Amazon.in");
	}
	@Test
	public void buyMobile() {
		LandingPage landingPage = new LandingPage(driver);
		LandingPage.clickMobiles();
		
		
	Mobiles mobiles = new Mobiles(driver);
	mobiles.clickApple();
	
	ApplePhone applePhones = new ApplePhone(driver);
	applePhones.clickfirstApplePhone();
	
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(1));
	BuyPhone buyphone = new BuyPhone(driver);
	buyphone.clickBuyNowButton();
	
	String expectedTitle = "Amazon Sign In";
	String actualTitle = driver.getTitle();
	
	Assert.assertEquals(actualTitle, expectedTitle);
	}
	@AfterTest
	public void CloseBrowser( ) {
		driver.quit();
		
	}
}






