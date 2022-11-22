package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SingleCheckboxDemo extends BaseObs{
	@Test
	public void singleCheckboxSample() {
		String expectedMessage = "Success - Check box is checked",actualMessage;
		Boolean checkBoxIsDisplayed,checkBoxIsSelected,msgFlag=false;
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement checkBox = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		checkBoxIsSelected =  checkBox.isSelected();
		checkBoxIsDisplayed = checkBox.isDisplayed();
		   if(checkBoxIsDisplayed==true) {
			 msgFlag=true;
			 	if(checkBoxIsSelected=false) {
			 		msgFlag=true;
			 		checkBox.click();
			 		actualMessage = driver.findElement(By.xpath("//div[@id='message-one']")).getText();
			 		Assert.assertEquals(expectedMessage, actualMessage);
			 	}
			 	Assert.assertTrue(msgFlag,"Click Checkbox is already selected"); 
		   }
			Assert.assertTrue(msgFlag,"Click Checkbox is not displayed");
	}
}
