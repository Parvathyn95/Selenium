package com.obsqura.TestNGAssignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LocatorsId extends BaseTestNg  {
	@Test(description="locating with Id")
	public void locatorById(){
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("lakme peach milk moisturiser");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("lakme eyeconic kajal");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

}
