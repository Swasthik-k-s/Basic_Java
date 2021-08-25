package com.functional;

import java.util.*;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Array {
	public static void TwoDArray() {
		int row,col;
		
		Scanner scanner = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out),true);
		
		out.println("Enter the number of Rows");
		row = scanner.nextInt();
		out.println("Enter the number of Columns");
		col = scanner.nextInt();
		
		int array [][] = new int [row][col];
		
		out.println("Enter the Array Elements\n");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				array [i][j] = scanner.nextInt();
			}
		}
		
		scanner.close();
		
		out.println("Array Elements are");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				out.print(array[i][j] + "\t");
			}
			out.println();
		}
	}
}
