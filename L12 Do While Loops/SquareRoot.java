import java.util.Scanner; 

/** 
 * Safely square rooting numbers...excluding the negatives. 
 * @author Kim Huynh
 * @version 11/14/2017
 */
 
public class SquareRoot {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);  
		System.out.println("Welcome to SQUARE ROOT!"); 
		System.out.println("--We square root numbers...duh..."); 
		System.out.println("");
		System.out.print("Enter a number to square root: ");
		int number = keyboard.nextInt(); 
		while (number<0) { 
			System.out.println("");
			System.out.println("You can't square root negative numbers! Did you want imaginary numbers?"); 
			System.out.print("Please enter in a POSITIVE number to square root: "); 
			number = keyboard.nextInt(); 
		} 
		if (number>0) { 
			System.out.println("");
			System.out.println("Your number after the square root is... "+ Math.sqrt(number));
		}

	}

}
