package automation.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import automation.project.configuration.BaseClass;

public class DashboardPage extends BaseClass {
	
	public static WebElement usernameField() {
		return driver.findElement(By.cssSelector("usernameDisplayed"));
	}
}
