package com.logical;

import java.util.*;

public class Reverse {
	
	public static void reverse() {
		
		int reverse = 0;
		int digit;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number to Reverse");
		int num = scanner.nextInt();
		scanner.close();
		
		while(num > 0) {
			digit = num%10;
			reverse = (reverse * 10) + digit;
			num = num / 10;
		}
		System.out.println("Reversed Number = " + reverse);
	}
}
