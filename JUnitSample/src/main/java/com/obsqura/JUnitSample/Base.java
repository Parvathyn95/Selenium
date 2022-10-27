package com.obsqura.JUnitSample;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	@Before
	public void initBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\JUnitSample\\src\\main\\java\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		
	}
	public void browserClose() {
		driver.close();
	}
	@After
	public void browserQuit() {
		driver.quit();
	}
}
