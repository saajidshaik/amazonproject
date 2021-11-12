package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/overview-summary.html");
		
		//driver.switchTo().frame("classFrame");
		
		driver.findElementByLinkText("DEPRECATED").click();
	}
}
