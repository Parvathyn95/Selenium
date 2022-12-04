package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormSubmit extends BaseObs {
	@Test
	public void subForm() {
		String inputMsg,expMsg="Form has been submitted successfully!";
		driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		driver.findElement(By.xpath("//input[@id='validationCustom01']")).sendKeys("Parvathy");
		driver.findElement(By.xpath("//input[@id='validationCustom02']")).sendKeys("Nair");
		driver.findElement(By.xpath("//input[@id='validationCustomUsername']")).sendKeys("Parvathyn95");
		driver.findElement(By.xpath("//input[@id='validationCustom03']")).sendKeys("Sharjah");
		driver.findElement(By.xpath("//input[@id='validationCustom04']")).sendKeys("Dubai");
		driver.findElement(By.xpath("//input[@id='validationCustom05']")).sendKeys("00000");
		WebElement checkbox =driver.findElement(By.xpath("//input[@id='invalidCheck']"));
		if(checkbox.isSelected()) {
			checkbox.click();
			inputMsg=driver.findElement(By.xpath("//div[@class='my-2']")).getText();
			Assert.assertEquals(expMsg, inputMsg,"Expected and input message doesnot match");
		}
		Assert.assertFalse(checkbox.isSelected(), "The checkbox is already selected");
	}
}
