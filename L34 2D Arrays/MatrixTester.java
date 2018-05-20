/**
 * Multiplying certain matrices.
 * @author Kim Huynh 
 * @version 2/15/2018
 */
 
public class MatrixTester { 

	public static void main(String[] args) {
		int[][] aMatrix = {{1,2,-2,0},{-3,4,7,2},{6,0,3,1}}; 
		int[][] bMatrix = {{-1,3},{0,9},{1,-11},{4,-5}}; 
		int[][] ans = MatrixStuff.mult(aMatrix,bMatrix); 
		
		for (int r=0; r<ans.length; r++) { 
			for (int c=0; c<ans[r].length; c++) { 

				int ansF = ans[r][c];

				System.out.print(ansF); 
				
				//For spacing
				
				if (ansF == 1) { 
					System.out.print("   ");
				} 
				else { 
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}

	}

}
