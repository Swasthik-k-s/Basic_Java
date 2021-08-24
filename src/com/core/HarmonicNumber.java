package com.core;

import java.util.*;

public class HarmonicNumber {
	public static void run() {
		Scanner scanner = new Scanner(System.in);
		double result = 1;
		
		System.out.println("Enter the Value of N");
		int num = scanner.nextInt();
		
		while(num == 0) {
			System.out.println("Value of N cannot be 0. Try Again");
			num = scanner.nextInt();
		}
		for(int i=2; i<=num; i++) {
			result += (double) 1/i;
		}
		
		System.out.println("Nth Harmonic Number:" + String.format("%.4f", result));
		
	}
}
