package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SeleniumFlavourCheckbox extends BaseTutPoint {
	@Test
	public void seleniumCheckboxSample() {
		SoftAssert softAssert = new SoftAssert();
		WebElement rcCheckbox = driver.findElement(By.xpath("(//input[@name='tool'])[1]"));
		WebElement selIDECheckbox = driver.findElement(By.xpath("(//input[@name='tool'])[2]"));
		WebElement selWebDriverCheckbox = driver.findElement(By.xpath("(//input[@name='tool'])[3]"));
		String text = selWebDriverCheckbox.getAttribute("value");
		  if(rcCheckbox.isDisplayed()&&selIDECheckbox.isDisplayed()&&selWebDriverCheckbox.isDisplayed()) {
			  if(rcCheckbox.isSelected()&&selIDECheckbox.isSelected()&&selWebDriverCheckbox.isSelected()) {
				  selWebDriverCheckbox.click();  
			  }
			  softAssert.assertFalse(rcCheckbox.isSelected(),"RC Checkbox not displayed");
			  softAssert.assertFalse(selIDECheckbox.isSelected(),"Selenium IDE Checkbox not displayed");
			  softAssert.assertFalse(selWebDriverCheckbox.isSelected(),"Selenium WebDriver Checkbox not displayed");
		}
		softAssert.assertTrue(rcCheckbox.isDisplayed(),"RC Checkbox not displayed");
		softAssert.assertTrue(selIDECheckbox.isDisplayed(),"Selenium IDE Checkbox not displayed");
		softAssert.assertTrue(selWebDriverCheckbox.isDisplayed(),"Selenium WebDriver Checkbox not displayed");
	}

}
