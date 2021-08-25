package com.junit;

import java.util.*;

public class TemperatureConversion {
	public static void temperatureConversion() {
		Scanner scanner = new Scanner(System.in);
		int choice;
		System.out.println("Enter your Choice\n1)Convert Celsius to Fahrenheit\n2)Convert Fahrenheit to Celsius");
		choice = scanner.nextInt();
		System.out.println("Enter Temperature");
		double temperature = scanner.nextDouble();
		scanner.close();

		switch(choice) {
		case 1:
			findFahrenheit(temperature);
			break;
		case 2:
			findCelsius(temperature);
			break;
		default:
			break;
		}
	}

	private static void findFahrenheit(double c) {
		double result = (c*9/5) + 32;
		System.out.println("Temperature in Fahrenheit = " + result);
		return;
	}

	private static void findCelsius(double f) {
		double result = (f - 32) * 5/9;
		System.out.println("Temperature in Celsius = " + result);
		return;
	}

}
