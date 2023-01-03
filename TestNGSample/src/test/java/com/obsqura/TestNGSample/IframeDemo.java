package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IframeDemo extends BaseObs {
	By frameElement = By.xpath("//iframe[@class=' lazyloaded']");
	By seleniumTraining = By.xpath("//a[@href='https://www.globalsqa.com/training/selenium-online-training/']");
	@Test
	public void handlingAnIframe() {
		driver.navigate().to("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		int size = driver.findElements(By.tagName("iframe")).size();
		WebElement FrameElement = driver.findElement(frameElement);
		driver.switchTo().frame(FrameElement);
		driver.findElement(seleniumTraining).click();
		driver.quit();
	}

}
