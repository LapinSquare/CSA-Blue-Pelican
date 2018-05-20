import java.io.*;
import java.util.*;

//Modified fibonacci sequence. See BPJ book for more details.

public class ModFibTester {

	public static void main(String[] args) {
		Scanner kbReader = new Scanner(System.in);
		System.out.print("Generate which term number? ");
		int k = kbReader.nextInt( );
		System.out.println("Term #" + k + " is " + ModFib.modFibonacci(k));
	}

}
