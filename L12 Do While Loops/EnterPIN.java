import java.util.Scanner;

/**
 *This assignment will help you learn how to make a loop,
 *so that you can repeat a section of code over and over again!
 *
 *@author Graham Mitchell 
 *@author Kim Huynh 
 *@version 11/13/2017
 */

public class EnterPIN
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;

		System.out.println("WELCOME TO THE BANK OF RABBITLAND.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt(); 
		int maximumTries = 4; 
		int tries=0;

		while ( entry != pin )
		{  
			tries++;
			if (tries<4) { 
				System.out.println("\nINCORRECT PIN. TRY AGAIN.");
				System.out.print("ENTER YOUR PIN: ");
				entry = keyboard.nextInt();	
			} 
			else {  
				System.out.println("");
				System.out.println("YOU HAVE REACHED THE MAXIMUM NUMBER OF TRIES. RABBIT ASSASSINS ARE NOW AFTER YOUR LIFE."); 
				break;
			}

		}

		if (entry==pin) { 
			System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT."); 
		}
	}

}
