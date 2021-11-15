package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplePhone{
	
	@FindBy(xpath ="(//div[contains(@class,'col-inner')])[4]")
	private WebElement firstApplePhone;
	
	public ApplePhone(WebDriver driver) {
		PageFactory.initElements(driver, this) ;
		
	}
	public void clickfirstApplePhone( ) {
		firstApplePhone.click();
	}

}
