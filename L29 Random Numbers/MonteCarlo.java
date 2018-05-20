import java.util.Random;   
 
public class MonteCarlo { 
	public double h;
	public double k; 
	public double r; 
	private Random rndm = new Random();


	public MonteCarlo (double hx, double ky, double ra) { 
		h=hx;
		k=ky; 
		r=ra;
	}
	public double nextRainDrop_x( ) {  
		return ((h*2) * rndm.nextDouble());
	} 
	public double nextRainDrop_y( ) { 
		return ((k*2) * rndm.nextDouble());
	} 
	public boolean insideCircle(double x, double y) { 
		if (((x-h)*(x-h) + (y-k)*(y-k)) <= (r*r)) { 
			return true;
		} 
		else {	 
			return false;  
		}

	}


}
