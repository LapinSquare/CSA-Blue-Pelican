/** 
 *Encrypts certain words. This is a very big morning, isn't it?
 * @author Kim Huynh 
 * @version 1/25/18
 */
public class Crypto { 

	public String ret = "";  
	public char c;
	public char c2;


	public String encrypt(String en) { 

		for (int i=0 ; i < en.length() ; i++) { 
			
			c = en.charAt(i); 

			switch (c)  
			{ 
			case 'v': 
			case 'V': 
				ret = ret+ "ag' ,r";
				break;
			case 'm': 
			case 'M':  
				ret = ret+ "ssad";
				break;
			case 'g': 
			case 'G':  
				ret = ret+ "jeb..w";
				break;
			case 'b': 
			case 'B':  
				ret = ret+ "dug>?/";
				break;
			default: 
				ret = ret+ c;
				break;
			}
		}

		return ret;

	}

	public String decrypt(String de) { 

		for (int i=0 ; i < de.length() ; i++) { 

			if (de.indexOf("ag' ,r")!=-1) { 
				de = de.replace("ag' ,r", "v"); 
			}  
			if (de.indexOf("ssad")!=-1) { 
				de = de.replace("ssad", "m");
			}  
			if (de.indexOf("jeb..w")!=-1) { 
				de = de.replace("jeb..w", "g"); 
			} 
			if (de.indexOf("dug>?/")!=-1) { 
				de = de.replace("dug>?/", "b");
			} 

		}
		return de;
	}

}

//this.a=a. Also, always use PRIVATE (for most of the time on AP Tests).
