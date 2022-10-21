package com.obsqura.SeleniumFirefoxx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTrial {
	public WebDriver driver;
	public WebDriver initBrowser() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\eclipse-workspace\\SeleniumFirefoxx\\src\\main\\java\\Resources\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.kipling.co.ae/");
		return driver;
	}
	public void firefoxClose() {
		driver.close();
	}

}
