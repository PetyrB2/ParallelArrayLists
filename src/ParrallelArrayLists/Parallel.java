package ParrallelArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Parallel {

	public static void main(String[] args) {
		// intro
		System.out.println("========================");
		System.out.println("Title: Parallel ArrayLists");
		System.out.println("Genre: Java Intermediate");
		System.out.println("Author: Peter Broadbent");
		System.out.println("Language: Java \n" + "Version: " + System.getProperty("java.version"));
		System.out.println("Description:\n\t ArrayLists. Pulling data that corresponds from each one.");
		System.out.println("========================\n");
		System.out.println("");
		// begin code
		// ArrayLists ages and names
		ArrayList<Integer> ages = new ArrayList<>();
		ArrayList<String> names = new ArrayList<>();

		// create an integer and string object
		int age;
		String name;
		
		// Create new instance of Scanner for user input
		Scanner sc = new Scanner(System.in);

		
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter a Name: ");
			name = sc.nextLine();
			System.out.println("Enter an Age: ");
			age = sc.nextInt();
			// Consume next Line
			sc.nextLine();
			
			names.add(name);
			ages.add(age);
			System.out.println();
		}//end for
		
			
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i) + " is " + ages.get(i) + " years old.");
		}

	}// end main

}
