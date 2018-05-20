import java.util.Random;  

public class RandomInt {

	public static void main(String[] args) {
		
		Random ran = new Random(); 
		int r = 0;
		
		for (int i=0;i<33;i++) { 
			r = 71 + ran.nextInt(29);
			System.out.println(r);
		}

	}

}
