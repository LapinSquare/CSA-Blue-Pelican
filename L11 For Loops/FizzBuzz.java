/** 
 * A VERY INEFFICIENT way to do BPJ's FizzBuzz. Please disregard code until further modification.
 * @author Kim Huynh
 * @version 11/9/2017
 */ 

public class FizzBuzz {

	public static void main(String[] args) {
		for (int i=1; i<101 ;i++) { 
			if (i%3==0||i%5==0) {
				if (i%3==0) { 
					System.out.print("Fizz"); 
					if (i%5==0) { 
						System.out.print("Buzz");
						System.out.println("");
					} 
					else { 
						System.out.println("");
					}
				} 
				else if (i%5==0) { 
					System.out.println("Buzz");
				}   
			}
			else { 
				System.out.print(i);
				System.out.println("");
			}

		}

	}

}
