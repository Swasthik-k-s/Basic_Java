package com.logical;

import java.util.*;

public class StopWatch {
		static double start = 0, stop = 0;

		static void startTime() {
			start = System.currentTimeMillis();
			System.out.println("started at " + start);
		}


		static void stopTime() {
			stop = System.currentTimeMillis();
			System.out.println("stopped at " + stop);
			elapsedTime();
		}


		static void elapsedTime() {
			System.out.println("elapsed time is " + (stop - start) / 1000);
		}

		public static void stopWatch() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter 1 to start");
			int startkey=scanner.nextInt();
			if(startkey==1)
				startTime();
			System.out.println("enter 2 to stop");
			int stopkey=scanner.nextInt();
			scanner.close();
			if(stopkey==2)
				stopTime();
		}
}
