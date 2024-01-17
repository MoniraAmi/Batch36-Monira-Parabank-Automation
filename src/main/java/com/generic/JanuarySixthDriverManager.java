package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JanuarySixthDriverManager {
	
	
	
	
	//public WebDriver getChromeDriver(WebDriver driver) {
	
	//WebDriverManager.chromedriver().setup();
	//driver = new ChromeDriver();
	//driver.manage().window().maximize();
	//return driver;
	//}
	
	
	
	public WebDriver getfirefoxDriver(WebDriver driver) {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
		}

}
