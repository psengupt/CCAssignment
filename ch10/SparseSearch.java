
public class SparseSearch {
	
	public static int sparseSearch(String[] s, String str,int first, int last){
		int mid=0;
		while(last>=first){
			mid=((last+first)/2);
			while(s[mid].isEmpty()){
				int right = mid -1;
				int left = mid+1;
				if(right>=first&&!s[right].isEmpty()){
					mid = right;
					//break;
				}
				else if(left<=last &&!s[left].isEmpty()){
					mid = left;
					//break;
				}
				else{
					right--;
					left++;
				}
			}
		
			if(s[mid].equals(str)){
				return mid;
				
			}
			else if(s[mid].compareTo(str)<0){//traverse to the right side
				first = mid+1;
			}
			else{
				last = mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		String[] str = {"ahe","","","","ball","","cat"};
		System.out.println(sparseSearch(str, "ahe", 0,6));
	}

}
