package com.obsqura.SeleniumAutomationCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BasePractice {
	public WebDriver driver;
	public WebDriver initBrowser() {
		System.setProperty("webdriver.opera.driver","C:\\Users\\admin\\eclipse-workspace\\SeleniumAutomationCourse\\src\\main\\java\\Resources\\operadriver.exe");
		driver = new OperaDriver();
		driver.get("https://www.javatpoint.com/");
		return driver;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasePractice obj = new BasePractice();
		obj.initBrowser();
	}

}
