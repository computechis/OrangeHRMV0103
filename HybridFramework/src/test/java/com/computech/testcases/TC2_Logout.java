package com.computech.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.computech.factory.BrowserFactory;
import com.computech.factory.ConfigProvider;
import com.computech.pages.LoginPage;
import com.computech.pages.LogoutPage;

@SuppressWarnings("unused")
public class TC2_Logout extends BaseClass{
	

	@Test
	public void logout() {
		lp = PageFactory.initElements(driver, LoginPage.class);
		lp.loginToApplication();
		lout = PageFactory.initElements(driver, LogoutPage.class);
		lout.logoutFromTheApplication();
	}

	

}
