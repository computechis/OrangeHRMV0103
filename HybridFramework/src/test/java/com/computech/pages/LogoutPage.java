package com.computech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.computech.utilities.Utility;

public class LogoutPage {

	WebDriver driver;
	public LogoutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.CSS, using="a#welcome") WebElement panelLink;
	@FindBy(how = How.XPATH, using="//*[text()='Logout']") WebElement logoutLink;
	
	public void logoutFromTheApplication() {
		Utility.highLightElement(driver, panelLink);
		panelLink.click();
		Utility.highLightElement(driver, logoutLink);
		logoutLink.click();
	}
}
