package com.obsqura.TestNGSample;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JquerySelect2Dropdown extends BaseObs{
	@Test(description = "Compare heading of actual and expected heading")
	public void headingDropdownWithSearchBox() {
		String expectedHeading = "Drop Down with Search box",actualHeading;
		WebElement jquery = driver.findElement(By.linkText("Jquery Select2"));
		jquery.click();
		actualHeading = driver.findElement(By.xpath("(//div[@class='card-header'])[2]")).getText();
		Assert.assertEquals(expectedHeading, actualHeading, "Actual and expected messages are not the same");
	}
	@Test(description = "Select one option among the dropdown")
	public void selectOneOptionDropDown() {
		int stateElementSize;
		String inputHeader,expectedHeader="States";
		String expectedState = "Nevada";
		driver.navigate().to("https://selenium.obsqurazone.com/jquery-select.php");
		inputHeader = driver.findElement(By.xpath("//label[@for='inputEmail4']")).getText();
		Assert.assertEquals(inputHeader, expectedHeader, "Actual and expected header not equal");
		Select optionSelect = new Select(driver.findElement(By.xpath("(//select[@aria-hidden='true'])[1]")));
		optionSelect.selectByVisibleText("Nevada");
		List<WebElement> stateElements = optionSelect.getOptions();
		stateElementSize = stateElements.size();
		Assert.assertEquals(stateElements.get(3).getText(), expectedState,"Actual and Expected state are not equal");
		Assert.assertNotNull(stateElementSize, "List of dropdownElements are null");
	}
	@Test(description = "Compare heading of actual and expected heading")
	public void headingSelectMultipleValues() {
		String expectedHeading = "Select Multiple Values",actualHeading;
		WebElement jquery = driver.findElement(By.linkText("Jquery Select2"));
		jquery.click();
		actualHeading = driver.findElement(By.xpath("(//div[@class='card-header'])[3]")).getText();
		Assert.assertEquals(expectedHeading, actualHeading, "Actual and expected messages are not the same");
	}
	@Test(description = "Select one option among the dropdown")
	public void selectAndDeselectMultipleValueDropDown() {
		driver.navigate().to("https://selenium.obsqurazone.com/jquery-select.php");
		WebElement states;
		String actualText = null,element1,element2,element3;
		List<String> expectedItems=new ArrayList<String>();
		List<String> actualItems=new ArrayList<String>();
		states=driver.findElement(By.xpath("(//select[@class='js-states-multiple form-control select2-hidden-accessible'])"));
		Select obj=new Select(states);
		if(obj.isMultiple()){
		obj.selectByIndex(2);
		obj.selectByIndex(4);
		obj.selectByIndex(8);
		List<WebElement> elements=obj.getOptions();
		element1=elements.get(2).getText();
		element2=elements.get(4).getText();
		element3=elements.get(8).getText();
		expectedItems.add(element1);
		expectedItems.add(element2);
		expectedItems.add(element3);
		}
		List <WebElement> selectedOptions= obj.getAllSelectedOptions();
		actualItems.add(selectedOptions.get(0).getText());
		actualItems.add(selectedOptions.get(1).getText());
		actualItems.add(selectedOptions.get(2).getText());
		if(expectedItems.equals(actualItems)) {
		Assert.assertTrue(true, "Selected dropdown values and expected values are not same");
		}
		Assert.assertFalse(false);
		obj.deselectAll();
		Assert.assertTrue(true, "Dropdown field is not cleared");
		}
}
