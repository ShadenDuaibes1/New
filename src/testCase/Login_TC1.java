package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;

public class Login_TC1 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "---Exact path to chromedriver.exe---");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoqa.com/books");
	
		HomePage home = new HomePage(driver);
		
	
		LoginPage login = new LoginPage(driver);
		
	
	
		home.clickLogin();
		
		
		login.enterUsername("---Your Username---");
		login.enterPassword("---Your Password---");
		
	
		login.clickLogin();
		Thread.sleep(3000);
		
		
		
            
               driver.quit();
	}
}
