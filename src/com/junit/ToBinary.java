package com.junit;

import java.util.*;

public class ToBinary {
	public static void toBinary() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scanner.nextInt();
		scanner.close();
		int temp = num;
		String rem;
		String bits = "";
		while(temp != 0) {
			rem = Integer.toString(temp%2);
			bits = rem + bits;
			temp = temp / 2;
		}
		System.out.println("Binary = " + bits);
	}
}
