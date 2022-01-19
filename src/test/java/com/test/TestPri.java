package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPri {
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
	// If you want to change the particular order and you will be using priority.
	@Test(priority =10)
	private void test1() {
System.out.println("test1");
	}
	@Test(priority =11)
	private void test2() {
		System.out.println("test2");
			}
	@Test(priority =11)// Same priority : when you are using same priority it will enter in Alphabetical order test2 and test3
	private void test3() {
		System.out.println("test3");
			}
	@Test(priority =-3)
	private void test4() {
		System.out.println("test4");
			}
	@Test(priority =-2)
	private void test5() {
		System.out.println("test5");
			}
	@Test(priority =7)
	private void test6() {
		System.out.println("test6");
			}
	@Test
	private void test7() {          // whenever we wont give priority to method and it will take the priority for 0 value (priority = 0)
		
		System.out.println("test7");// The values are arranged in -ve -- 0 -- +ve(-1 to 0 to 1)
			}

	private void test8() {
		System.out.println("test8");
			}
}
