import java.util.Random; 

import java.util.Scanner;

/** 
 * Flippin' coins. 
 * @author Kim Huynh 
 * @version 11/14/2017
 *
 */ 

public class FlipAgain
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random rng = new Random(); 
		System.out.print( "Would you like to flip a coin (y/n)? " );
	    String again = keyboard.nextLine(); 

		if (again.equals("y")) {
			do
			{
				int flip = rng.nextInt(2);
				String coin;

				if ( flip == 1 )
					coin = "HEADS";
				else
					coin = "TAILS";

				System.out.println( "You flip a coin and it is... " + coin );

				System.out.print( "Would you like to flip again (y/n)? " );
				again = keyboard.next();
			} 

			while ( again.equals("y") );  
		} 
		else { 
			
			System.out.println("Thanks for checking out the program...without even playing it.");
			
		}

	}
}
