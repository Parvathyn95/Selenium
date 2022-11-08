package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestExecutionSpeed extends Base{
	@Test
	public void execSpeedId() {
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	}
	@Test
	public void execSpeedClass() {
		driver.findElement(By.className("nav-line-1-container")).click();
	}
	/*@Test
	public void execSpeedName() {
		driver.findElement(By.name("glow-modal")).click();
	}*/
	@Test
	public void execSpeedCSS() {
		driver.findElement(By.cssSelector("span#nav-link-accountList-nav-line-1")).click();
	}
	@Test
	public void execSpeedXpath() {
		driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
	}

}
