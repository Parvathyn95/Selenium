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
		Boolean yesIsSelected,noIsSelected,resetIsEnabled,checkIsEnabled,msgFlag=false;
		SoftAssert softAssert = new SoftAssert();
		WebElement yes = driver.findElement(By.xpath("(//input[@name='name'])[1]"));
		WebElement no = driver.findElement(By.xpath("(//input[@name='name'])[2]"));
		WebElement reset = driver.findElement(By.xpath("//input[@value='Reset']"));
		WebElement check = driver.findElement(By.xpath("//input[@value='Check']"));
		yesIsSelected=yes.isSelected();
		noIsSelected=no.isSelected();
		resetIsEnabled=reset.isEnabled();
		checkIsEnabled=check.isEnabled();
		if(yes.isDisplayed()&&no.isDisplayed()&&reset.isDisplayed()&&check.isDisplayed()) {
			if(yesIsSelected==false&&noIsSelected==false) {
				msgFlag=true;
					if(resetIsEnabled==true&&checkIsEnabled==true) {
						msgFlag=true;
						check.click();
						actualMessage = driver.findElement(By.xpath("//p[@class='radiobutton']")).getText();
						Assert.assertEquals(actualMessage, expectedMessage);
						reset.click();
					}
					softAssert.assertTrue(msgFlag, "Reset button is not enabled");
					softAssert.assertTrue(msgFlag, "Check button is not enabled");
			}
			softAssert.assertTrue(msgFlag, "Yes radio button is already selected");
			softAssert.assertTrue(msgFlag, "No radio button is already selected");
		}
		softAssert.assertTrue(yes.isDisplayed(), "Yes radio button is not displayed");
		softAssert.assertTrue(no.isDisplayed(), "No radio button is not displayed");
		softAssert.assertTrue(reset.isDisplayed(), "Reset button is not displayed");
		softAssert.assertTrue(check.isDisplayed(), "Check button is not displayed");
	}
	@Test
	public void NoSelectClick() {
		String expectedMessage="Radio button is checked and it's value is No",actualMessage,inputLabel;
		Boolean yesIsSelected,noIsSelected,resetIsEnabled,checkIsEnabled,msgFlag=false;
		SoftAssert softAssert = new SoftAssert();
		WebElement yes = driver.findElement(By.xpath("(//input[@name='name'])[1]"));
		WebElement no = driver.findElement(By.xpath("(//input[@name='name'])[2]"));
		WebElement reset = driver.findElement(By.xpath("//input[@value='Reset']"));
		WebElement check = driver.findElement(By.xpath("//input[@value='Check']"));
		yesIsSelected=yes.isSelected();
		noIsSelected=no.isSelected();
		resetIsEnabled=reset.isEnabled();
		checkIsEnabled=check.isEnabled();
			if(yesIsSelected==false&&noIsSelected==true) {
			 msgFlag=true;
			 no.click();
				if(resetIsEnabled==true&&checkIsEnabled==true) {
					msgFlag=true;
					check.click();
					inputLabel = driver.findElement(By.xpath("//input[@id='no']")).getText();
					Assert.assertEquals(expectedMessage, "Radio button is checked and it's value is "+inputLabel);
					reset.click();
					}
					softAssert.assertTrue(msgFlag, "Reset button is not enabled");
					softAssert.assertTrue(msgFlag, "Check button is not enabled");
			}
			softAssert.assertTrue(msgFlag, "Yes radio button is already selected");
			softAssert.assertTrue(msgFlag, "No radio button is already selected");
	     }
}
