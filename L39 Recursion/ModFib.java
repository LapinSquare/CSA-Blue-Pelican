public class ModFib {
	
	public static int modFibonacci(int k) { 
		if (k==0) { 
			return 3;
		} 
		else if (k==1) { 
			return 5;
		} 
		else if (k==2) { 
			return 8;
		}
		else { 
			return modFibonacci(k-1) + modFibonacci(k-2) + modFibonacci(k-3);
		}
	}
}
