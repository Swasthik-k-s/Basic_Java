package com.core;

import java.util.*;

public class Swap {
	public static void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Value of A");
		int a = scanner.nextInt();
		System.out.println("Enter the Value of B");
		int b = scanner.nextInt();

		int temp =a;
		a = b;
		b = temp;

		System.out.println("After Swapping");
		System.out.println("A = " + a + "\tB = " + b);
	}

}
