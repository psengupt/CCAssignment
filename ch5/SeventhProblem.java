
public class SeventhProblem {
	
	public static int swapBits(int num){
		//for masking the odd positioned bits 
		int maskO = 0xaaaaaaaa;
		//for masking the even positioned bits
		int maskE = 0x55555555;
		//masking the odd positioned bits and shifting right
		int a = (num&maskO)>>1;
		int b = (num&maskE)<<1;
		return a|b;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 201;
		System.out.println("The number after swapping bits is :"+swapBits(num));

	}

}
