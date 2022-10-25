package com.obsqura.SeleniumCourse;

public class NavigateCommandsAssign extends NavigateBase{
	public void navigateCommands() {
		driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigateCommandsAssign obj = new NavigateCommandsAssign();
		obj.initBrowser();
		obj.navigateCommands();
		obj.browserQuit();

	}

}
