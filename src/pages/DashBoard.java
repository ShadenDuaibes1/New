package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class DashBoard {


WebDriver driver;

	
	By heading = By.xpath("//div[@class=\"main-header\"]");
	By logoutBtn = By.id("submit");
	
	public String getHeading() {
		String head = driver.findElement(heading).getText();
		return head;
	}
	
	public void clickLogout() {
		driver.findElement(logoutBtn).click();
	}

}
