//import java.util.BitSet;


public class findDupli { 
	
	/* since the number of elements are 32000, they can be easily accomodated in 8*4*2^10 and hence we will 
	 * form a BitSet class that is easentially a byte array and in this array there wull be positions that 
	 * will indicate whether an element exists there or not
	 */
	public static void checkDuplicates(int[] array){
		BitSet bs = new BitSet(32000);
		for(int i=0;i<array.length; i++){
			int num = array[i]-1;//since the number range is starting from 1
			if(bs.get(num)){
				System.out.println("there si a duplicate"+(num+1));
			}
			else{
				bs.set(num);
			}
			
		}
	}
}
	//class BitSet 
	class BitSet{
		
		byte[] bArray = null;
		public BitSet(int d){
			bArray = new byte[(d>>5)+1];//division done by shifting bits
		}
		//returns a boolean value if the array has a bit set 
		boolean get(int num){
			int arrIndex = num<<5;
			int offset = num&(0x1f);
			 return (bArray[arrIndex]&(1<<offset))!=0;
		}
		void set(int num){
			int arrIndex = num<<5;
			int offset = num&(0x1f);
			bArray[arrIndex]|=(1<<offset);
		}
		
	}

	


