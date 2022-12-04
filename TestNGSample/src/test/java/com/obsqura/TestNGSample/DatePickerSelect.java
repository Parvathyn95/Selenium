package com.obsqura.TestNGSample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DatePickerSelect extends BaseObs {
	@Test
	public void datePickSelect() {
		String expMenu="Date Pickers",expUrl1="https://selenium.obsqurazone.com/date-picker.php";
		List<WebElement> dateMenu = driver.findElements(By.xpath("//li[@class='nav-item']//a"));
		  for(WebElement date:dateMenu) {
			if(date.getText().equalsIgnoreCase(expMenu)) {
				date.click();
				String actUrl=driver.getCurrentUrl();
				Assert.assertEquals(expUrl1, actUrl);
				break;
			}
		  }
	}
}
