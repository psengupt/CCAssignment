import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class numOfIntClass {
	/* the amount of memory available is 4KBytes 4*8*2^10 bytes of data which can be accomodated as
	 * the capacity is 1GB
	 */
	long numOfInts = ((long)Integer.MAX_VALUE+1);
	byte[] bitArray = new byte[(int) (numOfInts/8)];
	/*
	 * function for storing 1 in the bit position whenever an integer is detected
	 * the position is divided by 8 to get the array index and then the remainder is considered to set the 
	 * bit whose position is the offset of the integer from the beginning of the array element
	 */
	void fOpen() throws FileNotFoundException{
		String filename = "";
		Scanner in = new Scanner(new FileReader(filename));
		//setting the bits
		while(in.hasNextInt()){
			int n = in.nextInt();
			bitArray[n/8]|=(1<<n%8);
		}
	}
	/*
	 * function for detecting the missing bits and displaying the number associated with these bits
	 */
	void printMissing(){
		for(int i=0;i<bitArray.length;i++){
			for(int j=0;j<8;j++){
				if((bitArray[i]&(1<<j))==0){
						System.out.println(i*8+j);
						return;
				}
			}
		}
	}

}
