package com.tideUS.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
WebDriver driver ;
	
	public HomePage(WebDriver rdriver){
	this.driver= rdriver;
	}
	
	

	By searchBox = By.name("q");
	By result= By.tagName("h2");
	By shopProducts=By.linkText("Shop Products");
	By takeThePledge=By.cssSelector("button.button-link.secondary.event_button_click");
	By thankYou=By.cssSelector("div.pledge-counter-thank-you");
	
	By learnMore = By.linkText("Learn More");
	By loadsofhope= By.linkText("Loads of Hope");
	By laundary =By.linkText("How to Do Laundry");
	By  skinarticle =By.linkText("How to Care for Sensitive Skin");
	By article =By.cssSelector("h1.article-intro-title");
	By whatsnew= By.linkText("What’s New");
	public WebElement getSearchBox() {
		return driver.findElement(searchBox);
	}
	public WebElement getResult() {
		return driver.findElement(result);
	}
	public WebElement ShopProducts() {
		return driver.findElement(shopProducts);
	}
	public WebElement LearnMore() {
		return driver.findElement(learnMore);
	}
	public WebElement TakeThePledge() {
		return driver.findElement(takeThePledge);
	}
	public By ThankYou() {
		return (thankYou);
	}
	public WebElement LoadsOfHope() {
		return driver.findElement(loadsofhope);
	}
	public WebElement Laundary() {
		return driver.findElement(laundary);
	}
	public WebElement article() {
		return driver.findElement(article);
	}
	public WebElement skinarticle() {
		return driver.findElement(skinarticle);
	}
	public WebElement WhatsNew() {
		return driver.findElement(whatsnew);
	}
	

}
