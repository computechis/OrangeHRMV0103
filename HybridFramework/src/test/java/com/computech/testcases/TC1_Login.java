package com.computech.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.computech.factory.BrowserFactory;
import com.computech.factory.ConfigProvider;
import com.computech.pages.LoginPage;

@SuppressWarnings("unused")
public class TC1_Login extends BaseClass{

	@Test
	public void login() {
		logger = report.createTest("OrangHRM Login Test");
		logger.info("Browser and Application is up and running..");
		lp = PageFactory.initElements(driver, LoginPage.class);
		
		lp.loginToApplication();
		logger.pass("Login done successfully..");
	}

}
