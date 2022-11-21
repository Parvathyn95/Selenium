package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectFromDropdown extends BaseObs {
	@Test
	public void selectSample() {
		String inputText="Green";
		String expectedMessage="Selected Color : "+inputText;
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		Select objSelect=new Select(driver.findElement(By.id("single-input-field")));
		objSelect.selectByVisibleText(inputText);
	}

}
