package testngdemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.net.Urls;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GridDemo {
	WebDriver driver;

	@BeforeTest
	public void  launchApplication() throws MalformedURLException  {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.LINUX);
		driver = new RemoteWebDriver(new URL("http:localhost:4444/wd/hub"),cap);
		
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
	//	driver.quit();
	//}
	
	
	
}

