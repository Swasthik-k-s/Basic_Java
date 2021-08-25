package com.functional;

import java.util.*;

public class SumOfThree {
	public static void Triplets() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Size of the Array");
		int num = scanner.nextInt();
		int array[] = new int[num];

		System.out.println("Enter the Array Elements");
		for(int i=0;i<num;i++) {
			array[i] = scanner.nextInt();
		}
		scanner.close();

		Set<String> triplets = new HashSet<String>();

		for(int i=0;i<num-2;i++)
			for(int j=i+1;j<num-1;j++)
				for(int k=j+1;k<num;k++) {
					if((array[i]+array[j]+array[k]) == 0) {
						triplets.add("["+array[i]+" "+array[j]+" "+array[k]+"]");
					}
				}
		System.out.println("Number of Distinct Triplets are " + triplets.size());
		if(triplets.size() != 0) {
			System.out.println("Distinct Triplets are ");
		}
		
		for(String item: triplets) {
			System.out.println(item);
		}
	}
}
