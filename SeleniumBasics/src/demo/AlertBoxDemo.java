package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver  driver= new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		
		driver.findElementByLinkText("CONTINUE TO LOGIN").click();
		Thread.sleep(2000);
		
		driver.findElementById("Button2").click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		
		
	}

}
