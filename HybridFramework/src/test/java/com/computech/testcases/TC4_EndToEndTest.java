package com.computech.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.computech.pages.LoginPage;
import com.computech.pages.LogoutPage;

public class TC4_EndToEndTest extends BaseClass{
	@Test
	public void login() {
		logger = report.createTest("OrangHRM Login Test");
		logger.info("Browser and Application is up and running..");
		lp = PageFactory.initElements(driver, LoginPage.class);
		
		lp.loginToApplication();
		logger.pass("Login done successfully..");
	}
	
	@Test
	public void logout() {
		logger = report.createTest("OrangHRM Logout Test");
		lout = PageFactory.initElements(driver, LogoutPage.class);
		lout.logoutFromTheApplication();
		logger.pass("Logout done successfully..");
	}
}
