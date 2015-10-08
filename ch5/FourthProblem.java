
public class FourthProblem {
	/*
	 * function for getting the next smaller number with same bits
	 */
	public static int getSmall(int num){
		int temp = num;
		int count0 = 0;//count of zeros
		int count1 = 0;//count of the trailing ones
		while((temp&1) ==1){
			count1++;
			temp = temp>>1;
		}
		//for counting the number of zeros
		while((temp&1)==0){
			count0++;
			temp = temp>>1;
		}
		//position of the first non trailing one
		int p = count0+count1;
		int mask = ~0<<(p+1); 
		int a = num&mask;//getting all zeros from the position of the first non trailing zeros
		int b = a|(1<<(p-1));//num having the last non trailing 1 in the next position
		int all1sExTrail = ~0<<count1;
		int comp = ~all1sExTrail;
		int trailOnes = num&comp;
		int small  = b|(trailOnes<<(count0-1));
		return small;
		
	}
	public static int getlarge(int num){
		int temp = num;
		int count0 = 0;
		int count1=0;
		//count of the trailing zeros
		while((temp&1)==0){
			count0++;
			temp = temp>>1;
		}
		//count of the trailing ones
		while((temp&1)==1){
			count1++;
			temp = temp>>1;
		}
		//position of the first non trailing zero
		int pos = count0+count1;
		int mask = ~0<<pos;
		int a =num&mask;
		int setOne = 1<<pos;
		int ones = ~0<<(count1-1);
		int trailingOnes = ~ones;
		int large = a|setOne|trailingOnes;
		return large;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 209;
		System.out.println("the larger number is"+getlarge(num));
		System.out.println("the smaller number is"+getSmall(num));

	}

}
