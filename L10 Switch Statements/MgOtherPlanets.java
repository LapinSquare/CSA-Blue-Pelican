import java.util.Scanner;

/** 
 * Calculating weight on imaginary planets! 
 * As per physics, mg = weight.
 * @author Kim Huynh
 * @version 9/29/2017 
 */

public class MgOtherPlanets {

	public static void main(String[] args) { 
		System.out.println("This program converts your current weight to your weight on imaginary planets.\n");
		System.out.print("To begin, what is your current weight on Earth? (You may lie if you'd like to.) ");
		Scanner input = new Scanner(System.in); 
		double mg = input.nextDouble(); 
		System.out.println("\nWhat imaginary planet would you like to imagine your weight on?");
		System.out.println("The choices are listed below...\n");
		System.out.println("1. Voltar"); 
		System.out.println("2. Krypton"); 
		System.out.println("3. Fertos"); 
		System.out.println("4. Servontos\n");
		System.out.println("Your selection?");
		String choice = input.next();
		switch (choice) {
		case "1":
		case "Voltar": 
		case "voltar": 
			System.out.println("Your weight on Voltar would be "+ (mg*0.091)+" lbs. Amazing!");
			break;
		case "2":
		case "Krypton": 
		case "krypton": 
			System.out.println("Your weight on Krypton would be "+ (mg*0.720)+" lbs. Amazing!");
			break; 
		case "3":
		case "Fertos": 
		case "fertos": 
			System.out.println("Your weight on Fertos would be "+ (mg*0.865)+" lbs. Amazing!");
			break; 
		case "4":
		case "Servontos": 
		case "servontos": 
			System.out.println("Your weight on Servontos would be "+ (mg*4.612)+" lbs. Amazing!");
			break; 
			
		}

	}

}
