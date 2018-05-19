import java.util.Arrays;

public class AscendDescend {

	public static void main(String[] args) {

String[] ss = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
		System.out.println("Ascend     Descend"); //11
		Arrays.sort(ss); 
		System.out.println("");

        for(int i = 0; i < ss.length; i++) {
        	System.out.print(ss[i]);
        	if (ss[i].length()==3){ 
        		System.out.print("        "+ss[ss.length-1-i]);
        		System.out.println("");
        	} 
        	if (ss[i].length()==4){ 
        		System.out.print("       "+ss[ss.length-1-i]);
        		System.out.println("");
        	}
        	if (ss[i].length()==5){ 
        		System.out.print("      "+ss[ss.length-1-i]);
        		System.out.println("");
        	} 
        	if (ss[i].length()==6){ 
        		System.out.print("     "+ss[ss.length-1-i]);
        		System.out.println("");
        	}
        	if (ss[i].length()==7){ 
        		System.out.print("    "+ss[ss.length-1-i]);
        		System.out.println("");
        	}

    }

	}

}
