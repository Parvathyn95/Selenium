package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormSubmit extends BaseObs {
	@Test
	public void subForm() {
		Boolean selected,flag=false;
		String inputMsg,expMsg="Form has not been submitted successfully!";
		driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		driver.findElement(By.xpath("//input[@id='validationCustom01']")).sendKeys("Parvathy");
		driver.findElement(By.xpath("//input[@id='validationCustom02']")).sendKeys("Nair");
		driver.findElement(By.xpath("//input[@id='validationCustomUsername']")).sendKeys("Parvathyn95");
		driver.findElement(By.xpath("//input[@id='validationCustom03']")).sendKeys("Sharjah");
		driver.findElement(By.xpath("//input[@id='validationCustom04']")).sendKeys("Dubai");
		driver.findElement(By.xpath("//input[@id='validationCustom05']")).sendKeys("00000");
		driver.findElement(By.xpath("//input[@id='invalidCheck']")).click();
		selected=driver.findElement(By.xpath("//input[@id='invalidCheck']")).isSelected();
		if(selected==true) {
			flag=true;
		}
		Assert.assertTrue(flag, "The check button is not selected");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		inputMsg=driver.findElement(By.xpath("//div[@class='my-2']")).getText();
		if(expMsg.equals(inputMsg)) {
			flag=true;
		}
		Assert.assertTrue(flag, "Submitted Message doesnot match");
	}
}
