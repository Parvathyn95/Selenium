package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LocateByContaindOrAnd extends BaseObs {
	@Test(description="starts-with")
	public void locatingByStartsWith() {
		String inputText = "Strwaberry Cake";
		WebElement singleInputField = driver.findElement(By.xpath("//label[starts-with(@for, 'input')]"));
		WebElement showMessageButton = driver.findElement(By.xpath("//button[starts-with(@id, 'button-')]"));
			if(singleInputField.isEnabled()) {
				String actualMessage,expectedMessage="Your Message : "+inputText;
				singleInputField.sendKeys(inputText);
				showMessageButton.click();
				actualMessage = driver.findElement(By.xpath("//div[starts-with(@id,'message-')]")).getText();
				Assert.assertEquals(expectedMessage, actualMessage, "Expected and Actual Message are not equal");
			}
			Assert.assertTrue(singleInputField.isEnabled(), "Single Input Field is disabled");
	}
	@Test(description="contains")
	public void locatingByContains() {
		String inputText = "ObsquraZone";
		WebElement singleInputField = driver.findElement(By.xpath("//input[contains(@id,'single-input')]"));
		WebElement showMessageButton = driver.findElement(By.xpath("//button[contains(text(),'Show')]"));
			if(singleInputField.isEnabled()) {
				String actualMessage,expectedMessage="Your Message : "+inputText;
				singleInputField.sendKeys(inputText);
				showMessageButton.click();
				actualMessage = driver.findElement(By.xpath("//div[contains(text(),'Your')]")).getText();
				Assert.assertEquals(expectedMessage, actualMessage, "Expected and Actual Message are not equal");
			}
			Assert.assertTrue(singleInputField.isEnabled(), "Single Input Field is disabled");
	}
	@Test
	public void locatingByOr(){
		String inputText = "Apple and Oranges";
		WebElement singleInputField = driver.findElement(By.xpath("//input[@id='single-input-field' or @placeholder='Message']"));
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@class='btn btn-primary' or @text()='Show Message']"));
			if(singleInputField.isEnabled()) {
				String actualMessage,expectedMessage="Your Message : "+inputText;
				singleInputField.sendKeys(inputText);
				showMessageButton.click();
				actualMessage = driver.findElement(By.xpath("//div[@id='message-one' or @class='my-2']")).getText();
				Assert.assertEquals(expectedMessage, actualMessage, "Expected and Actual Message are not equal");
			}
			Assert.assertTrue(singleInputField.isEnabled(), "Single Input Field is disabled");
	}
	@Test
	public void locatingByAnd() {
		String inputText = "Selenium Automation";
		WebElement singleInputField = driver.findElement(By.xpath("//input[@class='form-control' and @id='single-input-field']"));
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one' and text() = 'Show Message']"));
			if(singleInputField.isEnabled()) {
				String actualMessage,expectedMessage="Your Message : "+inputText;
				singleInputField.sendKeys(inputText);
				showMessageButton.click();
				actualMessage = driver.findElement(By.xpath("//div[@id='message-one' and @class ='my-2']")).getText();
				Assert.assertEquals(expectedMessage, actualMessage, "Expected and Actual Message are not equal");
			}
			Assert.assertTrue(singleInputField.isEnabled(), "Single Input Field is disabled");
	}
	@Test
	public void locatingByTextOf() {
		String inputText = "Christmas Card";
		WebElement singleInputField = driver.findElement(By.xpath("//input[@id = 'single-input-field']"));
		WebElement showMessageButton = driver.findElement(By.xpath("//button[text()='Show Message']"));
			if(singleInputField.isEnabled()) {
				String actualMessage,expectedMessage="Your Message : "+inputText;
				singleInputField.sendKeys(inputText);
				showMessageButton.click();
				actualMessage = driver.findElement(By.xpath("//div[text()='Your Message : ']")).getText();
				Assert.assertEquals(expectedMessage, actualMessage,"Expected and Actual Message are not equal" );
			}
			Assert.assertTrue(singleInputField.isEnabled(), "Single Input Field is disabled");
	}
	@Test
	public void locatingBySibling() {
		String inputText = "Love Dale";
		WebElement singleInputField = driver.findElement(By.xpath("//label[@for='inputEmail4']//following-sibling::input"));
		WebElement showMessageButton = driver.findElement(By.xpath("//div[@class='form-group']//following-sibling::button[@id='button-one']"));
		if(singleInputField.isEnabled()) {
			String actualMessage,expectedMessage="Your Message : "+inputText;
			singleInputField.sendKeys(inputText);
			showMessageButton.click();
			actualMessage = driver.findElement(By.xpath("//div[@class='form-group']//following-sibling::div[@id='message-one']")).getText();
			Assert.assertEquals(expectedMessage, actualMessage,"Expected and Actual Message are not equal" );
		}
		Assert.assertTrue(singleInputField.isEnabled(), "Single Input Field is disabled");
	}
	@Test
	public void locatingByChild() {
		String inputText = "Dolphinarium";
		WebElement singleInputField = driver.findElement(By.xpath("//div[@class='form-group']//child::input[@placeholder='Message']"));
		WebElement showMessageButton = driver.findElement(By.xpath("//form[@method='POST']//child::button[@id='button-one']"));
		if(singleInputField.isEnabled()) {
			String actualMessage,expectedMessage="Your Message : "+inputText;
			singleInputField.sendKeys(inputText);
			showMessageButton.click();
			actualMessage = driver.findElement(By.xpath("//form[@method='POST']//child::div[@id='message-one']")).getText();
			Assert.assertEquals(expectedMessage, actualMessage,"Expected and Actual Message are not equal" );
		}
		Assert.assertTrue(singleInputField.isEnabled(), "Single Input Field is disabled");
	}
	@Test
	public void locatingByParent() {
		String inputText = "Sweet Potato";
		WebElement singleInputField = driver.findElement(By.xpath("//input[@id='single-input-field']//parent::div[@class='form-group']//child::input[@placeholder='Message']"));
		WebElement showMessageButton = driver.findElement(By.xpath("//input[@id='single-input-field']//parent::div[@class='form-group']//following::button[@id='button-one']"));
			if(singleInputField.isEnabled()) {
				String actualMessage,expectedMessage="Your Message : "+inputText;
				singleInputField.sendKeys(inputText);
				showMessageButton.click();
				actualMessage = driver.findElement(By.xpath("//input[@id='single-input-field']//parent::div[@class='form-group']//following::div[@id='message-one']")).getText();
				Assert.assertEquals(expectedMessage, actualMessage,"Expected and Actual Message are not equal" );
			}
			Assert.assertTrue(singleInputField.isEnabled(), "Single Input Field is disabled");
	}
	@Test
	public void locatingByFollowing() {
		String inputText = "Happy Birthday";
		WebElement singleInputField = driver.findElement(By.xpath("//div[@class='form-group']//following::input[@id='single-input-field']"));
		WebElement showMessageButton = driver.findElement(By.xpath("//div[@class='form-group']//following::button[contains(text(),'Show Message')]"));
		if(singleInputField.isEnabled()) {
			String actualMessage,expectedMessage="Your Message : "+inputText;
			singleInputField.sendKeys(inputText);
			showMessageButton.click();
			actualMessage = driver.findElement(By.xpath("//div[@class='form-group']//following::div[@id='message-one']")).getText();
			Assert.assertEquals(expectedMessage, actualMessage,"Expected and Actual Message are not equal" );
		}
		Assert.assertTrue(singleInputField.isEnabled(), "Single Input Field is disabled");
	}
	@Test 
	public void locatingBySelf() {
		String inputText = "Noodles";
		WebElement singleInputField = driver.findElement(By.xpath("//input[@id='single-input-field']//self::input"));
		WebElement showMessageButton = driver.findElement(By.xpath("//button[contains(text(),'Show Message')]//self::button"));
			if(singleInputField.isEnabled()) {
				String actualMessage,expectedMessage="Your Message : "+inputText;
				singleInputField.sendKeys(inputText);
				showMessageButton.click();
				actualMessage = driver.findElement(By.xpath("//div[@id='message-one']//self::div")).getText();
				Assert.assertEquals(expectedMessage, actualMessage,"Expected and Actual Message are not equal" );
		}
		Assert.assertTrue(singleInputField.isEnabled(), "Single Input Field is disabled");
	}
	@Test
	public void locatingByPreceding() {
		String inputText = "Face Cream";
		WebElement singleInputField = driver.findElement(By.xpath("//div[@class='example my-3']//preceding::input[@id='single-input-field']"));
		WebElement showMessageButton = driver.findElement(By.xpath("//div[@class='example my-3']//preceding::button[@id='button-one']"));
			if(singleInputField.isEnabled()) {
				String actualMessage,expectedMessage="Your Message : "+inputText;
				singleInputField.sendKeys(inputText);
				showMessageButton.click();
				actualMessage = driver.findElement(By.xpath("//div[@class='example my-3']//preceding::div[@id='message-one']")).getText();
				Assert.assertEquals(expectedMessage, actualMessage,"Expected and Actual Message are not equal" );
			}
		Assert.assertTrue(singleInputField.isEnabled(), "Single Input Field is disabled");
	}
	@Test
	public void locatingByAncestor() {
		String inputText = "Lakme Eyekajal";
		WebElement singleInputField = driver.findElement(By.xpath("/input[@id='single-input-field']//ancestor::div[@class='form-group']//child::input[@placeholder='Message']"));
		WebElement showMessageButton = driver.findElement(By.xpath("//input[@id='single-input-field']//ancestor::form[@method='POST']//child::button[@id='button-one']"));
			if(singleInputField.isEnabled()) {
				String actualMessage,expectedMessage="Your Message : "+inputText;
				singleInputField.sendKeys(inputText);
				showMessageButton.click();
				actualMessage = driver.findElement(By.xpath("//input[@id='single-input-field']//ancestor::form[@method='POST']//child::div[@id='message-one']//div[@class='example my-3']//preceding::div[@id='message-one']")).getText();
				Assert.assertEquals(expectedMessage, actualMessage,"Expected and Actual Message are not equal" );
			}
			Assert.assertTrue(singleInputField.isEnabled(), "Single Input Field is disabled");
	}
}
