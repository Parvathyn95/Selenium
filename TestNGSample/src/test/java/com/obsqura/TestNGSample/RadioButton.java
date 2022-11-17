package com.obsqura.TestNGSample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButton extends BaseObs{
	@Test
	public void radioButtonSample() {
		String expMenu = "Radio Buttons Demo",expUrl="https://selenium.obsqurazone.com/radio-button-demo.php";
		List<WebElement> menuOpt = driver.findElements(By.xpath("//li[@class='list-group-item']//a"));
		for(WebElement menu:menuOpt) {
			if(menu.getText().equals(expMenu)) {
				menu.click();
				String actUrl=driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']")).getAttribute("href");
				Assert.assertEquals(expUrl, actUrl);
				break;
			}
		}
	}
}
