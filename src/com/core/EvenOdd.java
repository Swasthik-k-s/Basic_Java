package com.core;

import java.util.*;

public class EvenOdd {
	public static void evenOdd() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = scanner.nextInt();
		scanner.close();

		if(num%2 == 0) {
			System.out.println(num + " is a Even Number");
		} else {
			System.out.println(num + " is a Odd Number");
		}
	}
}
