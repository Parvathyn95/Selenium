package com.obsqura.TestNGSample;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WindowHandleSample extends BaseObs {
	By likeUsOnFb = By.xpath("//a[@class='btn btn-primary windowSingle']");
	@Test
	public void clickOnLikeUsOnFbPopup() {
		driver.navigate().to("https://selenium.obsqurazone.com/window-popup.php");
		driver.findElement(likeUsOnFb).click();
		String MainWindow=driver.getWindowHandle();
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);
                    WebElement logIn = driver.findElement(By.xpath("//a[@aria-label='Accessible login button']"));
                    logIn.click();  
                   
            }
        }
		 driver.close(); 
		driver.switchTo().window(MainWindow);
	}
        

}
