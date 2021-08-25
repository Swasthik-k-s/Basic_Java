package com.logical;

import java.util.*;

public class PerfectNumber {
	
public static void perfectNumber() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scanner.nextInt();
		scanner.close();
		int sum = 0;
		
		for(int i=1;i<=num/2;i++) {
			if(num%i == 0) {
				sum += i;
			}
		}
		if(num == sum) {
			System.out.println(num + " is a Perfect Number");
		} else {
			System.out.println(num + " is not a Perfect Number");
		}
	}
}
