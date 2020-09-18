package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Demo.login_Page;
import Util.Browser;
import Util.Excel_Page;

public class Login_Test  {

	WebDriver driver;
	login_Page login;
	Excel_Page reader = new Excel_Page("Data\\DemoTest.xlsx");
  
	
	@DataProvider(name="Test")
    public String [][] testing(){
    	String[][] data=reader.getAllData("Login_Test");
    	return data;
    }
	
	@Test(dataProvider = "Test")
	public void log(String email,String password,String firstname) throws Exception {
		driver = Browser.Browserinit();
	    login = PageFactory.initElements(driver, login_Page.class);
		login.email(email);
		login.password(password);
		login.click();
		
		
	}
}
