package Util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import Demo.login_Page;

public class Browser {

static 	WebDriver driver;
	
	public static WebDriver Browserinit() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.objectspy.com/register/signup.php");
		driver.manage().deleteAllCookies();
		driver.manage().window();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver;
		
	}
	
}
