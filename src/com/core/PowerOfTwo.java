package com.core;

//import java.util.*;

public class PowerOfTwo {

	public static void run(int power) {
		int base = 2;
		int result = base;
		//Scanner scanner = new Scanner(System.in);
		//int power = scanner.nextInt();

		while(power < 0 || power > 31) {
			System.out.println("Power should be between 0 and 31");
			System.exit(0);
		}

		System.out.println(base + "^0 = 1");

		for(int i=1; i<power; i++) {
			System.out.println("2^" + i + " = " + result);
			result *= base;
		}


	}

}
