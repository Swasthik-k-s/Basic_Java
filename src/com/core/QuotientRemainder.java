package com.core;

import java.util.*;

public class QuotientRemainder {
	public static void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 2 Numbers");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int quotient = a/b;
		int remainder = a%b;
		
		System.out.println("Quotient = " + quotient);
		System.out.println("Remainder = " + remainder);
		
	}
}
