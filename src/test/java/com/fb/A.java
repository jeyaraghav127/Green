package com.fb;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
// TO run the 3 class select 3 class and rightclick -- covert testng --testng.xml(file)--rightClick(testng.xml)--RunAs--TestSuite
public class A {
@Test
private void test11() {
System.out.println("test11");
}

@Test(enabled = false)
private void test12() {
	System.out.println("test12");

}
}
