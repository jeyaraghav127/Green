package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Facebook {
	@BeforeClass
	private void beforeClass() {
		System.out.println("beforeClass");

	}

	@AfterClass
	private void afterClass() {
		System.out.println("afterClass");

	}
	@BeforeMethod
	
	private void beforeMethod() {
		System.out.println("beforeMethod");

	}

	@AfterMethod
	private void afterMethod() {
		System.out.println("afterMethod");
	}

	@Test
	private void login() {
System.out.println("test");
	}
	@Test
	private void login2() {
		System.out.println("test2");
			}
}
