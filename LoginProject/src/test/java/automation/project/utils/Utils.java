package automation.project.utils;

import org.openqa.selenium.WebDriver;

public class Utils {
	public static void closeCurrentWindow(WebDriver driver){
		driver.close();
	}
	
	public static void switchNewWindow(WebDriver driver){
		for(String windowHandleNewWindow : driver.getWindowHandles()){
		    driver.switchTo().window(windowHandleNewWindow);
		}
	}
	
	public static void switchBackWindow(WebDriver driver, String windowHandle){
		driver.switchTo().window(windowHandle);
	}
}
