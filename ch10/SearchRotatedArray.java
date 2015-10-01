
public class SearchRotatedArray {
	
	
	public static int searchArray(int[] array,int first, int last, int x){
		if(last<first)
			return -1;
		else{
			int mid = (last+first)/2;
			if(array[mid]==x)
				return mid;
			else{
				if(array[mid]>array[first]){
					//when the left hand side is in order
					if(array[mid]> x&&array[first]<=x){
						
						return searchArray(array, first, mid-1, x);
					}
					else{
						return searchArray(array, mid+1, last, x);
					}
				}
				else if(array[mid]<array[last]){
					//when the right hand side is in order
					if(array[mid]< x&&array[last]>=x){
						return searchArray(array, mid+1, last, x);
					}
					else
						return searchArray(array, first, mid-1, x);
				}
				else if(array[first]==array[mid]){//when the left hand side is equal
						if(array[mid]!=array[last]){//then the right hand side has the element
							return searchArray(array, mid+1, last, x);
					}
					else{//search both sides
						int res = searchArray(array, first, mid-1, x);
						if(res==-1)
							return searchArray(array, mid+1, last, x);
						return res;
					}
				}
			}
		}
		return -1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {5,5,5,7,1,5};
		System.out.println(searchArray(num, 0, 5, 1));

	}

}
