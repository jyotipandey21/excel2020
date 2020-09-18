package Demo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import Util.Base_Page;

public class login_Page {
	
	WebDriver driver;
	
	public login_Page(WebDriver driver) {
		this.driver=driver;	
	}
 @FindBy(how=How.XPATH,using="//div[@id='login']/form/div[1]/input")
 WebElement Email_Address_Locator;
 @FindBy(how=How.XPATH,using="//div[@id='login']/form/div[2]/input")
 WebElement Password_Locator;
 @FindBy(how=How.XPATH,using="//button[contains(text(),'Log In')]")
 WebElement Click_Locator;
 
 public void email(String name) {
	 Email_Address_Locator.sendKeys(name);
 }
 public void password(String password) throws Exception {
	 Password_Locator.sendKeys(password);
	 Base_Page.screenShot(driver, "C:\\Users\\Jyoti\\eclipse-workspace\\spring2020\\Full_Final\\screenshot\\test.jpg");
 }
 public void click() {
	 Click_Locator.click(); 
 }
}
