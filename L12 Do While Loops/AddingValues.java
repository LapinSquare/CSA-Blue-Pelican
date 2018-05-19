import java.util.Scanner; 

/** 
 * Adding given values. How simple!
 * @author Kim Huynh 
 * @version 11/13/2017
 */ 

public class AddingValues {

	public static void main(String[] args) { 
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("Gimme some numbers to add below! I'll stop if you put in 0.");  
		System.out.print("Number: ");
		int number = keyboard.nextInt(); 
		int total = 0; 
		while (number!=0) { 
			total = total+ number;
			System.out.println("The total so far is "+ total+" !"); 
			System.out.print("Number: "); 
			number = keyboard.nextInt();  
			if (number==0) {  
				System.out.println("");
				System.out.println("Your total attempts equal "+total+" !");
				break;
			}
		} 
		if (number==0 && total==0) {  
			System.out.println("");
			System.out.println("Your total attempts equal "+total+" !");
		}

	}

}
