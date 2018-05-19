import java.util.Scanner;

/** 
 * Math madness. Asks for area. Outputs radius. 
 * @author Kim Huynh
 * @version 9/18/2017
 */ 

public class RadiusOfCircle {

	public static void main(String[] args) { 
		
		Scanner input = new Scanner(System.in);
		
		//For an example, you may use 6361.73 for the area. Radius should be 45.

		System.out.println("What is the area you would like to find the radius for?");
		double area = input.nextDouble();
		double radius = Math.sqrt(area/Math.PI);
		System.out.println("Your radius is..."+radius+"."); 
		
		input.close();

	}

}
