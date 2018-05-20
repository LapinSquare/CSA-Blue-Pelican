public class MatrixStuff {

	public static int[][] mult(int a[][], int b[][]){

		if(a[0].length != b.length) {  

			System.out.println("It won't work, you crazy person!"); 
			return null;
		}; 

		//a[aRow][aColumnbRow], b[aColumnbRow][bColumn]

		int aRow = a.length;            //a array's row.
		int bColumn = b[0].length;      //b array's column.
		int aColumnbRow = a[0].length;  //a array's column and b array's row. 


		int ans[][] = new int[aRow][bColumn];

		for(int i = 0; i < aRow ;i++){

			for(int r = 0; r < bColumn ;r++){

				for(int c = 0; c < aColumnbRow; c++){

					ans[i][r] += a[i][c] * b[c][r]; 
				}
			}
		} 

		return ans; 
	}

}
