package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginRepository {
	
	public WebDriver driver;
	public LoginRepository(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[contains(@data-cy,'account') and contains(@class,'makeFlex h')]")
	WebElement btnLogin;
	
	
	public WebElement Login() {
		return btnLogin;
	}
	
	

}
