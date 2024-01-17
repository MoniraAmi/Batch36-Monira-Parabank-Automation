package com.stepdef;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.generic.JanuarySixthDriverManager;
import com.pagefactory.JanuarySixthMasterPageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JanuarySixthStepdef {
	
	WebDriver driver;
	JanuarySixthMasterPageFactory jpf;
	@Given("open the browser")
	public void open_the_browser() {
		
		JanuarySixthDriverManager jdm = new JanuarySixthDriverManager();
		driver = jdm.getfirefoxDriver(driver);	
	}
	
	@Given("pass the URL {string}")
	public void pass_the_url(String URL) {
	   
	    driver.navigate().to(URL);
	}
	@When("enter username {string} in the Username field")
	public void enter_username_in_the_username_field(String username) {
		jpf = new JanuarySixthMasterPageFactory(driver);
		jpf.getUsername().sendKeys(username);
	}
	
	@When("enter password {string} in the Password field")
	public void enter_password_in_the_password_field(String password) {
	    jpf.getPassword().sendKeys(password);
	}
	@When("click on Login")
	public void click_on_login() {
	    jpf.getLoginbtn().click();
	}
	
	@Then("validate login is successful")
	public void validate_login_is_successful() {
	    
		Assert.assertTrue(jpf.getLogoutbtn().isDisplayed(), "Login successful");

		if(jpf.getLogoutbtn().isDisplayed()) {
			System.out.println("Login Successful");
		}else {
			System.out.println("Login Failed");
		}
		
		
	
	
	}
	
	
	@When("click on Log Out")
	public void click_on_log_out() {
	    jpf.getLogoutbtn().click();
	}

	@Then("validate logout is successful")
	public void validate_logout_is_successful() {
		Assert.assertTrue(jpf.getLoginbtn().isDisplayed(), "Logout successful");

		if(jpf.getLoginbtn().isDisplayed()) {
			System.out.println("logout successful");
		}else {
			System.out.println("logoutfailed");
			
		}
	}
	}

