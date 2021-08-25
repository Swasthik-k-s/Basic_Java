package com.logical;

import java.util.*;

public class Fibonacci {
	
	public static void fibonacci() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the count of Fibonacci Numbers to be Displayed");
		int count = scanner.nextInt();
		scanner.close();
		int num1 = 0;
		int num2 = 1;
		int num3;
		
		System.out.print(num1 + " " + num2 + " ");
		
		for(int i=2;i<count;i++) {
			num3 = num1 + num2;
			System.out.print(num3 + " ");
			num1 = num2;
			num2 = num3;
		}
	}
}
