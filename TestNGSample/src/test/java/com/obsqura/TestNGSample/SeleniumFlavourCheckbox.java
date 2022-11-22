package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SeleniumFlavourCheckbox extends BaseTutPoint {
	@Test
	public void seleniumCheckboxSample() {
		SoftAssert softAssert = new SoftAssert();
		WebElement rcCheckbox = driver.findElement(By.xpath("//input[@value='RC']"));
		WebElement selIDECheckbox = driver.findElement(By.xpath("//input[@value='Selenium IDE']"));
		WebElement selWebDriverCheckbox = driver.findElement(By.xpath("//input[@value='Selenium Webdriver']"));
		  if(rcCheckbox.isDisplayed()&&selIDECheckbox.isDisplayed()&&selWebDriverCheckbox.isDisplayed()) {
			  if(rcCheckbox.isSelected()&&selIDECheckbox.isSelected()&&selWebDriverCheckbox.isSelected()) {
				  System.out.println("None of the checkboxes selected by default");
			  }
			  softAssert.assertFalse(rcCheckbox.isSelected(),"RC Checkbox already selected");
			  softAssert.assertFalse(selIDECheckbox.isSelected(),"Selenium IDE Checkbox already selected");
			  softAssert.assertFalse(selWebDriverCheckbox.isSelected(),"Selenium WebDriver Checkbox already selected");
		}
		softAssert.assertTrue(rcCheckbox.isDisplayed(),"RC Checkbox not displayed");
		softAssert.assertTrue(selIDECheckbox.isDisplayed(),"Selenium IDE Checkbox not displayed");
		softAssert.assertTrue(selWebDriverCheckbox.isDisplayed(),"Selenium WebDriver Checkbox not displayed");
	}
	@Test
	public void selectWebdriverCheckbox() {
		WebElement selWebdriver=driver.findElement(By.xpath("//input[@value='Selenium Webdriver']"));
		selWebdriver.click();
		if(selWebdriver.isEnabled()) {
		Assert.assertTrue(true, "Selenium webdriver is not enabled");
		}
		else {
		Assert.assertFalse(false);
		}
		}
}
