package com.MarvelBank.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MarvelBank.qa.base.TestBase;

public class LoginPage extends TestBase {
// object repository
	
	
	@FindBy(xpath="//input[@name='uid']")
	WebElement userid;
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement Loginbtn;
	@FindBy(xpath="//h2[text()='Guru99 Bank']")
	WebElement Logo;
	// Initializing the Page Factory
    public LoginPage() {
	PageFactory.initElements(driver, this);
	}
	//ActionMethods
	
	public String ValidateLoginPageTitle() {
	return driver.getTitle();
	}
	public boolean validateLoginPageLogo() {
	return Logo.isDisplayed();
	}
	public void  Login(String un,String pwd ) {

	userid.sendKeys("rajesh");
	password.sendKeys("889787");
	
	
	}
	
	}	
		

