package com.core;

import java.util.*;

public class FlipCoin {
	
	public static void run() {
		int headCount = 0;
		int tailCount = 0;
		double headPercentage = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the numberof times to Flip the Coin");
		int num = scanner.nextInt();
		
		while(num < 0) {
			System.out.println("Enter a Positive Number");
			num = scanner.nextInt();
		}
		
		for(int i=0;i<num;i++) {
			System.out.print("Coin Toss Number : " + (i+1) + "\t");
			double result = Math.random();
			if(result < 0.5) {
				System.out.println("Its a Tail");
				tailCount += 1; 
			} else {
				System.out.println("Its a Head");
				headCount += 1; 
			}
		}
		headPercentage = (headCount * 100) / num;
		System.out.println("\nHEAD = " + String.format("%.2f",headPercentage) + "%");
		System.out.println("TAIL = " + String.format("%.2f",100.00 - headPercentage) + "%");
	}
	
	
}
