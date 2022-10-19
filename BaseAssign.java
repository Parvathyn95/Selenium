package com.obsqura.SeleniumCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseAssign {
	public WebDriver driver;
	public WebDriver initBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumCourse\\src\\main\\java\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.opesmount.in/grocerystore1/");
		return driver;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseAssign obj = new BaseAssign();
		obj.initBrowser();
	}

}
