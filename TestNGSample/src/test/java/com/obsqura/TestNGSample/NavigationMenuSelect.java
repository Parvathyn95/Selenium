package com.obsqura.TestNGSample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NavigationMenuSelect extends BaseObs {
	@Test
	public String navigationMenuClick(String expectedString) {
		List <WebElement> navMenuItems = driver.findElements(By.xpath("//li[@class='nav-item']"));
			for(WebElement navMenu : navMenuItems) {
				if(navMenu.getText().equals(expectedString)) {
					navMenu.click();
				}
			}
			return expectedString;
	}
}
