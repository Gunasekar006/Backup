package Page;

import org.openqa.selenium.WebDriver;

import Repository.HomePageRepository;
import Repository.LoginRepository;
import Utility.BaseClass;

public class HomePage {
	
	public WebDriver driver;
	public HomePageRepository HomeRepo;
	public BaseClass base;
	
	public HomePage() {
		base=new BaseClass();
		driver = base.invokeBrowser();
	}

	
	public void searchFlights() {
		HomeRepo.Search().click();
	}
	
}
