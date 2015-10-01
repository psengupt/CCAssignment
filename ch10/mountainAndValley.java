
public class mountainAndValley {
	/*
	 * function for discovering the peaks
	 */
	public static int maxIndex(int[] array, int a, int b, int c){
		int ans_val = Integer.max(array[a], Integer.max(array[b], array[c]));
		if(ans_val==array[a])
			return a;
		else if(ans_val==array[b])
			return b;
		else
			return c;
	}
	/*
	 * function for replacing the valleys and peaks alternately 
	 */
	public static void replacePeaks(int[] array){
		for(int i=1;i<array.length; i+=2){
			//find the index of the largest integer and then swap to make the middlemost element as the peak
			if(i!=(maxIndex(array, i-1, i, i+1))){
				int temp = array[i-1];
				array[i-1]=array[i];
				array[i] = temp;
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {9, 2, 3, 5, 1, 9, 7};
		replacePeaks(array);
		for(int i = 0; i<array.length; i++){
			System.out.print(array[i]);
		}

	}

}
