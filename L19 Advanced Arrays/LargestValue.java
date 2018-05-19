import java.util.Random;

/**
 * Finding the largest value. 
 * @author Kim Huynh 
 * @version 2/13
 */
 
public class LargestValue {

	public static void main(String[] args) {
		Random ran = new Random(); 
		int[] lvAr = new int[10]; 
		System.out.print("Array : ");
		for(int i = 0; i < lvAr.length; i++) {
			lvAr[i]= ran.nextInt(100) +1;         // nextInt(100) only goes to 99. 
			System.out.print(lvAr[i]+" ");
		} 
		
		int largest = lvAr[0];                    // This is a linear search. 
		for (int i=0; i< lvAr.length;i++) { 
			if (largest < lvAr[i]) { 
				largest = lvAr[i];
			}
		} 
		System.out.println("\nLargest : "+largest);

	}

}
