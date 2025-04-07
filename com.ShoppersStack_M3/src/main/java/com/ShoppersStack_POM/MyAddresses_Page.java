package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddresses_Page {

	public MyAddresses_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Add Address']")
	private WebElement addAddressBtn;

	@FindBy(xpath = "(//span[contains(@class,'MuiButton-startIcon MuiButton')])[2]")
	private WebElement deleteBtn;

	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement yesBtn;

	@FindBy(xpath = "//button[@aria-label='close']")
	private WebElement closeBtn;

	public WebElement getCloseBtn() {
		return closeBtn;
	}

	public WebElement getAddAddressBtn() {
		return addAddressBtn;
	}

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}

	public WebElement getYesBtn() {
		return yesBtn;
	}

}
