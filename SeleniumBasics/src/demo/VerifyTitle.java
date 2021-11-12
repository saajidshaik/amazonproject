package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.linkedin.com/");
		
		String expectedTitle = "LinkedIn: Log In or Sign Up";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Test Case Passed");
			
		}
		else {
			System.out.println("test Case failed");
		}
		driver.quit();
			
		}
	}


