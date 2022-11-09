package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebElementCommands extends BaseObs {
	@Test
	public void sendKeysSample(){
		String inputMessage="Hello Obsqura",outputMessage;
		Boolean flag=false;
		driver.findElement(By.xpath("(//input[@id='single-input-field'][1])")).sendKeys(inputMessage);
		driver.findElement(By.xpath("//button[@id='button-one'][1]")).click();
		outputMessage= driver.findElement(By.xpath("//div[@id='message-one']")).getText();
	//	Your Message : Hello Obsqura  the messages wont be equal so we need to check boolean flag whether true or false  
		if(outputMessage.equals("Your Message : "+inputMessage)) {
			flag=true;
		}
		Assert.assertTrue(flag, "Input and output messages are not same");
	}
	@Test
	public void getTotal() {
		String valA="55",valB="60",actualValue;
		int aVal,bVal;
		Boolean flag=false;
		driver.findElement(By.xpath("(//input[@id='value-a'])[1]")).sendKeys(valA);
		driver.findElement(By.xpath("(//input[@id='value-b'])[1]")).sendKeys(valB);
		driver.findElement(By.xpath("(//button[@id='button-two'])[1]")).click();
		aVal=Integer.valueOf(valA);
		bVal=Integer.valueOf(valB);
		int totVal = aVal+bVal;
		actualValue=driver.findElement(By.xpath("(//div[@id='message-two'])[1]")).getText();
		//Total A + B : 115
		if(actualValue.equals("Total A + B : "+totVal)) {
			flag=true;
		}
		Assert.assertTrue(flag, "Actual and obtained total values are not the same");		
	}
}
