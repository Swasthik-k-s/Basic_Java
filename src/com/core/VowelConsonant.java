package com.core;

import java.util.*;

public class VowelConsonant {
	public static void vowelConsonant() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Character");
		char character = scanner.next().charAt(0);
		scanner.close();

		char array[] = {'a', 'e','i','o','u','A','E','I','O','U'};
		
		for(char vowel: array) {
			if(vowel == character) {
				System.out.println(character + " is a Vowel");
				System.exit(0);
			}
		}
		System.out.println(character + " is a Consonant");
	}
}
