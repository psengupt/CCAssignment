
public class setColumnRowZero {
	
	public static void setZero(int[][] arr){
		//function for setting the matrix's row and column to zero if 
		//any element for that row or column is zero
		//length of the rows and columns
		int colLength = arr[0].length;
		int rowLength = arr.length;
		
		int[] row = new int[rowLength];
		int[] col = new int[colLength];
		//setting the row element and column element
		//arrays to store which row had an element as zero
		for(int i=0;i<rowLength;i++){
			row[i]=1;
		}
		//arrays to store which column had an element as zero
		for(int i=0;i<colLength;i++){
			col[i]=1;
		}
		//making the row and column array value zero for any element having zero value
		for(int i=0;i<rowLength;i++){
			for(int j=0; j<colLength; j++){
				if(arr[i][j]==0){
					row[i]=0;
					col[j]=0;
				}
			}
		}
		//setting the entire column and the entire row to zero for an element having zero value
		for(int i=0; i<rowLength; i++){
			for(int j=0; j<colLength; j++){
				arr[i][j] = arr[i][j]*row[i]*col[j];
			}
		}
		
	}
	public static void main(String[] args){
		//int[][] arr = new int[3][4];
		int[][] arr = {{1,2,3,0},{5,0,3,1},{4,5,6,8}};
		//System.out.println(arr[0][0]);
		setZero(arr);
		int colLength = arr[0].length;
		int rowLength = arr.length;
		for(int i=0; i<rowLength; i++){
			for(int j=0; j<colLength; j++){
				System.out.print(arr[i][j]+", ");
			}
			System.out.println();
		}
	}
}
