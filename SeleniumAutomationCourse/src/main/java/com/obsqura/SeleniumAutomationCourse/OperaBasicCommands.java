package com.obsqura.SeleniumAutomationCourse;

public class OperaBasicCommands extends Base{
	String actlTitle,actlUrl;
	public void opeBasicCommands() {
		actlTitle = driver.getTitle();
		System.out.println(actlTitle);
		actlUrl = driver.getCurrentUrl();
		System.out.println(actlUrl);
	}
	public static void main(String[] args) {
		OperaBasicCommands obj = new OperaBasicCommands();
		obj.initBrowser();
		obj.operaClose();
		obj.opeBasicCommands();
	}

}
