package Arrays;

import java.util.Scanner;

public class ArraysRevisited {

	public static void main(String[] args) {
		// intro
		System.out.println("========================");
		System.out.println("Title: Arrays revisted");
		System.out.println("Genre: Java Intermediate");
		System.out.println("Author: Peter Broadbent");
		System.out.println("Language: Java \n" + "Version: " + System.getProperty("java.version"));
		System.out.println("Description:\n\tFilling an Array with User Input then  "
				+ "\n\tmanipulating the data before printing it back out.");
		System.out.println("========================\n");
		System.out.println("");
		
		//Begin code
		Scanner sc = new Scanner(System.in);
		
		int[] someValues = new int[5];
		
		// For Loop to populate the Array
		for(int i = 0; i < someValues.length; i++) {
			System.out.println("Enter an Integer");
			someValues[i] = sc.nextInt();
		}
		
		// For Loop to show the Values * 2
		for(int i = 0; i < someValues.length; i++) {
			System.out.println(someValues[i] + " multiplied by 2 = " + someValues[i] * 2);
		}
	}//end main

}
