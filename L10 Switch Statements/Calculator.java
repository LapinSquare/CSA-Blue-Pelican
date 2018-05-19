import java.util.Scanner; 

/** 
 * Simple Calculator! 
 * @author Kim Huynh 
 * @version 9/28/2017 
 */
 
public class Calculator {

	public static void main(String[] args) { 
		System.out.println("Make your arithmetic selection from the choices below:\n");
		System.out.println(" Addition");
		System.out.println(" Subtraction");
		System.out.println(" Multiplication");
		System.out.println(" Division\n");
		System.out.print(" Your choice? " );
		Scanner kbReader = new Scanner(System.in);
		String choice = kbReader.nextLine( );
		System.out.print("\nEnter first operand. " );
		double op1 = kbReader.nextDouble( );
		System.out.print("\nEnter second operand. " );
		double op2 = kbReader.nextDouble( );
		System.out.println(" ");
		switch (choice)
		{
		case "Addition": //addition
		case "addition": 
			System.out.println(op1 + " plus " + op2 + " = " + (op1 + op2) );
			break;
		case "Subtraction": //subtraction
		case "subtraction":
			System.out.println(op1 + " minus " + op2 + " = " + (op1 - op2) );
			break;
		case "Multiplication": //multiplication
		case "multiplication":
			System.out.println(op1 + " times " + op2 + " = " + (op1 * op2) );
			break;
		case "Division": //division
		case "division":
			System.out.println(op1 + " divided by " + op2 + " = " + (op1 / op2) );
			break;
		default:
			System.out.println("Hey dummy, enter only Addition, Subtraction, Multiplication, or Division!");
		}

	}

}
