package com.junit;

import java.util.*;

public class VendingMachine {
	public static void vendingMachine() {
		int array[] = {1000, 500, 100, 50, 10, 5, 2, 1};
		int num;
		int pos = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Change");
		int rs = scanner.nextInt();
		scanner.close();
		System.out.println("Notes Are");
		for(int note: array) {
			num = rs / note;
			if(num>=1) {
				System.out.println(note + " * " + num);
				pos = pos+num;
				rs = rs % note;
			}
		}
		System.out.println("Total Notes " + pos);
	}
}
