package com.obsqura.SeleniumAutomationCourse;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

import com.obsqura.SeleniumAutomationCourse.Base;

public class Base {
	public WebDriver driver;
	public WebDriver initBrowser() {
		System.setProperty("webdriver.opera.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumAutomationCourse\\src\\main\\java\\Resources\\operadriver.exe");
		driver = new OperaDriver();
		driver.get("http://www.opesmount.in/grocerystore1/");
		return driver;
	}
	public void operaClose() {
		driver.close();
	}
}
