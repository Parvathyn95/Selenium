package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MultipleCheckboxDemo extends BaseObs {
	@Test
	public void multipleCheckboxSample() {
		String expectedButtonValue = "Unselect All",actualButtonValue;
		Boolean checkBox1IsDisplayed,checkBox1IsSelected,checkBox2IsDisplayed,checkBox2IsSelected,checkBox3IsDisplayed,checkBox3IsSelected,checkBox4IsDisplayed,checkBox4IsSelected,selectAllIsEnabled,selectAllIsSelected,msgFlag=false;
		SoftAssert softAssert = new SoftAssert();
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement checkBox1 = driver.findElement(By.xpath("//input[@id='check-box-one']"));
		WebElement checkBox2 = driver.findElement(By.xpath("//input[@id='check-box-two']"));
		WebElement checkBox3 = driver.findElement(By.xpath("//input[@id='check-box-three']"));
		WebElement checkBox4 = driver.findElement(By.xpath("//input[@id='check-box-four']"));
		WebElement selectAll = driver.findElement(By.xpath("//input[@id='button-two']"));
		   if(checkBox1.isDisplayed()&&checkBox2.isDisplayed()&&checkBox3.isDisplayed()&&checkBox4.isDisplayed()) {
			 	if(checkBox1.isSelected()&&checkBox2.isSelected()&&checkBox3.isSelected()&&checkBox4.isSelected()) {
			 		if(selectAll.isEnabled()) {
			 		  		//msgFlag=true;
			 		  		selectAll.click();
			 		  		actualButtonValue = driver.findElement(By.xpath("//input[@value='Unselect All']")).getAttribute("value");
			 		  		Assert.assertEquals(expectedButtonValue, actualButtonValue);
			 		}
			 		Assert.assertTrue(selectAll.isEnabled(), "Select All Button is disabled");      //softassert
			 	}
			 	softAssert.assertFalse(checkBox1.isSelected(), "CheckBox 1 is not selected");
				softAssert.assertFalse(checkBox2.isSelected(), "CheckBox 2 is not selected");
				softAssert.assertFalse(checkBox3.isSelected(), "CheckBox 3 is not selected");
				softAssert.assertFalse(checkBox4.isSelected(), "CheckBox 4 is not selected");
				softAssert.assertAll();
		  }
			softAssert.assertTrue(checkBox1.isDisplayed(), "CheckBox 1 is not displayed");
			softAssert.assertTrue(checkBox2.isDisplayed(), "CheckBox 2 is not displayed");
			softAssert.assertTrue(checkBox3.isDisplayed(), "CheckBox 3 is not displayed");
			softAssert.assertTrue(checkBox4.isDisplayed(), "CheckBox 4 is not displayed");
			softAssert.assertAll();
	}

}
