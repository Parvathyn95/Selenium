package com.obsqura.TestNGSample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FindElementsSample extends BaseObs{
	@Test
	public void findElementSample() {
		List<WebElement> menuItems = driver.findElements(By.xpath("//li[@class='list-group-item']"));
		
	}
}
