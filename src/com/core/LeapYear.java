package com.core;

import java.util.*;

public class LeapYear {
	
	public static void run() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Year");
		int year = scanner.nextInt();
		
		while(year < 1000 || year > 9999) {
			System.out.println("Please Enter a Valid 4 Digit Year");
			year = scanner.nextInt();
		}
		
		if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " is a Leap Year");
		} else {
			System.out.println(year + " is a not a Leap Year");
		}
	}
	
}
