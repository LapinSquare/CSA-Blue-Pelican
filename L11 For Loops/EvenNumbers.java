import java.util.Scanner; 

/**
 * @author Kim Huynh
 * @version 11/10/2017
 */
 
public class EvenNumbers {

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);  
		System.out.println("Hey, did you know this program can notice even numbers?"); 
		System.out.println("Watch for the '<' as we count up!");  
		System.out.println("Specify a number you'd like to go up to...");  
		 
		//20 is default... 
		
		int num = input.nextInt( ); 
		System.out.println("");
		for (int i = 1; i<=num ; i++) { 
			if (i%2==0) { 
				System.out.println(i+" <");
			} 
			else { 
				System.out.println(i);
			}
		}

	}

}
