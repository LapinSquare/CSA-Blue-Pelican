import java.util.Random;   
 
/**
 * Generate 27 random doubles in the inclusive range from 99.78 to 147.22. 47.44 is difference.
 * @author Kim Huynh
 * @version 12/9/2017
 */ 

public class RandomDouble {

	public static void main(String[] args) {
		Random ran = new Random(); 
		double r;
		
		for (int i=0;i<27;i++) { 
			r = 99.78 + 47.445 * ran.nextDouble();
			System.out.println(r);  
			
			//If you ever doubt that 147+ ever shows up, uncomment the following. It appears rarely, I say!
			//if (r>=147) { 
			//	System.out.println("HEYYYYYYYYYYYYYYYYYY KIIIIIIIIIIIIIMMMMMMMMMMMMM!");
			//}
		} 

	}

}
