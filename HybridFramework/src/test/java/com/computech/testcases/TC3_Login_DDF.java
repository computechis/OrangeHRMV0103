package com.computech.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.computech.factory.DataProviderFactory;
import com.computech.factory.ExcelReader;
import com.computech.pages.LoginPage;

public class TC3_Login_DDF extends BaseClass{
  @Test
  public void login() {
	 
	 lp= PageFactory.initElements(driver, LoginPage.class);
	 lp.loginToApplication(DataProviderFactory.getExcel().getStringData("LoginTest", 0, 0),
			 				DataProviderFactory.getExcel().getStringData("LoginTest", 0, 1));
  }
  /*
   @Test
  public void login() {
	 ExcelReader excel = new ExcelReader();
	 lp= PageFactory.initElements(driver, LoginPage.class);
	 lp.loginToApplication(excel.getStringData("LoginTest", 0, 0), excel.getStringData("LoginTest", 0, 1));
  }
   */
}
