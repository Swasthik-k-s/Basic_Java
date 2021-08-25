package com.functional;

public class WindChill {
	
	public static void windChill(String[] args) {
		
		double temperature = Double.parseDouble(args[0]);
		double speed = Double.parseDouble(args[1]);
		double wind = ((35.74)+(0.6215)*temperature)+((0.4275)*temperature-(35.75))*(Math.pow(speed,0.16));
		
		System.out.println("The Wind Chill = "+wind);
	}
}
