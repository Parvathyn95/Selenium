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
	@Test(description="locating by class All")
	public void locatingAll() {
		driver.findElement(By.className("hm-icon-label")).click();
		driver.findElement(By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_em_cs_bestsellers_0_1_1_2']")).click();
	}
	@Test(description="locating by class Electronics Fashion")
	public void locatingElectronicsnFashion() {
		driver.findElement(By.xpath("//a[@href='/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics']")).click();
		driver.findElement(By.xpath("//a[@class='nav-logo-link nav-progressive-attribute']")).click();
		driver.findElement(By.xpath("//a[@href='/gp/browse.html?node=6648217031&ref_=nav_cs_fashion']")).click();	
		driver.findElement(By.xpath("//a[@class='nav-logo-link nav-progressive-attribute']")).click();
	}

}
