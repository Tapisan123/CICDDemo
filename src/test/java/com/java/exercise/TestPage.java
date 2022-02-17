package com.java.exercise;

import org.testng.annotations.Test;

public class TestPage {

	public static void main(String[] args) {

		System.out.println("Welcome to Java...");
	}

	@Test
	public int addNumbers(int a, int b) {

		int result = a + b;
		
		System.out.println("Result is.. "+result);

		return result;
	}

}