package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WebElementCommands extends BaseObs {
	@Test
	public void sendKeysSample() throws InterruptedException {
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//input[@id='single-input-field'][1])")).sendKeys("Apple");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//button[@id='button-one'][1]")).click();
	}

}
