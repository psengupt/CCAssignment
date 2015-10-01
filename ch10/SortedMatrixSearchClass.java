
public class SortedMatrixSearchClass {
	/*
	 * function that returns the most likely subMatrix where the number might be present
	 */
	public static int[] indicesSearch(int[][] array, int x){
		int[] ans = {-1, -1};
		for(int i=0; i<array.length; i++){
			if(array[i][i]==x){
				ans[0] = i;
				ans[1] = i;
				return ans;
			}
			else if(array[i][i]<x){
				ans[0]=i;				
			}
			else{
				ans[1]=i;
				return ans;
			}
		}
		return ans;
	}
	
	/*
	 * function for checking the value of numbers between the given indices
	 */
	public static boolean binarySearch(int[][] array,int x){
		//starting from the first row and last column
		int row = 0;
		int col = array[0].length-1;
		while(row<array.length&&col>=0){
			if(array[row][col]==x)
				return true;
			//if the element is bigger move inside
			else if(array[row][col]>x)
				col--;
			//if the element is lower move down
			else
				row++;
			
		}
		return false;
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {{1,2,4,5},{3,7,8,9},{10,11,15,19},{12,13,14,16}};
		int[] a= indicesSearch(array,4);
		if(a[1]==-1){
			System.out.println("The matrix doesn't have the element");
		}
		else {
			System.out.println("It might exist in one row");
			System.out.println(binarySearch(array, 12));
		}
	}

}
