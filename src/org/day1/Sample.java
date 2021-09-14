package org.day1;

public class Sample {

	public static void main(String[] args) {

		// Factorial Number
		// 5!=5*4*3*2*1
		int fact = 1;
		for (int i = 1; i <= 5; i++) {

			fact = fact * i;
		}

		System.out.println("The Factorial of Given Number :" + fact);
	}
}
