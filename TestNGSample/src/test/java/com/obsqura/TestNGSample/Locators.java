package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Locators extends Base {
	@Test(description="Locating By ID Amazon Test Case")
	public void locatingById(){
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Kipling sling bags");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14 pro max case");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}
	@Test(description="Locating By Class Obsqura Zone")
	public void locatingByClass() {
		driver.findElement(By.className("top-logo"));
	}
	@Test(description="Locating By Class Search n Featured")
	public void locatingClass() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14 pro max case");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.className("a-dropdown-label")).click();
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("lakme eyeconic kajal");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.className("a-dropdown-prompt")).click();	
	}
	@Test(description="Locating By Class All")
	public void locatingAll() {
		driver.findElement(By.className("hm-icon-label")).click();	
	}
	@Test(description="Locating By Class Flag")
	public void locatingFlag() {
		driver.findElement(By.xpath("//a[@class='nav-a nav-a-2 icp-link-style-2']")).click();	
		driver.findElement(By.className("a-button-input")).click();
	}
	@Test(description="Locating By Name")
	public void locatingName() {
		driver.findElement(By.name("dropdown-selection-ubb"));
	}
	@Test(description="Locating By CSS Selector(id) Select Your Address")
	public void locatingCSSSel() {
		driver.findElement(By.cssSelector("#glow-ingress-line2")).click();
	}
	@Test(description="Locating By CSS Selector(tag n id) Allv ")
	public void locatingCSSAll() {
		driver.findElement(By.cssSelector("div#nav-search-dropdown-card")).click();
	}
	@Test(description="Locating By CSS Selector(class) Cart To Deals")
	public void locatingCSSCartToDeals() {
		driver.navigate().to("https://www.amazon.in/gp/cart/view.html?ref_=nav_cart");
		driver.findElement(By.cssSelector(".a-link-normal")).click();
	}
	@Test(description="Locating By CSS Selector(tag n class) Set Language")
	public void locatingCSSSetLang() {
		driver.navigate().to("https://www.amazon.in/customer-preferences/edit?ie=UTF8&preferencesReturnUrl=%2Fref%3Dnav_logo&ref_=topnav_lang");
		driver.findElement(By.cssSelector("input.a-button-input")).click();
	}
	
}
