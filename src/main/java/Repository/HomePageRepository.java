package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageRepository {
	
	
	public WebDriver driver;
	public HomePageRepository(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(linkText="Search")
	WebElement lnkSearch;
	
	
	public WebElement Search() {
		return lnkSearch;
	}

}
