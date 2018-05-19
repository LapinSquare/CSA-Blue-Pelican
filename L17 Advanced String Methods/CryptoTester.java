import java.io.*;
import java.util.*;

public class CryptoTester
{
	public static void main(String args[])
	{
		Scanner kbReader = new Scanner(System.in);
		System.out.print("Enter a sentence that is to be encrypted: ");
		String sntnc = kbReader.nextLine( );
		System.out.println("Original sentence = " + sntnc);
		Crypto myCryptObj = new Crypto( );
		String encryptdSntnc = myCryptObj.encrypt(sntnc);
		System.out.println("Encrypted sentence = " + encryptdSntnc);
		String decryptdSntnc = myCryptObj.decrypt(encryptdSntnc);
		System.out.println("Decrypted sentence = " + decryptdSntnc);
	}
} 

/*One method, encrypt, will accept a String that represents the
sentence to be encrypted. It will return a String that is the sentence with all v’s (big or small)
replaced with “ag’,r”, all m’s (big or small) with “ssad”, all g’s (big or small) with “jeb..w”, and
all b’s (big or small) with “dug>?/”.*/ 

//Stafford used to owe me a Pepsi for not checking this off. 
