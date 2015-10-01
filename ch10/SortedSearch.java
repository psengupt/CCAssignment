
public class SortedSearch {
	
	public static int sortedSearch(Listy list, int x){
		 int count=1;
		 int list_el = list.elementAt(count);
		 while(list.elementAt(count)!=-1&&list.elementAt(count)<x){
			 count*=2;
		 }
		 int index=sortedBinarySearch(list,count/2,count,x);
		 return index;
	}
	public static int sortedBinarySearch(Listy list,int first,int last, int x){
		while(last>=first){
			int mid = (first+last)/2;
			int mid_el = list.elementAt(mid);
			if(mid_el==-1||mid_el>x){
				last = mid-1;
			}
			else if(mid_el<x){
				first = mid+1;
			}
			else{
				return mid;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		int[] a = {4,5,8,9,14,16,17,21};
		Listy list = new Listy(a);
		System.out.println(sortedSearch(list, 21));
		
	}

}
 class Listy{
	 int[] ar = null;
	 public Listy(int[] arr){
		 ar = arr;
		 
	 }
	 public int elementAt(int index){
		 if(index>ar.length){
			 return -1;
		 }
		 return ar[index-1];
	 }
 }