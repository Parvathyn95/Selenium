package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Locators extends Base {
	@Test(description="Locating By ID")
	public void locatingById(){
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Kipling sling bags");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("kipling sling bags multicolor");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}
}
