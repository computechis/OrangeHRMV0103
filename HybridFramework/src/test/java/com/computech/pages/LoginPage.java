package com.computech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.computech.utilities.Utility;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	// Locators
//	By user = By.id("txtUsername");
//	By password = By.name("txtPassword");
//	By loginButton= By.xpath("//input[@value='LOGIN']");
	@FindBy(how=How.ID, using="txtUsername") WebElement user;
	@FindBy(how=How.NAME, using="txtPassword") WebElement password;
	@FindBy(how=How.XPATH, using="//input[@value='LOGIN']") WebElement loginButton;
	
	// Action methods
	public void typeUserName() {
		user.sendKeys("Admin");
	}
	public void typePassword() {
		password.sendKeys("admin123");
	}
	public void clickOnSignInButton() {
		loginButton.click();
	}
	public void loginToApplication() {
		Utility.highLightElement(driver, user);
		user.sendKeys("Admin");
		Utility.highLightElement(driver, password);
		password.sendKeys("admin123");
		Utility.highLightElement(driver, loginButton);
		loginButton.click();
	}
	public void loginToApplication(String uName, String pwd) {
		user.sendKeys(uName);
		password.sendKeys(pwd);
		loginButton.click();
	}
	/*public void typeUsername() {
		driver.findElement(user).sendKeys("Admin");
	}
	public void typePassword() {
		driver.findElement(password).sendKeys("admin123");
	}
	public void clickOnSignInButton() {
		driver.findElement(loginButton).click();
	}*/

}
