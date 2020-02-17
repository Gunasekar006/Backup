package MakeMytrip.MMT;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.HomePage;
import Page.Login;
import Utility.BaseClass;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	Login login;
	HomePage home;
	
	@BeforeTest
	public void InvokeBrowser(){
		
		login=new Login();
		home=new HomePage();
		
		
	}
	@Test
	public void test1() {
		login.LoginPage();
		home.searchFlights();
	}


}
