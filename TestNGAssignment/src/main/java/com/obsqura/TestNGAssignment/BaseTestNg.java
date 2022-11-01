
package com.obsqura.TestNGAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestNg {
	public WebDriver driver;
	@BeforeMethod
	public void initBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\JUnitSample\\src\\main\\java\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	}
	public void browserClose() {
		driver.close();
	}
	@AfterMethod
	public void browserQuit() {
		driver.quit();
	}

}
