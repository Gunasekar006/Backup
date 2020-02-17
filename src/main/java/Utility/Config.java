package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Config {
	public Properties property;
	private String url;
	private String uname;
	private String password;
	private String browser;

	public Config() {

		File f = new File("resource/Applcation.properties");
		property = new Properties();
		try {
			FileInputStream fis = new FileInputStream(f);
			property.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getUrl() {
		if (!property.getProperty("url").isEmpty()) {
			url = property.getProperty("url");
		} else {
			System.out.println("url is empty");
		}
		return url;
	}

	public String getUname() {
		if (!property.getProperty("url").isEmpty()) {
			url = property.getProperty("username");
		} else {
			System.out.println("username is empty");
		}
		return uname;
	}

	public String getPassword() {
		if (!property.getProperty("url").isEmpty()) {
			url = property.getProperty("password");
		} else {
			System.out.println("passowrd is empty");
		}
		return password;
	}

	public String getBrowser() {
		if (!property.getProperty("browser").isEmpty()) {
			browser = property.getProperty("browser");
		} else {
			System.out.println("browser is empty");
		}
		return browser;
	}

}
