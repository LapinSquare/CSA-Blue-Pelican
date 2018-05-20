import java.io.*;
import java.util.*; //includes ArrayList
import java.text.*; //for NumberFormat
public class BATester
{
	public static void main(String args[])
	{
		NumberFormat formatter = NumberFormat.getNumberInstance( );
		formatter.setMinimumFractionDigits(2);
		formatter.setMaximumFractionDigits(2);
		String name;

		//Instantiate an ArrayList object here called aryList
		ArrayList <BankAccount> aryList = new ArrayList <BankAccount>();

		do
		{
			Scanner kbReader = new Scanner(System.in);
			System.out.print("Please enter the name to whom the account belongs.(\"Exit\" to abort) ");
			name = kbReader.nextLine( );
			if( !name.equalsIgnoreCase("EXIT") )
			{
        //This part is mainly for fun, taunting my teacher.
				if (name.equalsIgnoreCase("Samuel Stafford")||name.equalsIgnoreCase("Samuel")||name.equalsIgnoreCase("Stafford")||name.equalsIgnoreCase("Sam")||name.equalsIgnoreCase("Staff")||name.equalsIgnoreCase("Sam Stafford")) { 
					System.out.println("Go buy your own Ford Mustang.\n");
				}
				else {
					System.out.print("Please enter the amount of the deposit. ");
					double amount = kbReader.nextDouble();
					System.out.println(" "); //gives an eye-pleasing blank line

					// Create a BankAccount object
					BankAccount user = new BankAccount (name,amount);

					// Add it to the ArrayList object 
					aryList.add(user);
				}
			}
		}while(!name.equalsIgnoreCase("EXIT"));

		// Make a BankAccount named ba and assign it to the first account in the list
		BankAccount ba = aryList.get(0);


		double maxBalance = ba.balance;
		String maxName = ba.name;

		//Purpose of loop is to search aryList for largest bank account 
		for(int j = 1; j < aryList.size( ); j++)
		{
			// Step through the remaining objects and decide which one has
			// largest balance (compare each balance to maxBalance) 

			if (aryList.get(j).balance>maxBalance) { 
				ba = aryList.get(j);
				maxBalance = ba.balance;
				maxName = ba.name;
			}

		}

		// Print answer according to project guideline
		System.out.println("");
		System.out.println("The account with the largest balance belongs to "+maxName);
		System.out.println("The amount is $ "+maxBalance);
	}
}

