import java.util.Scanner; 

public class BankTester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);   
		System.out.println("Welcome to RabbitLand Bank. What's your name?");
		String name = input.nextLine( ); 
		
		BankAccount nom = new BankAccount(name);  

		System.out.println("\nHello, "+name+" !");  
		System.out.println("You have a bank account presently, but it doesn't have any money."); 
		System.out.println("How much would you like to input into your account before proceeding?");
		double balance = input.nextDouble( ); 
		System.out.println("\nThank you! Your account now has $"+balance+" ."); 

		BankAccount myAccount = new BankAccount(balance);  

		System.out.println(""); 
		System.out.println("With your newly-minted account, would you like to...");
		System.out.println("1) Deposit money into your account."); 
		System.out.println("2) Withdraw money from your account."); 
		System.out.println("3) Leave.");
		int choice = input.nextInt( );  
		while (choice != 3) {
			if (choice==1) {  
				System.out.println("How much would you like to deposit into your account?");  
				balance = input.nextDouble(); 
				myAccount.deposit(balance);
				System.out.println("$"+myAccount.tell()+" is your new balance."); 
				System.out.println(""); 
				System.out.println("Would you like to...");
				System.out.println("1) Deposit money into your account."); 
				System.out.println("2) Withdraw money from your account."); 
				System.out.println("3) Leave.");
				choice = input.nextInt( ); 
				
			} 
			if (choice==2) {  
				System.out.println("How much would you like to withdraw from your account?");  
				balance = input.nextDouble(); 
				myAccount.withdraw(balance); 
				if (balance>myAccount.tell()) { 
					System.out.println("You now have debt.");
				}
				System.out.println("$"+myAccount.tell()+" is your new balance."); 
				System.out.println(""); 
				System.out.println("Would you like to...");
				System.out.println("1) Deposit money into your account."); 
				System.out.println("2) Withdraw money from your account."); 
				System.out.println("3) Leave.");
				choice = input.nextInt( ); 
				
			}

		} 
		if (choice==3) { 
			System.out.println("Thanks for visiting RabbitLand Bank!"); 
			System.out.println("The "+name+" account balance is $"+myAccount.tell());
		}
	}
}


