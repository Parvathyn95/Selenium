package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertSample extends BaseObs {
	By clickMeButton = By.xpath("//button[@class='btn btn-success']");
	By cancelButton = By.xpath("//button[@class='btn btn-warning']");
	By promptBox = By.xpath("//button[@class='btn btn-danger']");
	@Test
	public void simpleAlertClick() {
		driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
		driver.findElement(clickMeButton).click();
		driver.switchTo().alert().accept();
		driver.findElement(clickMeButton).click();
		String actualText = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		driver.findElement(cancelButton).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(promptBox).click();
		driver.switchTo().alert().sendKeys("Parvathy");
		driver.switchTo().alert().accept();
		
	}
}
