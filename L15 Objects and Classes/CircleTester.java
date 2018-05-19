public class CircleTester {

	public static void main(String[] args) {
		Circle cir1 = new Circle(5.1); 
		Circle cir2 = new Circle(20.6); 
		double xx=cir1.radius; 
		System.out.println(cir2.area()); 
		cir2.setRadius(40.1); 
		System.out.println(cir2.circumference());  
		System.out.println(""); 
		System.out.println("For 'What's that Diameter?' :");
		cir1.setRadius(35.5); 
		System.out.println(cir1.diameter());  

	}

}
