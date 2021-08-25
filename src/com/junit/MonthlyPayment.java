package com.junit;

public class MonthlyPayment {
	public static void monthlyPayment(String[] args) {
		double principal = Integer.parseInt(args[0]);
		double year = Integer.parseInt(args[1]);
		double rate = Integer.parseInt(args[2]);
		
		double n = 12 * year;
		double r = rate / (12 * 100);
		double result = (principal * r) / (1 - Math.pow(1 + r, -n));
		System.out.println("Monthly Payment = " + result);
	}
}
