import java.util.Scanner;

/**
 * Gives an output of your first and last name.  
 * @author Kim Huynh
 * @version 9/19/2017
 */ 

public class FullName {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		System.out.println("What is your first name?");
		String firstn = input.nextLine(); 
		System.out.println("What is your last name?"); 
		String lastn = input.nextLine(); 
		System.out.println("Your full name is "+firstn+" "+lastn+". What a nice name!");
		

	}

}
