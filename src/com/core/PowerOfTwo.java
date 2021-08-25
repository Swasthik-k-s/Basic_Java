package com.core;

//import java.util.*;

public class PowerOfTwo {

	public static void power(String[] args) {
		
		int base = 2;
		int result = 2;
		int num = Integer.parseInt(args[0]);

		while(num < 0 || num > 31) {
			System.out.println("Power should be between 0 and 31");
			System.exit(0);
		}

		for(int i=1; i<=num; i++) {
			System.out.print(result + " ");
			result *= base;
		}


	}

}
