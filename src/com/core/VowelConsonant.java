package com.core;

import java.util.*;

public class VowelConsonant {
	public static void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Character");
		char character = scanner.next().charAt(0);
		scanner.close();

		if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
			System.out.println(character + " is a Vowel");
		}
		else
			System.out.println(character + " is a Consonant");
	}
}
