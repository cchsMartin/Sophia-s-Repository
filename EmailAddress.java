//Great.
//The only change is that your variables should be named using lowercase letters, only using capital letters
//for the second word, onward.
/**
 *Author: Sophia Hildebrand
 *Date: Sep 29, 2020
 *Description:  This program prompts the user for their first name, middle name, last name, and birthday.  It then processes this information and uses it to create an email for the student.
 */

import java.util.Scanner;

public class EmailAddress {
	
	public static void main(String[] args) {
		// input from user
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your first name? ");
		//change all first words of variables to lowercase. It's standard java style. firstName not FirstName.
		String FirstName = keyboard.nextLine(); // stores the next thing typed as a string
		System.out.println("What is your middle name? ");
		String MiddleName = keyboard.nextLine(); // stores the next thing typed as a string
		System.out.println("What is your last name? ");
		String LastName = keyboard.nextLine(); // stores the next thing typed as a string
		System.out.println("What is your birthdate? (In MM-DD-YYYY format)");
		String Birthdate = keyboard.nextLine(); // stores the next thing typed as a string
		
		// output
			// email info
		System.out.print("Email: ");
		System.out.print(LastName.toLowerCase());
		System.out.print(FirstName.substring(0,1));
		System.out.print(MiddleName.substring(0,1));
		System.out.println("@sharkmail.com");
			// password info
		System.out.print("Temp Password: ");
		System.out.print(Birthdate.substring(0,2));
		System.out.print(Birthdate.substring(3,5));
		System.out.println(Birthdate.substring(6,10));
		System.out.print("*** This temporary password is very insecure. Please change it immediately! ***");
		

	}
	
	//get input from user
	
	
	
	//processing
	
	//Print output

}
