package com.obsqura.TestNGSample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectFromDropdown extends BaseObs {
	@Test
	public void selectSample() {
		String inputText="Green";
		String expectedMessage="Selected Color : "+inputText,actualMessage;
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		Select objSelect=new Select(driver.findElement(By.id("single-input-field")));
		objSelect.selectByVisibleText(inputText);
		actualMessage = driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		Assert.assertEquals(expectedMessage, actualMessage, "Expected and actual are the same");
	}
	@Test
	public void selectByIndex() {
		String expectedColor="Red";
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		Select objSelect=new Select(driver.findElement(By.id("single-input-field")));
		objSelect.selectByIndex(1);
		List <WebElement> colorDropdown=objSelect.getOptions();
		Assert.assertEquals(colorDropdown.get(1).getText(), expectedColor);//how to give an assert here???
	}
	@Test
	public void selectByValue() {
		String inputValue="Yellow";
		String expectedMessage="Selected Color : "+inputValue,actualMessage;
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		Select objSelect=new Select(driver.findElement(By.id("single-input-field")));
		objSelect.selectByValue(inputValue);
		actualMessage= driver.findElement(By.xpath("//div[@id='message-one']")).getAttribute("value");
		Assert.assertEquals(expectedMessage, actualMessage, "Expected and actual are the same");
	}
	@Test
	public void elementCount() {
		int size,expSize=4;
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		Select objSelect=new Select(driver.findElement(By.id("single-input-field")));
		List<WebElement> elementCount = objSelect.getOptions();
		size= elementCount.size();
		Assert.assertEquals(size, expSize);
		
	}
}
