package com.obsqura.JUnitSample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BrowserCommands extends Base {
	@Test
	public void basicCommands() {
		String actualTitle, actualUrl, actualSource, expectedTitle="Obsqura Testing";
		actualTitle = driver.getTitle(); // get title of actual page
		// System.out.println(actualTitle);
		actualUrl = driver.getCurrentUrl(); // get url of the actual page
		// System.out.println(actualUrl);
		actualSource = driver.getPageSource();
	/*	if (actualTitle.equals(expectedTitle)) {
			System.out.println("Expected and actual title are the same");
		} else {
			System.out.println("Expected and actual title are not the same");
		}*/
		assertEquals(expectedTitle, actualTitle);
	}
	@Test
	public void navigateCommands() {
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php"); // navigate to new webpage
		driver.navigate().back(); // load back the initial webpage
		driver.navigate().forward(); // goes again to the navigated webpage
		driver.navigate().refresh();
	}
}
