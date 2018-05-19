import java.util.Scanner;  

/** 
 * Sortin' piles of rabbits.
 * @author Kim Huynh 
 * @version 11/14/2017
 */ 

public class EmptyPiles {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);  
		System.out.println("INSTRUCTIONS:"); 
		System.out.println("");
		System.out.println("You have three piles of rabbits, with three rabbits in each pile."); 
		System.out.println("Hired by Bunny Corp to retrieve the rabbits, you must empty--steal--all three piles of rabbits."); 
		System.out.println("Choose a pile, then you will choose a number to empty the pile by."); 
		System.out.println("The game ends when all piles are emptied."); 
		System.out.println(""); 
		System.out.print("Type 1 if you understand. ");
		int steal = keyboard.nextInt(); 

		if (steal==1) { 
			System.out.println("");
			System.out.println("Good. Please type solid numbers like that when prompted to reduce."); 
			System.out.println("Use letters A, B, and C to describe the piles you'd like to reduce.");
			System.out.print("Try pressing A to begin the game. "); 
			String choice = keyboard.next(); 

			if (choice.equalsIgnoreCase("A")) {
				int rabbitA = 3; 
				int rabbitB = 3; 
				int rabbitC = 3; 
				System.out.println("");
				System.out.println("GAME...START!"); 
				System.out.println("");

				while (rabbitA>0 || rabbitB>0 || rabbitC>0) {
					System.out.println("Rabbit Pile A: "+rabbitA+" || Rabbit Pile B: "+rabbitB+"  || Rabbit Pile C: "+rabbitC);
					System.out.print("Which pile would you like to empty? ");

					choice = keyboard.next(); 

					if (choice.equalsIgnoreCase("A")) { 
						System.out.println("");
						System.out.print("How many rabbits would you like to steal from Rabbit Pile A? "); 
						steal = keyboard.nextInt(); 
						if (steal<=3 && steal>=0 && rabbitA!=0) {  
							rabbitA-=steal; 
							System.out.println("");
							System.out.println("Rabbit Pile A now has "+rabbitA+" rabbits.");
							System.out.println(""); 
							if (rabbitA<0) { 
								System.out.println("Wait a moment! You tricked me! Go away!"); 
								System.out.println("Restart the program to play the game.");
								break;
							}
							continue;
						} 
						else if (steal>=4) {
							System.out.println("That's too much! Hmph! Try again.");
							System.out.println("");
							continue;
						} 
						else { 
							System.out.println("");
							System.out.println("What? A negative number or somethin'? Try again."); 
							System.out.println("");
							continue;
						}
					}

					else if (choice.equalsIgnoreCase("B")) { 
						System.out.println("");
						System.out.print("How many rabbits would you like to steal from Rabbit Pile B? "); 
						steal = keyboard.nextInt(); 
						if (steal<=3 && steal>=0 && rabbitB!=0) {  
							rabbitB-=steal; 
							System.out.println("");
							System.out.println("Rabbit Pile B now has "+rabbitB+" rabbits.");
							System.out.println("");
							if (rabbitB<0) { 
								System.out.println("Wait a moment! An error has occured!"); 
								System.out.println("Restart the program to play the game.");
								break;
							}
							continue;
						} 
						else if (steal>=4){
							System.out.print("That's too much! Hmph! Try again.");
							System.out.println("");
							continue;
						} 
						else { 
							System.out.println("");
							System.out.println("What? A negative number or somethin'? Try again."); 
							System.out.println("");
							continue;
						}
					} 
					else if (choice.equalsIgnoreCase("C")) { 
						System.out.println("");
						System.out.print("How many rabbits would you like to steal from Rabbit Pile C? "); 
						steal = keyboard.nextInt(); 
						if (steal<=3 && steal>=0 && rabbitC!=0) {  
							rabbitC-=steal; 
							System.out.println("");
							System.out.println("Rabbit Pile C now has "+rabbitC+" rabbits.");
							System.out.println(""); 
							if (rabbitC<0) { 
								System.out.println("Wait a moment! You tricked me! Go away!"); 
								System.out.println("Restart the program to play the game.");
								break;
							}
							continue;
						} 
						else if (steal>=4) {
							System.out.println("That's too much! Hmph! Try again.");
							System.out.println("");
							continue;
						} 
						else {  
							System.out.println("");
							System.out.println("What? A negative number or somethin'? Try again."); 
							System.out.println("");
							continue;
						}
					} 
				} 

				if (rabbitA==0 && rabbitB==0 && rabbitC==0) { 
					System.out.println("Hooray! You emptied all the piles! You win!");
				}

			} 

		}  
		
		else { 
			System.out.println("You clearly didn't understand.");
		}
	}  
} 


