package com.java.exercise;

import org.testng.annotations.Test;

public class Testcase extends TestPage {
	
	@Test
	public void testCase1() {
		 TestPage tp = new TestPage();
		 System.out.println("Result is.." + tp.addNumbers(5, 10));
		
	}

}
