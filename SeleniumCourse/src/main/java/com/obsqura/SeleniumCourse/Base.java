package com.obsqura.SeleniumCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	public WebDriver initBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\SeleniumCourse\\src\\main\\java\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.ae/");
		return driver;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base obj=new Base();
		obj.initBrowser();
		
	}

}
