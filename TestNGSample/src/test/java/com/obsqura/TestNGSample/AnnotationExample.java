package com.obsqura.TestNGSample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationExample {

		@BeforeTest
			public void profileExecution() {
				System.out.println("Profile Execution - Before Test");
			}
		@AfterTest
			public void resultReady() {
				System.out.println("Result Ready - After Test");
			}
		@BeforeMethod
			public void checkLogin() {
				System.out.println("Check Login - Before Method");
			}
		@AfterMethod
			public void takeScreenshot() {
				System.out.println("Take Screenshot - After Method");
			}
		@Test
		public void testCurrentUrl() {
			System.out.println("Test Current URL - Test");
		}
		@BeforeClass
			public void driverLoad() {
				System.out.println("Driver Load - Before Class");
			}
		@AfterClass
			public void driverQuit() {
				System.out.println("Driver Quit - After Class");
			}
		@BeforeSuite
			public void setUp() {
				System.out.println("SetUp - Before Suite");
			}
		@AfterSuite
			public void cleanUp() {
				System.out.println("Clean Up - After Suite");
	        }
	}

