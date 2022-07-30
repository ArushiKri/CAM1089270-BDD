package com.tideUS.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopProducts {
	
WebDriver driver ;
	
	public ShopProducts  (WebDriver rdriver){
	this.driver= rdriver;
	}
	
	
	
	


	By shopProducts =By.linkText("Shop Products");
	By powder =By.linkText("powder");
	By details =By.cssSelector("a.product-preview-title");
	By product = By.partialLinkText("Hygienic Clean");
	By findRetailer= By.cssSelector("span.ps-button-label");
	By buy= By.cssSelector("button.ps-online-buy-button.available.ps-online-seller-button");
	By addToCart= By.id("addToCartButtonOrTextIdFor81260444");
	By checkout = By.linkText("View cart & check out");
	public WebElement ShopProduct() {
		return driver.findElement(shopProducts);
	}
	public WebElement powder() {
		return driver.findElement(powder);
	}
	public WebElement Product() {
		return driver.findElement(product);
	}
	public WebElement Retailer() {
		return driver.findElement(findRetailer);
	}
	
  public WebElement buy() {
	  return driver.findElement(buy);
  }
  public WebElement AddToCart() {
	  return driver.findElement(addToCart);
  }
  public WebElement Checkout() {
	  return driver.findElement(checkout);
  }
 
}
