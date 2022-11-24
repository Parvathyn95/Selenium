package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumCheckRadioEnSel extends BaseSelenium{
	@Test
	public void redCheckBoxEnabledorNot() {
		WebElement redCheckBox = driver.findElement(By.xpath("//input[@value='red']"));
		if(redCheckBox.isEnabled()) {

		}
		Assert.assertTrue(redCheckBox.isEnabled(), "Red Check box is disabled");
	}
	@Test
	public void redCheckBoxSelectedorNot() {
		WebElement redCheckBox = driver.findElement(By.xpath("//input[@value='red']"));
		if(redCheckBox.isSelected()) {
			redCheckBox.click();
		}
		Assert.assertFalse(redCheckBox.isSelected(), "Red Check box is already selected");
	}
	@Test
	public void operaRadioBoxSelectedorNot() {
		WebElement operaRadioBox = driver.findElement(By.xpath("//input[@value='Opera']"));
		if(operaRadioBox.isSelected()) {
			operaRadioBox.click();
		}
		Assert.assertFalse(operaRadioBox.isSelected(), "Red Check box is already selected");
	}

}
