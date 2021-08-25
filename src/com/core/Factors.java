package com.core;

import java.util.*;

public class Factors {
	public static void factors() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Value of N");
		int num = scanner.nextInt();

		while(num <= 0) {
			System.out.println("N should be Greater than 0");
			num = scanner.nextInt();
		}
		
		scanner.close();
		
		System.out.print("Factors of " + num + " are ");
		for(int i=2; i<=num; i++) {
			while(num%i == 0) {
				System.out.print(i + " ");
				num = num/i;
			}
		}
	}
}
