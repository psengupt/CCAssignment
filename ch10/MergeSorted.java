
public class MergeSorted {
	/*
	 * Merging two sorted arrays a and b. Array 'a' contains enough space to accomodate the merged sorted array
	 */
	public static void merge(int a[], int[] b, int lastA, int lastB){
		int countA = lastA-1;//counter for array a
		int countB = lastB-1; //count for array b
		int merge_count=lastA+lastB-1;//the index of the last element in merged array
		while(countA>=0 ||countB>=0){
			//situation where the element of array A are put in their position in merged array
			//array B is remaining
			if(countA<0&&countB>=0){
				//fill A with the elements of B
				a[merge_count] = b[countB];
				merge_count--;
				countB--;
			}
			else if(countA>=0 &&countB>=0){
				//compare which is greater and than insert that
				if(a[countA]>=b[countB]){
					a[merge_count] = a[countA];
					countA--;
				}
				else{
					a[merge_count] = b[countB];
					countB--;
				}
			}
			else{
				break;
			}
			merge_count--;
		}
		
	}
	public static void main(String[] args){
		int[] d = {4,8,9,15,17};
		int[] f = {1,2,3,5,6,0,0,0,0,0};
		merge(f,d,5,5);
		for(int i=0;i<10;i++){
			System.out.print(f[i]+",");
		}
	}

}
