
public class ThirdProblem {
	/*function that gives the maxSequence of 1s
	 * 
	 */
	public static int sequenceCount(int num) {
		int maxSequence = 1;
		int[] sequences = {0,0,0};
		int flag = 0;//a flag variable that keeps track of the bits
		for(int i=0;i<32;i++){
			if((num&1)!=flag){//checking that the flag and last bit of n are having same value
				if(flag==1){
					maxSequence = Math.max(maxSequence, getMaxSequence(sequences));//whenever bit changes from 1to0
					//compute the maxSequence
										
				}
				flag = num&1;
				shift(sequences);				
			}
			sequences[0]++;
			num = num>>>1;
		}
		//for the last sequence if the mid of array:sequences does not have count of 0s but has 1s then shift
		if(flag==0)
			shift(sequences);
		return Math.max(maxSequence, getMaxSequence(sequences));
		
	}
	/*
	 * a function to get the count of the maximum sequence
	 */
	public static int getMaxSequence(int[] array){
		if(array[1]==1)
			return array[0]+array[2]+1;
		else{
			if(array[1]==0){//there is no zeros between ones
				return Math.max(array[0], array[2]);
			}
			else
				return(Math.max(array[0], array[2]))+1;
		}
		
	}
	//shifts the values of the array one position to the left
	public static void shift(int[] array){
		array[2]=array[1];
		array[1]=array[0];
		array[0] = 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
