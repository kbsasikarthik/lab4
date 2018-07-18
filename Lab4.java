// Sasikaladevi Kumarasamy @ facebook_Java_18
package lab4;

import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// declare variables
		int intNumber, squaredNumber, cubedNumber;
		String choice;
		
		do {
			// get input from the user
			System.out.print(" Enter an integer: ");
			intNumber = sc.nextInt();
			
			// print the formatting for the title
			System.out.println();
			System.out.println("Number         Squared        Cubed"); 
			System.out.println("~~~~~~         ~~~~~~~        ~~~~~"); 
			
			//find the Square and Cube for each number until the number entered by the user
			for (int i=1; i<=intNumber; i++) {
				squaredNumber = i * i;
				cubedNumber = i * i * i;
				
				//print the formatted results using padding 
				System.out.printf("   %-13s %-14s %-20s\n", i, squaredNumber,cubedNumber);
			}
			
			// ask if the user wants to continue
			System.out.print("\n Do you want to continue (y/n) ?");
			choice = sc.next();
		} while(choice.equalsIgnoreCase("y")); // continue only if the user enters y or Y
		
		// print the concluding message
		System.out.println("\n Goodbye !");
		sc.close();
	}
}
