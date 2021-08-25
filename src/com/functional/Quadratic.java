package com.functional;

import java.util.*;

public class Quadratic {
	public static void root() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 3 coeffients");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		scanner.close();
		
		double delta = (b*b) - (4*a*c);
		double root1 = (-b + Math.sqrt(delta))/2*a;
		double root2 = (-b - Math.sqrt(delta))/2*a;
		
		System.out.println("Root are \nRoot 1 = " + root1 + "\tRoot 2 = " + root2);
	}
}
