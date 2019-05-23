package automation.project.configuration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public abstract class BaseClass {
	protected static WebDriver driver = null;

	protected void instanciateBrowser(){
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--lang=en-ca");
		options.addArguments("--start-maximized");
		
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
	}
		
	protected void quitBrowser(){
		driver.quit();
	}
	
}
