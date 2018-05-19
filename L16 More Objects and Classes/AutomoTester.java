import java.util.Scanner; 

public class AutomoTester {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("You're going on a [mandatory] trip! How many miles per gallon does your car consume?");
		double yo = keyboard.nextInt(); 
		Automobile myBmw = new Automobile(yo); 
		System.out.println("How many gallons would you like your car to be equipped with?");
		yo = keyboard.nextInt(); 
		myBmw.fillUp(yo); 
		System.out.println("How many miles will it take to go to your destination?");
		yo = keyboard.nextInt(); 
		myBmw.takeTrip(yo);
		double fuel_left = myBmw.reportFuel( ); 
		if (fuel_left>0) { 
			System.out.println("You have "+fuel_left+" gallons left!");
		} 
		else { 
			System.out.println("You couldn't make it to your destination. :(");
		}

	}

}
