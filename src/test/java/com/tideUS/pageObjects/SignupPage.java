package com.tideUS.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



public class SignupPage {
	WebDriver driver ;
	
	public SignupPage(WebDriver rdriver){
	this.driver= rdriver;
	}
	
	By homeregisterLink= By.linkText("Register");
	
	
	 By signupLink= By.linkText("Sign up now") ;
	 
	 By firstName =By.id("name");
	 By email = By.id("email");
	 By password=By.id("password");
	 By submit=By.cssSelector("input[type='submit']");
	 By successMessage= By.xpath("//*[text()='Thanks for signing up!']");
	
	 public WebElement registerLink() {
			
			return  driver.findElement(homeregisterLink);
			
		}
	 
	
	public WebElement getSignupLink() {
		
		return  driver.findElement(signupLink);
		
	}
	 public WebElement setName() {
			
			return  driver.findElement(firstName);
			
		}
	 public WebElement setEmail() {
			
			return  driver.findElement(email);
			
		}
	 public WebElement setPassword() {
			
			return  driver.findElement(password);
			
		}
	 public WebElement submit() {
			
			return  driver.findElement(submit);
			
		}
	 public WebElement message() {
			
			return  driver.findElement(successMessage);
			
		}
}

