package com.core;

import java.util.*;

public class Largest {
	public static void largest() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter 3 Numbers");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		scanner.close();
		
		if(num1 > num2 && num1 > num3)
			System.out.println(num1+" is the Largest Number");
		else if(num2 > num3)
			System.out.println(num2+" is the Largest Number");
		else
			System.out.println(num3+" is the Largest Number");
	}
}
