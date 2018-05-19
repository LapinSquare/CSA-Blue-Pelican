import java.util.Scanner;

public class CountemRight {

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in); 
		String sent; 
		String ssplit;
		int yo=1; 
		String[] sp;
		System.out.println("Type EXIT to leave the Count 'em Right program. "); 
		System.out.println("This program looks for occurances of 'sa'.");
		System.out.println("");

		while (yo==1) {  
			System.out.println("\rType in a sentence and press enter: "); 
			sent = input.nextLine( );  

			if (sent.equalsIgnoreCase("EXIT")) { 
				System.out.println("Thanks for playing!");
				yo++; 
				continue;
			}   
			else if (sent.equalsIgnoreCase("stafford")||sent.equalsIgnoreCase("samuel")||sent.equalsIgnoreCase("samuel stafford")) { 
				System.out.println("Haha, very funny.");
			}
			else { 
				
				sent = sent.toUpperCase(); 
				ssplit = sent+"bunny";
				sp = ssplit.split("SA|S\\s+A");
				
				 int length = sp.length-1;
	             System.out.println("There are " + length + " occurrences.");
	             System.out.println("");
			} 
		} 
	}
}

