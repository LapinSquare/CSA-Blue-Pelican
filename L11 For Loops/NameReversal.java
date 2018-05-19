import java.util.Scanner;

/**
 *  Ahaha! It reverses your name! How obvious! 
 *  @author Kim Huynh
 *  @version 11/9/2017
 */

public class NameReversal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  
		System.out.println("What's your name? I'll reverse it and make it lower-cased for you! ");
		String name = input.nextLine( ); 
		if (name.equalsIgnoreCase("samuel")||name.equalsIgnoreCase("stafford")||name.equalsIgnoreCase("sam")||name.equalsIgnoreCase("sam stafford")||name.equalsIgnoreCase("samuel stafford")) { 
			System.out.println(""); 
			System.out.println("Haha, I don't feel like doing that. Sorry."); 
			System.out.println("Try your alternate alias--Bill, was it?"); 
		} 
		else { 
			System.out.println("");
			System.out.println("Thanks! Your [permanant, non-negotiable] name is now..."); 
			System.out.println("");
			String nameLower = name.toLowerCase();  
			int nameLength = name.length(); 
			for (int i=nameLength;i>0;i--) { 
				System.out.print(nameLower.substring(i-1,i)); 
			} 
      
		}

	}

}
