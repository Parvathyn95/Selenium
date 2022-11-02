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
	@Test(description="Locating By Class Amazon")
	public void locatingClass() {
		driver.findElement(By.className("hm-icon-label")).click();
	}
}
