package com.obsqura.TestNGSample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButton extends BaseObs{
	@Test
	public void checkMale() {
		String actUrl,expUrl="https://selenium.obsqurazone.com/radio-button-demo.php",actText, expText="Radio Button Demo",actBg,expBg="rgba(0, 123, 255, 1)";
		String inpLabel,expLabel="Radio button 'Male' is checked";
		Boolean selected,msgFlag=false;
		driver.findElement(By.xpath("//a[@href='radio-button-demo.php']")).click();
		actUrl=driver.getCurrentUrl();
		Assert.assertEquals(expUrl, actUrl);      //checking actual and expected Url
		actText=driver.findElement(By.xpath("(//div[@class='card-header'])[2]")).getText();
		Assert.assertEquals(expText, actText);	 //checking actual and expected text
		WebElement male = driver.findElement(By.xpath("(//input[@class='form-check-input'])[1]"));
		selected=male.isSelected();
		if(selected==false) {
			msgFlag=true;
			male.click();
			if(male.isSelected()) {
				msgFlag=true;
				WebElement show=driver.findElement(By.xpath("//button[@id='button-one']"));
				show.click();
				inpLabel=driver.findElement(By.xpath("//label[@for='inlineRadio1']")).getText();
				Assert.assertEquals(expLabel, "Radio button "+"'"+inpLabel+"'"+" is checked");
		}
			Assert.assertTrue(msgFlag, "Button is not selected");
	  }
			Assert.assertTrue(msgFlag, "Button is already selected");
	}
	
	@Test
	public void checkFemale() {
		String inpLabel,expLabel="Radio button 'Female' is checked";
		Boolean selected,msgFlag = false;
		driver.findElement(By.xpath("//a[@href='radio-button-demo.php']")).click();
		WebElement female = driver.findElement(By.xpath("(//input[@class='form-check-input'])[2]"));
		selected=female.isSelected();
		if(selected==false) {
			msgFlag=true;
			female.click();
			if(female.isSelected()) {
				msgFlag=true;
				WebElement show=driver.findElement(By.xpath("//button[@id='button-one']"));
				show.click();
				inpLabel=driver.findElement(By.xpath("//label[@for='inlineRadio2']")).getText();
				Assert.assertEquals(expLabel, "Radio button "+"'"+inpLabel+"'"+" is checked");
		}
			Assert.assertTrue(msgFlag, "Button is not selected");
	  }
			Assert.assertTrue(msgFlag, "Button is already selected");
	}
	
}
