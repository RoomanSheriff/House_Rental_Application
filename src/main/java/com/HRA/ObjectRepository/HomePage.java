package com.HRA.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	/*Declaration*/
	@FindBy(xpath="//a[text()='Register']")
	private WebElement RegisterEdt;
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement LoginEdt;
	
	/*Initialization*/
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	/*Utilization*/
	public WebElement getRegisterEdt() {
		return RegisterEdt;
	}

	public WebElement getLoginEdt() {
		return LoginEdt;
	}
	
	/*business libraries*/
	
	public void registerEdt()
	{
		RegisterEdt.click();
	}
	
	public void LoginEdt()
	{
		LoginEdt.click();
	}
	
}
