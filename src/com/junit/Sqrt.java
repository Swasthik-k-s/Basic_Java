package com.junit;

import java.util.*;

public class Sqrt {
	public static void sqrt() {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the number");
		double number=scanner.nextDouble();
		double epslion = 1e-15;
		double sqRoot = number;
		scanner.close();

		while (Math.abs(sqRoot - number / sqRoot) > epslion * sqRoot) {
			sqRoot = (number / sqRoot + sqRoot) / 2;
		}
		System.out.println("Square root of "+number+" is "+String.format("%.3f", sqRoot ));
	}

}
