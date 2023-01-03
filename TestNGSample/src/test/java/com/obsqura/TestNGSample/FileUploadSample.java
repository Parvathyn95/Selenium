package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileUploadSample extends BaseObs {
	@Test
	public void fileUpload() {
		driver.navigate().to("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		WebElement uploadFileButton = driver.findElement(By.xpath("//input[@id='myFile']"));
		uploadFileButton.sendKeys("C:\\Users\\admin\\Desktop\\READING SKILLS TEST.pdf");

	}
}