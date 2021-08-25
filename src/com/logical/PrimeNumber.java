package com.logical;

import java.util.*;

public class PrimeNumber {
	
	public static void primeNumber() {
		
		int isPrime = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scanner.nextInt();
		scanner.close();
		
		if(num == 0 || num == 1) {
			isPrime = 0;
		}
		
		for(int i=2;i<=num/2;i++) {
			if(num%i == 0) {
				isPrime = 0;
				break;
			}
		}
		if(isPrime == 0) {
			System.out.println(num + " is not a Prime Number");
		} else {
			System.out.println(num + " is a Prime Number");
		}
	}
}
