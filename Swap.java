package com.programs;

public class Swap {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println("Before swapping values are " + a + " " + b);

		// 1st type

		int t = a; // t=10
		a = b; // a=b ---> a=20
		b = t; // b=t ---> b=10

		System.out.println("After swapping values are " + a + " " + b);

		// 2nd type

		int i = 10, j = 20;

		i = i + j;  //30
		j = i - j;  //30-20-->10
		i = i - j;  //30-10 -->20

		System.out.println("After swapping values using 2nd type are " + a + " " + b);

	}
	
	System.out.println("Done");

}
