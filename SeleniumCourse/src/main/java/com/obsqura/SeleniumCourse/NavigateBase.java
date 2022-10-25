package com.obsqura.SeleniumCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBase {
	public WebDriver driver;
	public WebDriver initBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumCourse\\src\\main\\java\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.opesmount.in/grocerystore1/");
		driver.manage().window().maximize();
		return driver;
	}
	public void browserClose() {
		driver.close();
	}
	public void browserQuit() {
		driver.quit();
	}
}
