package com.computech.unittest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.computech.factory.BrowserFactory;
import com.computech.factory.ConfigProvider;

public class TestBrowserFactory {
	
	@Test
	public void browserLib() {
		ConfigProvider config = new ConfigProvider();
		WebDriver driver=BrowserFactory.startApplication(config.getStagingURL(), config.getBrowser());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		BrowserFactory.closeApplication(driver);
	}
}
