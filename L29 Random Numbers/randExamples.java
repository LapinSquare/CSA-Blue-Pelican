import java.util.Random;

//This is purely for the sake of testing out seeds.

public class randExamples {

	public static void main(String[] args) {
		Random rand = new Random();
		rand.setSeed(1);
		
		for (int i=0;i<20;i++) { 
			System.out.println(rand.nextBoolean());
		}

	}

}
