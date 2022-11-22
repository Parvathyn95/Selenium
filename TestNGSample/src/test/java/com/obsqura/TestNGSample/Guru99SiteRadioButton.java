package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Guru99SiteRadioButton extends BaseGuru {
	@Test
	public void yesNoDeselectCheck() {
		String expectedMessage="Radio button is Not checked",actualMessage;
		SoftAssert softAssert = new SoftAssert();
		WebElement yes = driver.findElement(By.xpath("(//input[@name='name'])[1]"));
		WebElement no = driver.findElement(By.xpath("(//input[@name='name'])[2]"));
		WebElement reset = driver.findElement(By.xpath("//input[@value='Reset']"));
		WebElement check = driver.findElement(By.xpath("//input[@value='Check']"));
		if(yes.isDisplayed()&&no.isDisplayed()&&reset.isDisplayed()&&check.isDisplayed()) {
			if((yes.isSelected())!=true&&((no.isSelected())!=true)) {
					if(reset.isEnabled()&&check.isEnabled()==true) {
						check.click();
						actualMessage = driver.findElement(By.xpath("//p[@class='radiobutton']")).getText();
						Assert.assertEquals(actualMessage, expectedMessage);
						reset.click();
					}
					softAssert.assertTrue(reset.isEnabled(), "Reset button is not enabled");
					softAssert.assertTrue(check.isEnabled(), "Check button is not enabled");
					softAssert.assertAll();
			}
			softAssert.assertFalse(yes.isSelected(), "Yes radio button is already selected");
			softAssert.assertFalse(no.isSelected(), "No radio button is already selected");
			softAssert.assertAll();
		}
		softAssert.assertTrue(yes.isDisplayed(), "Yes radio button is not displayed");
		softAssert.assertTrue(no.isDisplayed(), "No radio button is not displayed");
		softAssert.assertTrue(reset.isDisplayed(), "Reset button is not displayed");
		softAssert.assertTrue(check.isDisplayed(), "Check button is not displayed");
		softAssert.assertAll();
	}
	@Test
	public void NoSelectClick() {
		String expectedMessage="Radio button is checked and it's value is No",actualMessage,inputLabel;
		SoftAssert softAssert = new SoftAssert();
		WebElement yes = driver.findElement(By.xpath("(//input[@name='name'])[1]"));
		WebElement no = driver.findElement(By.xpath("(//input[@name='name'])[2]"));
		WebElement reset = driver.findElement(By.xpath("//input[@value='Reset']"));
		WebElement check = driver.findElement(By.xpath("//input[@value='Check']"));
			if((yes.isSelected())!=true&&((no.isSelected())!=true)) {
			 no.click();
				if(reset.isEnabled()&&check.isEnabled()==true) {
					check.click();
					inputLabel = driver.findElement(By.xpath("//input[@id='no']")).getAttribute("value");
					Assert.assertEquals(expectedMessage, "Radio button is checked and it's value is "+inputLabel);
					reset.click();
					}
					softAssert.assertTrue(reset.isEnabled(), "Reset button is not enabled");
					softAssert.assertTrue(check.isEnabled(), "Check button is not enabled");
					softAssert.assertAll();
			}
			softAssert.assertFalse(yes.isSelected(), "Yes radio button is already selected");
			softAssert.assertFalse(no.isSelected(), "No radio button is already selected");
			softAssert.assertAll();		
	     }
}
