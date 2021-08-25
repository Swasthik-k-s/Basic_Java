package com.core;

import java.util.*;

public class Swap {
	public static void swap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int num1 = scanner.nextInt();
		System.out.println("Enter the Second Number");
		int num2 = scanner.nextInt();
		scanner.close();

		System.out.println("Before Swapping");
		System.out.println("A = " + num1 + "\tB = " + num2);
		
		int temp =num1;
		num1 = num2;
		num2 = temp;

		System.out.println("After Swapping");
		System.out.println("A = " + num1 + "\tB = " + num2);
	}

}
