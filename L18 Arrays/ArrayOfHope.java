public class ArrayOfHope {

	public static void main(String[] args) {
		char ch[]=new char[26]; 
		
		for(int j=0; j<ch.length; j++) {  
			
			ch[j]=(char)(j+65); 
			
			if (ch[j]=='Z') { 
				
				System.out.print(ch[j]+"");
				
			}
			else {
				
				System.out.print(ch[j]+", "); 
				
			}

		}

	}

}
