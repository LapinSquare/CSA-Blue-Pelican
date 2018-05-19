import java.util.Scanner;

/** 
 * Easy exercise on determining oddness.
 * @author Kim Huynh 
 * @version 9/26/2017
 */
 
public class EvenOrOdd {

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter an integer: "); 
		int numInt = input.nextInt(); 
		if (numInt%2==0) {
			System.out.println("\nThe integer "+numInt+" is even!");
		} 
		else {
			System.out.println("\nThe integer "+numInt+" is odd!");
		}

	}

}
