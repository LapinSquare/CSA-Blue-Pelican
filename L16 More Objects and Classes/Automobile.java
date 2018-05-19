/**
 * @author Kim Huynh
 * @version 12/1/2017
 */ 

public class Automobile { 
	
	public double mpg; 
	public double gallons;
	public Automobile(double gm){ 
		mpg = gm; 
		gallons=0;
	} 
	public void fillUp (double fu) { 
		gallons = gallons+fu; 
	} 
	public void takeTrip (double m) { 
		gallons = gallons-(m/mpg); 
	} 
	public double reportFuel() { 
		return gallons;
	}

}
