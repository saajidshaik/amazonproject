package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {

	@FindBy(id="ap_email")
	private WebElement emailtextbox;
	
	@FindBy(id = "continue")
	private WebElement continueBtn;
	
	@FindBy(xpath ="//span[contains(@class,'a-list-item')]")
	private WebElement ErrMsg;
	
	
	public SignIn (WebDriver Driver) {
		PageFactory.initElements(Driver, this);
		
	
	}

	public void enterUsername(String email) {
		emailtextbox.sendKeys( email);
			
	}
	public void clickContinueBtn( ) {
		continueBtn.click();
	}
	public String geterrMsg() {
		String text = ErrMsg.getText();
		return text;
		
	}
	
	
	
	
	
}
