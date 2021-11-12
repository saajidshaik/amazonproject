package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidUse {
	public static void main(String[] args) {
		
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("https://facebook.com");
	Driver.findElementById("email").sendKeys("saajishaik@gmail.com");
		
	Driver.findElementById("pass").sendKeys("password");
		
	Driver.findElementByName("login").click();
		
	String expectedText = "Invalid username or password";
	String actualText = Driver.findElementByCssSelector("#error_box > div:nth-child(2)").getText();
	
	if(expectedText.equals(actualText)) {
		System.out.println("Test case passed");
	}
	else {
		System.out.println("Test case Failed");
	}
	Driver.quit(); 
		
	}

}
