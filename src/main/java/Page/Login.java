package Page;

import org.openqa.selenium.WebDriver;


import Repository.LoginRepository;
import Utility.BaseClass;
import Utility.Config;



public class Login {
	public WebDriver driver;
	public LoginRepository loginrepo;
	public BaseClass base;
	public Config utility;
	
	public Login() {
		base=new BaseClass();
		driver = base.invokeBrowser();
		utility=new Config();
		loginrepo=new LoginRepository(driver);
	}
	
	
	
	public void LoginPage() {
		driver.get(utility.getUrl());
		loginrepo.Login().click();
		
	}
	
}
