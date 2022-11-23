package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorsBaseObs extends BaseObs {
	@Test(description="Locating By Link Text")
	public void locatingbyLinkText() {
		WebElement radio = driver.findElement(By.linkText("Radio Buttons Demo"));
		radio.click();
	}
	@Test(description="Locating By Partial Link Text")
	public void locatingbyPartialLinkText() {
		driver.findElement(By.partialLinkText("Radio Buttons")).click();
	}
	

}
