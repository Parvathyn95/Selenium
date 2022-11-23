package com.obsqura.TestNGSample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContinentDropDown extends BaseTutPoint{
	@Test
	public void selectAustralia() {
		String inputText="Australia",actualText;
		Select objSelection = new Select(driver.findElement(By.xpath("//select[@name='continents']")));
		objSelection.selectByVisibleText(inputText);
		actualText =objSelection.getFirstSelectedOption().getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText, inputText,"Actual selected value not the same as inputText");
	}
	@Test
	public void noOfElements() {
		Select objSelection = new Select(driver.findElement(By.xpath("//select[@name='continents']")));
		List <WebElement> elementSize = objSelection.getOptions();
		int numberOfElements = elementSize.size();
		   for(int i=0;i<=6;i++) {
			System.out.println(elementSize.get(i).getText());	
		   }
		   Assert.assertNotNull(elementSize.size(), "No Elements found");
	}

}
