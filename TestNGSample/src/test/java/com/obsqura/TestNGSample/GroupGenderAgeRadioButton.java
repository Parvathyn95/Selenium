package com.obsqura.TestNGSample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GroupGenderAgeRadioButton extends BaseObs {
	@Test(description="Gender radio button disabled, Get results clicked, Message compared")
	public void patientGenderAgeGroupCheck() {
		String expectedTitle1="Pateints Gender",actualTitle1,expectedTitle2="Pateints Age Group",actualTitle2;
		String expectedMessage="Gender :\nAge group:",actualMessage;
		Boolean maleIsSelected,femaleIsSelected,age1IsSelected,age2IsSelected,age3IsSelected,getResultIsEnabled,getResultIsSelected,msgFlag=false;
		SoftAssert softAssert = new SoftAssert();
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement male = driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		WebElement female = driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		WebElement age1 = driver.findElement(By.xpath("//input[@id='inlineRadio22']"));
		WebElement age2 = driver.findElement(By.xpath("//input[@id='inlineRadio23']"));
		WebElement age3 = driver.findElement(By.xpath("//input[@id='inlineRadio24']"));
		WebElement getResult = driver.findElement(By.xpath("//button[@id='button-two']"));
		maleIsSelected=male.isSelected();
		femaleIsSelected=female.isSelected();
		age1IsSelected=age1.isSelected();
		age2IsSelected=age2.isSelected();
		age3IsSelected=age3.isSelected();
		getResultIsSelected=getResult.isSelected();
		getResultIsEnabled=getResult.isEnabled();
		actualTitle1=driver.findElement(By.xpath("//h4[text()='Pateints Gender']")).getText();
		Assert.assertEquals(actualTitle1, expectedTitle1);
		actualTitle2=driver.findElement(By.xpath("//h4[text()='Pateints Age Group']")).getText();
		Assert.assertEquals(actualTitle2, expectedTitle2);
		if(male.isDisplayed()&&female.isDisplayed()&&age1.isDisplayed()&&age2.isDisplayed()&&age3.isDisplayed()){
				if(maleIsSelected==false&&femaleIsSelected==false&&age1IsSelected==false&&age2IsSelected==false&&age3IsSelected==false){
					msgFlag=true;
						if(getResultIsEnabled==true) {
						  msgFlag=true;
							if(getResultIsSelected==false){
								msgFlag=true;
								getResult.click();
								actualMessage=driver.findElement(By.xpath("//div[@id='message-two']")).getText();
								Assert.assertEquals(actualMessage, expectedMessage);
						   }
							Assert.assertTrue(msgFlag,"Get Results button is already selected");
						}
						Assert.assertTrue(msgFlag,"Get Results button is disabled");
				}
				softAssert.assertTrue(msgFlag,"Male Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Female Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Age1 Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Age2 Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Age3 Radio Button is selected");
				softAssert.assertAll();
		}
		softAssert.assertTrue(male.isDisplayed(),"Male Radio Button is not displayed");
		softAssert.assertTrue(female.isDisplayed(),"Female Radio Button is not displayed");
		softAssert.assertTrue(age1.isDisplayed(),"Age1 Radio Button is not displayed");
		softAssert.assertTrue(age2.isDisplayed(),"Age2 Radio Button is not displayed");
		softAssert.assertTrue(age3.isDisplayed(),"Age3 Radio Button is not displayed");	
		softAssert.assertAll();
	}
	@Test(description="Male radio button selected no age group selected, Get results clicked, Message compared")
	public void patientMaleCheck() {
		String expectedMessage="Gender : Male\nAge group:",inputGenderLabel;
		Boolean maleIsSelected,femaleIsSelected,age1IsSelected,age2IsSelected,age3IsSelected,getResultIsEnabled,getResultIsSelected,msgFlag=false;
		SoftAssert softAssert = new SoftAssert();
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement male = driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		WebElement female = driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		WebElement age1 = driver.findElement(By.xpath("//input[@id='inlineRadio22']"));
		WebElement age2 = driver.findElement(By.xpath("//input[@id='inlineRadio23']"));
		WebElement age3 = driver.findElement(By.xpath("//input[@id='inlineRadio24']"));
		WebElement getResult = driver.findElement(By.xpath("//button[@id='button-two']"));
		maleIsSelected=male.isSelected();
		femaleIsSelected=female.isSelected();
		age1IsSelected=age1.isSelected();
		age2IsSelected=age2.isSelected();
		age3IsSelected=age3.isSelected();
		getResultIsSelected=getResult.isSelected();
		getResultIsEnabled=getResult.isEnabled();
				if(maleIsSelected==true&&femaleIsSelected==false&&age1IsSelected==false&&age2IsSelected==false&&age3IsSelected==false){
					msgFlag=true;
						if(getResultIsEnabled==true){
							msgFlag=true;
							 if(getResultIsSelected==false){
								msgFlag=true;
							    getResult.click();
							    inputGenderLabel=driver.findElement(By.xpath("//label[@for='inlineRadio11']")).getText();
							    Assert.assertEquals(expectedMessage, "Gender : "+inputGenderLabel+"\nAge group:");
						   }
						Assert.assertTrue(msgFlag,"Get Results button is already selected");
					}
					Assert.assertTrue(msgFlag,"Get Results button is disabled");
			}
				softAssert.assertTrue(msgFlag,"Male Radio Button is not selected");
				softAssert.assertTrue(msgFlag,"Female Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Age1 Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Age2 Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Age3 Radio Button is selected");
				softAssert.assertAll();
	}
	@Test(description="Female radio button selected no age group selected, Get results clicked, Message compared")
	public void patientFemaleCheck() {
		String expectedMessage="Gender : Female\nAge group:",inputGenderLabel;
		Boolean maleIsSelected,femaleIsSelected,age1IsSelected,age2IsSelected,age3IsSelected,getResultIsSelected,getResultIsEnabled,msgFlag=false;
		SoftAssert softAssert = new SoftAssert();
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement male = driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		WebElement female = driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		WebElement age1 = driver.findElement(By.xpath("//input[@id='inlineRadio22']"));
		WebElement age2 = driver.findElement(By.xpath("//input[@id='inlineRadio23']"));
		WebElement age3 = driver.findElement(By.xpath("//input[@id='inlineRadio24']"));
		WebElement getResult = driver.findElement(By.xpath("//button[@id='button-two']"));
		maleIsSelected=male.isSelected();
		femaleIsSelected=female.isSelected();
		age1IsSelected=age1.isSelected();
		age2IsSelected=age2.isSelected();
		age3IsSelected=age3.isSelected();
		getResultIsSelected=getResult.isSelected();
		getResultIsEnabled=getResult.isEnabled();
				if(maleIsSelected==false&&femaleIsSelected==true&&age1IsSelected==false&&age2IsSelected==false&&age3IsSelected==false){
					msgFlag=true;
						if(getResultIsEnabled==true){
							msgFlag=true;
							 if(getResultIsSelected==false){
								msgFlag=true;
							    getResult.click();
							    inputGenderLabel=driver.findElement(By.xpath("//label[@for='inlineRadio21']")).getText();
							    Assert.assertEquals(expectedMessage, "Gender : "+inputGenderLabel+"\nAge group:");
						   }
						Assert.assertTrue(msgFlag,"Get Results button is already selected");
					}
					Assert.assertTrue(msgFlag,"Get Results button is disabled");
			}
				softAssert.assertTrue(msgFlag,"Male Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Female Radio Button is not selected");
				softAssert.assertTrue(msgFlag,"Age1 Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Age2 Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Age3 Radio Button is selected");
				softAssert.assertAll();
	}
	@Test(description="Age1 radio button selected no gender selected, Get results clicked, Message compared")
	public void patientAge1Check() {
		String expectedMessage="Gender :\nAge group: 1 to 18",inputAgeLabel;
		Boolean maleIsSelected,femaleIsSelected,age1IsSelected,age2IsSelected,age3IsSelected,getResultIsSelected,getResultIsEnabled,msgFlag=false;
		SoftAssert softAssert = new SoftAssert();
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement male = driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		WebElement female = driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		WebElement age1 = driver.findElement(By.xpath("//input[@id='inlineRadio22']"));
		WebElement age2 = driver.findElement(By.xpath("//input[@id='inlineRadio23']"));
		WebElement age3 = driver.findElement(By.xpath("//input[@id='inlineRadio24']"));
		WebElement getResult = driver.findElement(By.xpath("//button[@id='button-two']"));
		maleIsSelected=male.isSelected();
		femaleIsSelected=female.isSelected();
		age1IsSelected=age1.isSelected();
		age2IsSelected=age2.isSelected();
		age3IsSelected=age3.isSelected();
		getResultIsSelected=getResult.isSelected();
		getResultIsEnabled=getResult.isEnabled();
				if(maleIsSelected==false&&femaleIsSelected==false&&age1IsSelected==true&&age2IsSelected==false&&age3IsSelected==false){
					msgFlag=true;
						if(getResultIsEnabled==true){
							msgFlag=true;
							 if(getResultIsSelected==false){
								msgFlag=true;
							    getResult.click();
							    inputAgeLabel=driver.findElement(By.xpath("//label[@for='inlineRadio22']")).getText();
							    Assert.assertEquals(expectedMessage, "Gender : "+inputAgeLabel+"\nAge group:");
							   }
								Assert.assertTrue(msgFlag,"Get Results button is already selected");
							}
							Assert.assertTrue(msgFlag,"Get Results button is disabled");
					}
				softAssert.assertTrue(msgFlag,"Male Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Female Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Age1 Radio Button is not selected");
				softAssert.assertTrue(msgFlag,"Age2 Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Age3 Radio Button is selected");
				softAssert.assertAll();	
		}
	@Test(description="Age2 radio button selected no gender selected, Get results clicked, Message compared")
	public void patientAge2Check() {
		String expectedMessage="Gender :\nAge group: 19 t0 44",inputAgeLabel;
		Boolean maleIsSelected,femaleIsSelected,age1IsSelected,age2IsSelected,age3IsSelected,getResultIsSelected,getResultIsEnabled,msgFlag=false;
		SoftAssert softAssert = new SoftAssert();
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement male = driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		WebElement female = driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		WebElement age1 = driver.findElement(By.xpath("//input[@id='inlineRadio22']"));
		WebElement age2 = driver.findElement(By.xpath("//input[@id='inlineRadio23']"));
		WebElement age3 = driver.findElement(By.xpath("//input[@id='inlineRadio24']"));
		WebElement getResult = driver.findElement(By.xpath("//button[@id='button-two']"));
		maleIsSelected=male.isSelected();
		femaleIsSelected=female.isSelected();
		age1IsSelected=age1.isSelected();
		age2IsSelected=age2.isSelected();
		age3IsSelected=age3.isSelected();
		getResultIsSelected=getResult.isSelected();
		getResultIsEnabled=getResult.isEnabled();
				if(maleIsSelected==false&&femaleIsSelected==false&&age1IsSelected==false&&age2IsSelected==true&&age3IsSelected==false){
					msgFlag=true;
						if(getResultIsEnabled==true){
							msgFlag=true;
							if(getResultIsSelected==false){
								msgFlag=true;
							    getResult.click();
							    inputAgeLabel=driver.findElement(By.xpath("//label[@for='inlineRadio23']")).getText();
							    Assert.assertEquals(expectedMessage, "Gender : "+inputAgeLabel+"\nAge group:");
						}
						Assert.assertTrue(msgFlag,"Get Results button is disabled");
				}
				softAssert.assertTrue(msgFlag,"Male Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Female Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Age1 Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Age2 Radio Button is not selected");
				softAssert.assertTrue(msgFlag,"Age3 Radio Button is selected");
				softAssert.assertAll();
	     }
	}
	@Test(description="Age3 radio button selected no gender selected, Get results clicked, Message compared")
	public void patientAge3Check() {
		String expectedMessage="Gender :\nAge group: 45 to 60",inputAgeLabel;
		Boolean maleIsSelected,femaleIsSelected,age1IsSelected,age2IsSelected,age3IsSelected,getResultIsSelected,getResultIsEnabled,msgFlag=false;
		SoftAssert softAssert = new SoftAssert();
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement male = driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		WebElement female = driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		WebElement age1 = driver.findElement(By.xpath("//input[@id='inlineRadio22']"));
		WebElement age2 = driver.findElement(By.xpath("//input[@id='inlineRadio23']"));
		WebElement age3 = driver.findElement(By.xpath("//input[@id='inlineRadio24']"));
		WebElement getResult = driver.findElement(By.xpath("//button[@id='button-two']"));
		maleIsSelected=male.isSelected();
		femaleIsSelected=female.isSelected();
		age1IsSelected=age1.isSelected();
		age2IsSelected=age2.isSelected();
		age3IsSelected=age3.isSelected();
		getResultIsSelected=getResult.isSelected();
		getResultIsEnabled=getResult.isEnabled();
				if(maleIsSelected==false&&femaleIsSelected==false&&age1IsSelected==false&&age2IsSelected==false&&age3IsSelected==true){
					msgFlag=true;
						if(getResultIsEnabled==true){
						  msgFlag=true;
							if(getResultIsSelected==false){
								msgFlag=true;
								getResult.click();
								inputAgeLabel=driver.findElement(By.xpath("//label[@for='inlineRadio24']")).getText();
								Assert.assertEquals(expectedMessage, "Gender : "+inputAgeLabel+"\nAge group:");
							   }
							Assert.assertTrue(msgFlag,"Get Results button is already selected");
						}
						Assert.assertTrue(msgFlag,"Get Results button is disabled");
				}
				softAssert.assertTrue(msgFlag,"Male Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Female Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Age1 Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Age2 Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Age3 Radio Button is not selected");
				softAssert.assertAll();
	}
	@Test(description="Male and Age1 radio button selected, Get results clicked, Message compared")
	public void patientMaleAge1Check() {
		String expectedMessage="Gender : Male\nAge group: 1 to 18",inputGenderLabel,inputAgeLabel;
		Boolean maleIsSelected,femaleIsSelected,age1IsSelected,age2IsSelected,age3IsSelected,getResultIsSelected,getResultIsEnabled,msgFlag=false;
		SoftAssert softAssert = new SoftAssert();
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement male = driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		WebElement female = driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		WebElement age1 = driver.findElement(By.xpath("//input[@id='inlineRadio22']"));
		WebElement age2 = driver.findElement(By.xpath("//input[@id='inlineRadio23']"));
		WebElement age3 = driver.findElement(By.xpath("//input[@id='inlineRadio24']"));
		WebElement getResult = driver.findElement(By.xpath("//button[@id='button-two']"));
		maleIsSelected=male.isSelected();
		femaleIsSelected=female.isSelected();
		age1IsSelected=age1.isSelected();
		age2IsSelected=age2.isSelected();
		age3IsSelected=age3.isSelected();
		getResultIsSelected=getResult.isSelected();
		getResultIsEnabled=getResult.isEnabled();
				if(maleIsSelected==true&&femaleIsSelected==false&&age1IsSelected==true&&age2IsSelected==false&&age3IsSelected==false){
					msgFlag=true;
						if(getResultIsEnabled==true){
						  msgFlag=true;
						    if(getResultIsSelected==false){
								msgFlag=true;
								getResult.click();
								inputGenderLabel=driver.findElement(By.xpath("//label[@for='inlineRadio11']")).getText();
								inputAgeLabel=driver.findElement(By.xpath("//label[@for='inlineRadio22']")).getText();
								Assert.assertEquals(expectedMessage, "Gender : "+inputGenderLabel+"\nAge group: "+inputAgeLabel);
							   }
							Assert.assertTrue(msgFlag,"Get Results button is already selected");
						}
						Assert.assertTrue(msgFlag,"Get Results button is disabled");
				}
				softAssert.assertTrue(msgFlag,"Male Radio Button is not selected");
				softAssert.assertTrue(msgFlag,"Female Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Age1 Radio Button is not selected");
				softAssert.assertTrue(msgFlag,"Age2 Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Age3 Radio Button is selected");
				softAssert.assertAll();
	}
	@Test(description="Male and Age2 radio button selected, Get results clicked, Message compared")
	public void patientMaleAge2Check() {
		String expectedMessage="Gender : Male\nAge group: 19 t0 44",inputGenderLabel,inputAgeLabel;
		Boolean maleIsSelected,femaleIsSelected,age1IsSelected,age2IsSelected,age3IsSelected,getResultIsSelected,getResultIsEnabled,msgFlag=false;
		SoftAssert softAssert = new SoftAssert();
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement male = driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		WebElement female = driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		WebElement age1 = driver.findElement(By.xpath("//input[@id='inlineRadio22']"));
		WebElement age2 = driver.findElement(By.xpath("//input[@id='inlineRadio23']"));
		WebElement age3 = driver.findElement(By.xpath("//input[@id='inlineRadio24']"));
		WebElement getResult = driver.findElement(By.xpath("//button[@id='button-two']"));
		maleIsSelected=male.isSelected();
		femaleIsSelected=female.isSelected();
		age1IsSelected=age1.isSelected();
		age2IsSelected=age2.isSelected();
		age3IsSelected=age3.isSelected();
		getResultIsSelected=getResult.isSelected();
		getResultIsEnabled=getResult.isEnabled();
				if(maleIsSelected==true&&femaleIsSelected==false&&age1IsSelected==false&&age2IsSelected==true&&age3IsSelected==false){
					msgFlag=true;
						if(getResultIsEnabled==true){
						   msgFlag=true;
							if(getResultIsSelected==false){
								msgFlag=true;
								getResult.click();
								inputGenderLabel=driver.findElement(By.xpath("//label[@for='inlineRadio11']")).getText();
								inputAgeLabel=driver.findElement(By.xpath("//label[@for='inlineRadio23']")).getText();
								Assert.assertEquals(expectedMessage, "Gender : "+inputGenderLabel+"\nAge group: "+inputAgeLabel);
							   }
							Assert.assertTrue(msgFlag,"Get Results button is already selected");
						}
						Assert.assertTrue(msgFlag,"Get Results button is disabled");
				}
				softAssert.assertTrue(msgFlag,"Male Radio Button is not selected");
				softAssert.assertTrue(msgFlag,"Female Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Age1 Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Age2 Radio Button is not selected");
				softAssert.assertTrue(msgFlag,"Age3 Radio Button is selected");
				softAssert.assertAll();
	}
	@Test(description="Male and Age3 radio button selected, Get results clicked, Message compared")
	public void patientMaleAge3Check() {
		String expectedMessage="Gender : Male\nAge group: 45 to 60",inputGenderLabel,inputAgeLabel;
		Boolean maleIsSelected,femaleIsSelected,age1IsSelected,age2IsSelected,age3IsSelected,getResultIsSelected,getResultIsEnabled,msgFlag=false;
		SoftAssert softAssert = new SoftAssert();
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement male = driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		WebElement female = driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		WebElement age1 = driver.findElement(By.xpath("//input[@id='inlineRadio22']"));
		WebElement age2 = driver.findElement(By.xpath("//input[@id='inlineRadio23']"));
		WebElement age3 = driver.findElement(By.xpath("//input[@id='inlineRadio24']"));
		WebElement getResult = driver.findElement(By.xpath("//button[@id='button-two']"));
		maleIsSelected=male.isSelected();
		femaleIsSelected=female.isSelected();
		age1IsSelected=age1.isSelected();
		age2IsSelected=age2.isSelected();
		age3IsSelected=age3.isSelected();
		getResultIsSelected=getResult.isSelected();
		getResultIsEnabled=getResult.isEnabled();
				if(maleIsSelected==true&&femaleIsSelected==false&&age1IsSelected==false&&age2IsSelected==false&&age3IsSelected==true){
					msgFlag=true;
						if(getResultIsEnabled==true){
						  msgFlag=true;
							if(getResultIsSelected==false){
								msgFlag=true;
								getResult.click();
								inputGenderLabel=driver.findElement(By.xpath("//label[@for='inlineRadio11']")).getText();
								inputAgeLabel=driver.findElement(By.xpath("//label[@for='inlineRadio24']")).getText();
								Assert.assertEquals(expectedMessage, "Gender : "+inputGenderLabel+"\nAge group: "+inputAgeLabel);
							  }
							Assert.assertTrue(msgFlag,"Get Results button is already selected");
						}
						Assert.assertTrue(msgFlag,"Get Results button is disabled");
				}
				softAssert.assertTrue(msgFlag,"Male Radio Button is not selected");
				softAssert.assertTrue(msgFlag,"Female Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Age1 Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Age2 Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Age3 Radio Button is not selected");
				softAssert.assertAll();
	}
	@Test(description="Female and Age1 radio button selected, Get results clicked, Message compared")
	public void patientFemaleAge1Check() {
		String expectedMessage="Gender : Female\nAge group: 1 to 18",inputGenderLabel,inputAgeLabel;
		Boolean maleIsSelected,femaleIsSelected,age1IsSelected,age2IsSelected,age3IsSelected,getResultIsSelected,getResultIsEnabled,msgFlag=false;
		SoftAssert softAssert = new SoftAssert();
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement male = driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		WebElement female = driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		WebElement age1 = driver.findElement(By.xpath("//input[@id='inlineRadio22']"));
		WebElement age2 = driver.findElement(By.xpath("//input[@id='inlineRadio23']"));
		WebElement age3 = driver.findElement(By.xpath("//input[@id='inlineRadio24']"));
		WebElement getResult = driver.findElement(By.xpath("//button[@id='button-two']"));
		maleIsSelected=male.isSelected();
		femaleIsSelected=female.isSelected();
		age1IsSelected=age1.isSelected();
		age2IsSelected=age2.isSelected();
		age3IsSelected=age3.isSelected();
		getResultIsSelected=getResult.isSelected();
		getResultIsEnabled=getResult.isEnabled();
				if(maleIsSelected==false&&femaleIsSelected==true&&age1IsSelected==true&&age2IsSelected==false&&age3IsSelected==false){
					msgFlag=true;
						if(getResultIsEnabled==true){
						  msgFlag=true;
							if(getResultIsSelected==false){
								msgFlag=true;
								getResult.click();
								inputGenderLabel=driver.findElement(By.xpath("//label[@for='inlineRadio21']")).getText();
								inputAgeLabel=driver.findElement(By.xpath("//label[@for='inlineRadio22']")).getText();
								Assert.assertEquals(expectedMessage, "Gender : "+inputGenderLabel+"\nAge group: "+inputAgeLabel);
							  }
							Assert.assertTrue(msgFlag,"Get Results button is already selected");
						}
						Assert.assertTrue(msgFlag,"Get Results button is disabled");
				}
				softAssert.assertTrue(msgFlag,"Male Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Female Radio Button is not selected");
				softAssert.assertTrue(msgFlag,"Age1 Radio Button is not selected");
				softAssert.assertTrue(msgFlag,"Age2 Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Age3 Radio Button is selected");
				softAssert.assertAll();
	}
	@Test(description="Female and Age2 radio button selected, Get results clicked, Message compared")
	public void patientFemaleAge2Check() {
		String expectedMessage="Gender : Female\nAge group: 19 t0 44",inputGenderLabel,inputAgeLabel;
		Boolean maleIsSelected,femaleIsSelected,age1IsSelected,age2IsSelected,age3IsSelected,getResultIsSelected,getResultIsEnabled,msgFlag=false;
		SoftAssert softAssert = new SoftAssert();
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement male = driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		WebElement female = driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		WebElement age1 = driver.findElement(By.xpath("//input[@id='inlineRadio22']"));
		WebElement age2 = driver.findElement(By.xpath("//input[@id='inlineRadio23']"));
		WebElement age3 = driver.findElement(By.xpath("//input[@id='inlineRadio24']"));
		WebElement getResult = driver.findElement(By.xpath("//button[@id='button-two']"));
		maleIsSelected=male.isSelected();
		femaleIsSelected=female.isSelected();
		age1IsSelected=age1.isSelected();
		age2IsSelected=age2.isSelected();
		age3IsSelected=age3.isSelected();
		getResultIsSelected=getResult.isSelected();
		getResultIsEnabled=getResult.isEnabled();
				if(maleIsSelected==false&&femaleIsSelected==true&&age1IsSelected==false&&age2IsSelected==true&&age3IsSelected==false){
					msgFlag=true;
						if(getResultIsEnabled==true){
						  msgFlag=true;
							if(getResultIsSelected==false){
								msgFlag=true;
								getResult.click();
								inputGenderLabel=driver.findElement(By.xpath("//label[@for='inlineRadio21']")).getText();
								inputAgeLabel=driver.findElement(By.xpath("//label[@for='inlineRadio23']")).getText();
								Assert.assertEquals(expectedMessage, "Gender : "+inputGenderLabel+"\nAge group: "+inputAgeLabel);
							  }
							Assert.assertTrue(msgFlag,"Get Results button is already selected");
						}
						Assert.assertTrue(msgFlag,"Get Results button is disabled");
				}
				softAssert.assertTrue(msgFlag,"Male Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Female Radio Button is not selected");
				softAssert.assertTrue(msgFlag,"Age1 Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Age2 Radio Button is not selected");
				softAssert.assertTrue(msgFlag,"Age3 Radio Button is selected");
				softAssert.assertAll();
	}
	@Test(description="Female and Age3 radio button selected, Get results clicked, Message compared")
	public void patientFemaleAge3Check() {
		String expectedMessage="Gender : Female\nAge group: 45 to 60",inputGenderLabel,inputAgeLabel;
		Boolean maleIsSelected,femaleIsSelected,age1IsSelected,age2IsSelected,age3IsSelected,getResultIsSelected,getResultIsEnabled,msgFlag=false;
		SoftAssert softAssert = new SoftAssert();
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement male = driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		WebElement female = driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		WebElement age1 = driver.findElement(By.xpath("//input[@id='inlineRadio22']"));
		WebElement age2 = driver.findElement(By.xpath("//input[@id='inlineRadio23']"));
		WebElement age3 = driver.findElement(By.xpath("//input[@id='inlineRadio24']"));
		WebElement getResult = driver.findElement(By.xpath("//button[@id='button-two']"));
		maleIsSelected=male.isSelected();
		femaleIsSelected=female.isSelected();
		age1IsSelected=age1.isSelected();
		age2IsSelected=age2.isSelected();
		age3IsSelected=age3.isSelected();
		getResultIsSelected=getResult.isSelected();
		getResultIsEnabled=getResult.isEnabled();
				if(maleIsSelected==false&&femaleIsSelected==true&&age1IsSelected==false&&age2IsSelected==false&&age3IsSelected==true){
					msgFlag=true;
						if(getResultIsEnabled==true){
						  msgFlag=true;
							if(getResultIsSelected==false){
								msgFlag=true;
								getResult.click();
								inputGenderLabel=driver.findElement(By.xpath("//label[@for='inlineRadio21']")).getText();
								inputAgeLabel=driver.findElement(By.xpath("//label[@for='inlineRadio24']")).getText();
								Assert.assertEquals(expectedMessage, "Gender : "+inputGenderLabel+"\nAge group: "+inputAgeLabel);
							  }
							Assert.assertTrue(msgFlag,"Get Results button is already selected");
						}
						Assert.assertTrue(msgFlag,"Get Results button is disabled");
				}
				softAssert.assertTrue(msgFlag,"Male Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Female Radio Button is not selected");
				softAssert.assertTrue(msgFlag,"Age1 Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Age2 Radio Button is selected");
				softAssert.assertTrue(msgFlag,"Age3 Radio Button is not selected");
				softAssert.assertAll();
	}	
 }

