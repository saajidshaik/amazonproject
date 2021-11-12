package testngdemo;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firefox {

	@Test
	public void openBrowser( ) {
		FirefoxDriver driver = new FirefoxDriver();
	}
}
