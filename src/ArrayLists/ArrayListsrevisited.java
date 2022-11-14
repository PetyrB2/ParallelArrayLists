package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListsrevisited {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		ArrayList<Double> myList = new ArrayList<>();

		double input;
		
		System.out.println("Enter a number - or above to add the the ArrayList (-1 to Exit)");
		
		input = sc.nextDouble();
		
		while(input >= 0) {
			myList.add(input);
			System.out.println("Enter a number - or above to add the the ArrayList (-1 to Exit)");
			input = sc.nextDouble();
		}//end while
		
		// Sorted List Highest to Lowest
		System.out.println("The List is: \n\t");
		for (int i = myList.size() - 1; i >=0; i--) {
			
			System.out.println(myList.get(i));
		}
	}//end main 

}
