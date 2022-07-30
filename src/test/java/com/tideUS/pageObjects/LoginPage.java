package com.tideUS.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
WebDriver driver ;
	
	public LoginPage(WebDriver rdriver){
	this.driver= rdriver;
	}
	
	By homeregisterLink= By.linkText("Register");
	
	
	 By signupLink= By.linkText("Sign up now") ;
	 
	 By loginLink= By.cssSelector("button[type='button']");
	 By signedInUser=By.className("UserSiginSPInner pt-01 md:pr-03 md:z-10");
	 By firstName =By.id("name");
	 By lemail = By.id("login-email");
	 By lpassword=By.id("login-password");
	 By submit=By.cssSelector("input[type='submit']");
	 By successMessage= By.xpath("//*[text()='Thanks for signing up!']");
	 By forgotPassword= By.linkText("Forgot password?");
	 By forgotEmail= By.name("signInEmailAddress");
	
	 public WebElement registerLink() {
			
			return  driver.findElement(homeregisterLink);
			
		}
	 
	
	public WebElement getSignupLink() {
		
		return  driver.findElement(signupLink);
		
	}
public WebElement getLoginLink() {
		
		return  driver.findElement(loginLink);
		
	}
	
	 public WebElement setName() {
			
			return  driver.findElement(firstName);
			
		}
	 public WebElement setEmail() {
			
			return  driver.findElement(lemail);
			
		}
	 public WebElement setPassword() {
			
			return  driver.findElement(lpassword);
			
		}
	 public WebElement submit() {
			
			return  driver.findElement(submit);
			
		}
	 public By submitEle() {
			
			return  (submit);
			
		}
	 public By message() {
			
			return  (successMessage);
			
		}
	 public WebElement signCheck() {
			
			return  driver.findElement(signedInUser);
			
		}
	 public WebElement forgotPassword() {
			
			return  driver.findElement(forgotPassword);
			
		}
	 public WebElement forgotEmail() {
			
			return  driver.findElement(forgotEmail);
			
		}
}


