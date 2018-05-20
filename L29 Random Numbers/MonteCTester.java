import java.util.Random;    

public class MonteCTester {

	public static void main(String[] args) {
		
		double cirCount=0; 
		double sqrCount=0;
		
		MonteCarlo mcObj = new MonteCarlo (5,3,2); 
		for (int i=0;i<100000000;i++) { 
			double x = mcObj.nextRainDrop_x( ); 
			double y = mcObj.nextRainDrop_y( ); 
			if (mcObj.insideCircle(x,y)) { 
				cirCount++;
			} 
			sqrCount++;	
		} 
		
		double pi = cirCount * (10.0*6.0) / (double)(sqrCount * 4.0);
		System.out.println(pi);

	}

}


