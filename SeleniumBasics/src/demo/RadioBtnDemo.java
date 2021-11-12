package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtnDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		
		Thread.sleep(2000);
		
		driver.findElementByLinkText("Create New Account").click();
		
		boolean customBtnStatus = driver.findElementByXPath("(//input[contains(@type,'radio')])[3]").isSelected();
		if(customBtnStatus == false) {
			System.out.println("custom button is not Selected by default");
			
		}
		
		else {
			System.out.println("custom button is Selected By default");
		}
		Thread.sleep(2000);
		
		driver.findElementByXPath("(//input[contains(@type,'radio')])[2]").click();
	}

}
