// Sasikaladevi Kumarasamy @ facebook_Java_18
package lab4;

import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// declare variables
		int intNumber, squaredNumber, cubedNumber;
		String choice="";
		
		 do {
			// get input from the user
			//System.out.print(" Enter an integer: ");
			intNumber = hasInteger(sc, "Enter an integer: ");
			if (intNumber>0) {
			// print the formatting for the title
			System.out.println();
			
			System.out.printf(" %-14s %-14s %-20s\n", "Number", "Squared","Cubed");
			System.out.printf(" %-14s %-14s %-20s\n","~~~~~~","~~~~~~~","~~~~~");
			
			//find the Square and Cube for each number until the number entered by the user
			for (int i=1; i<=intNumber; i++) {
				squaredNumber = i * i;
				cubedNumber = i * i * i;
				
				//print the formatted results using padding 
				System.out.printf("   %-15d %-14d %-20d\n", i, squaredNumber,cubedNumber);
			}
			}
			else {
				System.out.println("The number should to be greater than 0!");
				continue;
			}
			
			// ask if the user wants to continue
			System.out.print("\n Do you want to continue (y/n) ?");
			choice = sc.next();
			sc.nextLine();
			
		} while(choice.toLowerCase().startsWith("y"));// continue only if the user enters y or Y
		
		// print the concluding message
		System.out.println("\n Goodbye !");
		sc.close();
	}
	
//it checks if the user entered data is an integer or not and returns the integer value
	public static int hasInteger(Scanner sc, String msg) {
		int number =0;
		boolean isValid = false;
		
		while(!isValid) {
			System.out.print(msg);
			if(sc.hasNextInt()) {
				number = sc.nextInt();
				isValid = true;
			}
			else {
				System.out.println("Please enter a valid integer!");
			}
			sc.nextLine();
		}
		return number;
	}
	
}
