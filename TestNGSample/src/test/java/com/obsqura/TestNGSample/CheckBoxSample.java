package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxSample extends BaseObs {
	@Test
	public void checkboxSample() {
		String expMessage="Success - Check box is checked",actMessage;
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement check = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		Boolean selected=check.isSelected();
		if(selected==false) {
			check.click();
			if(check.isSelected()) {
			actMessage=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
			Assert.assertEquals(actMessage, expMessage);
			}
			Assert.assertTrue(check.isSelected(), "Button is not selected");
		}
		Assert.assertTrue(selected==false, "Button is already selected");
		
	}
}
