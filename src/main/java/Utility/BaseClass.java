package Utility;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public Properties property;
	private String url;
	private String uname;
	private String password;
	private String browser;
	public Config utility;
	public WebDriver driver;
	public BaseClass() {
		
		System.out.println("BaseClass");
		
		utility=new Config();
	}
	
	
	public WebDriver invokeBrowser() {
		String browser=utility.getBrowser();
		System.out.println("Selectd browser:"+browser);
		if(browser.contains("chrome")) {
			System.setProperty("driver.chrome.webdriver","D:\\chromedriver.exe");
			driver=new ChromeDriver();
		}else {
			System.out.println("Other browser not configured");
		}
		driver.manage().window().maximize();
		return driver;
		
	
	}
	
	
	

}
