package Programfirst;
import java.util.Scanner;  // Import the Scanner class

class Main {

	public static void main(String[] args) {

		
		  
		    Scanner input = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter username");

		    String userName = input.nextLine(); // Read user input
		    int age = input.nextInt();
		    System.out.println("Username is: " + userName);  // Output user input
	        System.out.println("age is"+ " " + age);
	}
}
