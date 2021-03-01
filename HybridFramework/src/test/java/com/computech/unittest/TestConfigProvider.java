package com.computech.unittest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.computech.factory.ConfigProvider;

public class TestConfigProvider {
	@Test
	public void testConfigLib() {
		ConfigProvider config = new ConfigProvider();
		String actData = config.getValue("testConfig");
		Assert.assertEquals(actData, "TestingConfigFile");
	}

}
