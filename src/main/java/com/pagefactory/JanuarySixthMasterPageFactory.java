package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JanuarySixthMasterPageFactory {
	
	
	
	public JanuarySixthMasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@name='username']")
	public WebElement Username;
	
	
	@FindBy(xpath = "//input[@name='password']")
	public WebElement Password;
	
	@FindBy(xpath = "//input[@class='button']")
	public WebElement Loginbtn;

	
	@FindBy(xpath = "//a[contains(text(),'Log Out')]")
	public WebElement Logoutbtn;


	public WebElement getUsername() {
		return Username;
	}


	public WebElement getPassword() {
		return Password;
	}


	public WebElement getLoginbtn() {
		return Loginbtn;
	}


	public WebElement getLogoutbtn() {
		return Logoutbtn;
	}
	

}
