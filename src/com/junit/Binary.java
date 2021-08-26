package com.junit;

import java.util.*;

public class Binary {
	public static void binary() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scanner.nextInt();
		scanner.close();
		
		String bits = toBinary(num);
		System.out.println("Length = " + bits.length());
		int length = bits.length();
		if(length != 8) {
			for(int i=0;i<8-length;i++) {
				bits = "0" + bits;
			}
			System.out.println("After Padding:" + bits);
		}
		
		String nibble1 = bits.substring(0,4);
		String nibble2 = bits.substring(4,8);
		
		System.out.println("Nibble 1 = " + nibble1 + " Nibble 2 = " + nibble2);
		String reverse = nibble2 + nibble1;
		System.out.println("Reversed Binary = " + reverse);
		int result = 0;
		
		for(int i=reverse.length()-1;i>=0;i--) {
			int bit = Character.getNumericValue(reverse.charAt(i));
			result = (int) (result + (bit * Math.pow(2, 7-i)));
		}
		System.out.println("The Reversed Binary Equivalent Decimal Value = " + result);
	}
	
	private static String toBinary(int num) {
		int temp = num;
		String rem;
		String bits = Integer.toString(temp%2);
		temp = temp / 2;
		while(temp != 0) {
			rem = Integer.toString(temp%2);
			bits = rem + bits;
			temp = temp / 2;
		}
		System.out.println("Binary = " + bits);
		return bits;
	}
}
