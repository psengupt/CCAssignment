
public class MatrixRotationClass {
	/*
	 * function for rotating a matrix clockwise
	 */
	public static int[][] matrixRotation(int[][] matrix){
		int row_col_count = matrix.length;
		for(int i=0; i<row_col_count/2; i++){
			//the last element's position of the ith layer
			int last = row_col_count-1-i;
			//first element position at the ith layer
			int first = i;
			for(int j = first;j<last;j++){
				//distance of the current element from the first position
				int offset = j - first;
				//top stored away
				int top = matrix[first][j];
				
				//left to top
				matrix[first][j]=matrix[last-offset][first];
				
				//bottom to left
				matrix[last-offset][first]= matrix[last][last-offset];
				
				//right to bottom
				matrix[last][last-offset] = matrix[j][last];
				
				//top to right
				matrix[j][last]=top;
			}
		}
		return matrix;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //input = new int[4][4];
		 int[][] input = {{1,4,5,8},{7,9,45,51},{78,14,56,48},{104, 21,38,49}};
		 for(int i=0; i<4;i++){
			 for(int j=0;j<4;j++){
				 System.out.print(input[i][j]+",");
			 }
			 System.out.println();
		 }
		 input = matrixRotation(input);
		 System.out.println("the answer:");
		 for(int i=0; i<4;i++){
			 for(int j=0;j<4;j++){
				 System.out.print(input[i][j]+",");
			 }
			 System.out.println();
		 }

	}

}
