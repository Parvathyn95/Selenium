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
}
