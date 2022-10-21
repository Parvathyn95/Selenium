package com.obsqura.SeleniumCourse;

public class BrowserCommands extends Base {
	String actualTitle,actualUrl;
	public void basicCommands() {
		actualTitle = driver.getTitle();   //get title of actual page
		System.out.println(actualTitle);
		actualUrl = driver.getCurrentUrl();  //get url of the actual page
		System.out.println(actualUrl);
	}

	public static void main(String[] args) {
		BrowserCommands obj = new BrowserCommands();
		obj.initBrowser();
		obj.basicCommands();
		obj.browserClose();

	}

}
