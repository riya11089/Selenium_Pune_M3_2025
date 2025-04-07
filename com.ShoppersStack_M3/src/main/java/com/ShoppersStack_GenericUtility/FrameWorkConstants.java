package com.ShoppersStack_GenericUtility;

public interface FrameWorkConstants {

	Java_Utility javaUtility = new Java_Utility();

	final static String propertyFilePath = "./src/test/resources/testData/shopperProperty.properties";

	final static String excelFilePath = "./src/test/resources/testData/shopperExcel.xlsx";

	final static String screenshotPath = "./screenshot/"+javaUtility.getLocalDateAndTime()+".png";

	final static String reportsPath = "./reports/"+javaUtility.getLocalDateAndTime()+".html";

	final static String chromeKey = "webdriver.chrome.driver";

	final static String chromeValue = "./src/main/resources/driver/chromedriver.exe";

}
