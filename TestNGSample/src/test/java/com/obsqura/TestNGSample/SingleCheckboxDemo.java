package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SingleCheckboxDemo extends BaseObs{
	@Test
	public void singleCheckboxSample() {
		Boolean clickIsSelected,selectAllIsSelected,selectAllIsEnabled,msgFlag=false;
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement click = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		clickIsSelected =  click.isSelected();
		
		
	}

}
