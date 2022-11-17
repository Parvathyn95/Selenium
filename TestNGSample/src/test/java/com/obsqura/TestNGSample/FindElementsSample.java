package com.obsqura.TestNGSample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FindElementsSample extends BaseObs{
	@Test
	public void checkBoxSelect() {
		String expMenu="Checkbox Demo", expUrl="https://selenium.obsqurazone.com/check-box-demo.php";
		List<WebElement> menuItems = driver.findElements(By.xpath("//li[@class='list-group-item']//a"));
		for(WebElement menu:menuItems) {
			if(menu.getText().equals(expMenu)) {
				menu.click();
				String actUrl=driver.findElement(By.xpath("//a[text()='Checkbox Demo']")).getAttribute("href");
				Assert.assertEquals(expUrl, actUrl);
				break;
			}
		}
	}
}
