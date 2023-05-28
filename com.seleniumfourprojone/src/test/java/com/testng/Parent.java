package com.testng;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Parent {

	
	@BeforeSuite
	public void M1() {
		System.out.println("Parent Before Suite");
		
	}
	
	@BeforeClass
	public void M2() {
		System.out.println("Parent Before Class");
		
	}
	
	@BeforeTest
	public void M3() {
		System.out.println("Parent Before Test");
		
	}
	
	
	
	@BeforeMethod
	public void M4() {
		System.out.println("Parent Before Method");
		
	}
	
	@Test
	public void M5() {
		System.out.println("Parent Test");
		
	}
	
	
	@AfterSuite
	public void M6() {
		System.out.println("Parent Before Suite");
		
	}
	
	@AfterClass
	public void M7() {
		System.out.println("Parent Before Class");
		
	}
	
	@AfterTest
	public void M8() {
		System.out.println("Parent Before Test");
		
	}
	
	
	
	@AfterMethod
	public void M9() {
		System.out.println("Parent Before Method");
		
	}
	
	
	
	
	
	
	
}
