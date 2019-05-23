package automation.project.tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.project.configuration.BaseClass;
import automation.project.pages.DashboardPage;
import automation.project.pages.LoginPage;

public class Login_Test_Cases extends BaseClass {

	@BeforeTest
	private void beforeTest(){
		instanciateBrowser();
	}
	
	
	@Test (priority=1)
	public static void testCase1(){
		driver.get("http://www.myapplication.com");
		
		LoginPage.usernameField().sendKeys("validUse");
		LoginPage.passwordField().sendKeys("dOw8*21G");
		LoginPage.loginButton().click();
		
		Assert.assertEquals(DashboardPage.usernameField().getText(), "validUse");
		
	}
	
	
	@Test (priority=2)
	public static void testCase2(){
		driver.get("http://www.myapplication.com");
		
		LoginPage.usernameField().sendKeys("validUse");
		LoginPage.passwordField().sendKeys("111AAA**");
		LoginPage.loginButton().click();
				
		Assert.assertEquals(LoginPage.loginErrorMessage().getText(), "Incorrect username or password provided");
		
	}
	
	
	@Test (priority=3)
	public static void testCase6(){
		driver.get("http://www.myapplication.com");
		
		LoginPage.passwordField().sendKeys("dOw8*21G");
		LoginPage.loginButton().click();
				
		Assert.assertEquals(LoginPage.passwordErrorMessage().getText(), "Password must have at least 8 characters");
		
	}
	
	
	@AfterTest
	private void afterTest(){
		quitBrowser();
	}
}
