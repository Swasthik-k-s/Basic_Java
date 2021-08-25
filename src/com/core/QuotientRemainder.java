package com.core;

import java.util.*;

public class QuotientRemainder {
	public static void quotientRemainder() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 2 Numbers");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		scanner.close();
		
		int quotient = num1/num2;
		int remainder = num1%num2;
		
		System.out.println("Quotient = " + quotient);
		System.out.println("Remainder = " + remainder);
		
	}
}
