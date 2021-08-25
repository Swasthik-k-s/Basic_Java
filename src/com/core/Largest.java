package com.core;

import java.util.*;

public class Largest {
	public static void run() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter 3 Numbers");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		
		if(a > b && a > c)
			System.out.println(a+" is the Largest Number");
		else if(b > a && b > c)
			System.out.println(b+" is the Largest Number");
		else
			System.out.println(c+" is the Largest Number");
	}
}
