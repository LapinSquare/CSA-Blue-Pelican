// Too lazy to make notes...

public class BankAccount {
	public double balance; 
	public String name; 
	
	public BankAccount (double m) { 
		balance = m; 
	} 
	public BankAccount (String n) { 
		name = n;
	} 
	public void deposit(double d) { 
		balance = balance + d;

	} 
	public void withdraw(double w) { 
		balance = balance - w;

	} 
	public double tell() {
		return balance;
	}
  
}
