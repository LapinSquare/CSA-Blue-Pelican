import java.util.Scanner;

public class DistToLineTester {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		System.out.println("Enter the A value for the line: ");
		DistToLine.A = keyboard.nextDouble();
		System.out.println("Enter the B value for the line: "); 
		DistToLine.B = keyboard.nextDouble();
		System.out.println("Enter the C value for the line: "); 
		DistToLine.C = keyboard.nextDouble();
		System.out.println("Enter the X value for the line: "); 
		double x = keyboard.nextDouble();
		System.out.println("Enter the Y value for the line: ");
		double y = keyboard.nextDouble();
		
		System.out.println("");
		System.out.println("Distance from the point to the line is : "+DistToLine.getDist(x, y));


	}

}
