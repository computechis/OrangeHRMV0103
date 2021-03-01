package com.computech.unittest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.computech.factory.ExcelReader;

public class TestExcelReader {

	@Test
	public void testExcelLib() {
		ExcelReader excel = new ExcelReader();
		String data = excel.getStringData("TestSheet", 0, 0);
		Assert.assertEquals(data, "TestingExcel");
	}
}
