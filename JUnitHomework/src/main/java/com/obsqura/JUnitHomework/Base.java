package com.obsqura.JUnitHomework;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {

	public WebDriver driver;

	@Before
	public void initEdgeBrowser() {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\admin\\eclipse-workspace\\JUnitHomework\\src\\main\\java\\Resources\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
	}

	@After
	public void browserQuit() {
		driver.quit();
	}

}
