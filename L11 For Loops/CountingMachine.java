import java.util.Scanner; 

/** 
 * Combines Counting Machine and Counting Machine Revisited.
 * @author Kim Huynh 
 * @version 11/9/2017
 *
 */ 

public class CountingMachine {

	public static void main(String[] args) { 
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("Which exercise would you like to see?"); 
		System.out.println("1) Counting Machine. [Exercise 2]"); 
		System.out.println("2) Counting Machine Revisited. [Exercise 3]"); 
		int choice = keyboard.nextInt();  
		switch(choice) { 
		case 1:  
			System.out.println(" ");
			System.out.print("Count to: "); 
			int countN = keyboard.nextInt(); 
			for (int i=0;i<=countN;i++) { 
				System.out.print(i+" ");
			} 
			break; 
		case 2: 
			System.out.println(" ");
			System.out.print("Count from: "); 
			int cFrom = keyboard.nextInt();  
			System.out.println("");
			System.out.print("Count to: "); 
			int cTo = keyboard.nextInt();  
			System.out.println("");
			System.out.print("Count by: "); 
			
			int cBy = keyboard.nextInt();   
			System.out.println(""); 
			for (int i = cFrom ; i<=cTo ; i=i+cBy) { 
				System.out.print(i+" ");
			}
			break;

		}


	}

}
