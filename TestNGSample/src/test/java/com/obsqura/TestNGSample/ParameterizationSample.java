package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationSample extends BaseObs{
	@Test(enabled=false)
	@Parameters({"sendKeys"})
	public void sendKeyValue(String sendKeys) {
		WebElement singleInputField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputField.sendKeys(sendKeys);
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessageButton.click();
	}
	@Test(dataProvider="SearchProvider")
	public void methodWithDataProvider(String input) {
		WebElement singleInputField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputField.sendKeys(input);
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessageButton.click();
		singleInputField.clear();
	}
	@DataProvider(name="SearchProvider")
	public Object[][] getDataFromSearchProvider(){
		return new Object[][]
				{
					{"Apple"},
					{"Strawberry"},
					{"Mango"}
				};
	}
}
