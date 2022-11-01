package com.obsqura.TestNGSample;


//import org.testng.asserts.SoftAssert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserCommands extends Base {
	@Test
	public void verifyTitle() {
		String actualTitle, actualUrl, actualSource, expectedTitle="Welcome to Amazon.ae Shop Online in UAE for Electronics, Apparel, Computers, Grocery &amp; more | Amazon.ae";
		actualTitle = driver.getTitle(); // get title of actual page
		
		actualSource = driver.getPageSource();
		Assert.assertEquals(expectedTitle, actualTitle);
	//	SoftAssert softAssert=new SoftAssert();
	//	softAssert.

	}
	@Test
	public void verifyUrl() {
		String actualUrl, expUrl="https";
		actualUrl = driver.getCurrentUrl(); 
		if(actualUrl.contains(expUrl)) {
			System.out.println("Page source Exists");
		}
		else{
			System.out.println("Page source doesnot Exists");
		}
		
	}
	/*@Test
	public void navigateCommands() {
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php"); // navigate to new webpage
		driver.navigate().back(); // load back the initial webpage
		driver.navigate().forward(); // goes again to the navigated webpage
		driver.navigate().refresh();
	}*/
}
