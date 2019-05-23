package automation.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import automation.project.configuration.BaseClass;

public class LoginPage extends BaseClass {

	public static WebElement usernameField() {
		return driver.findElement(By.id("usernameId"));
	}
	
	public static WebElement passwordField() {
		return driver.findElement(By.id("passwordId"));
	}
	
	public static WebElement loginButton() {
		return driver.findElement(By.id("loginButtonId"));
	}
	
	public static WebElement loginErrorMessage() {
		return driver.findElement(By.className("loginErrorMessage"));
	}

	public static WebElement passwordErrorMessage() {
		return driver.findElement(By.className("passwordErrorMessage"));
	}
	
}
