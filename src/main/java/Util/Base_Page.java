package Util;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Page {

	WebDriver driver;
	
	public Base_Page(WebDriver driver) {
		this.driver=driver;
	}
	
	public static void screenShot(WebDriver driver, String fileWithPath) throws IOException {
			TakesScreenshot scrShot =((TakesScreenshot)driver);
			File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile =new File(fileWithPath);
			FileUtils.copyFile(srcFile,DestFile );
		}	
	
	public static void dropdownElement(WebElement locator, String visibleText) {
		Select sel = new Select(locator);
		sel.selectByVisibleText(visibleText);	
	}
	public static void waitForElement (WebDriver driver, int timeInSeconds, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
		wait.until(ExpectedConditions.elementToBeClickable( locator));
		}
	public static int Random1 () {
		Random random = new Random ();
	int randumNum =	random.nextInt(100);
	return randumNum;
	}
}
