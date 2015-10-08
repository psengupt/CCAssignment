
public class SixthProblem {
	/*
	 * function that takes two numbers as arguments and returns the numbers of bits that are different in these 
	 * two numbers as the answer
	 */
	public static int diffBits(int num1, int num2){
		int count = 0;//keeps a count of the difference in bits in the two numbers
		//num1^num2: returns those bits as 1 which are having different values in the two numbers
		//c&(c-1): clears the lowest set bit
		for(int c=num1^num2; c!=0;c=c&(c-1)){
			count++;
		}
		return count;
	}
	public static void main(String[] args){
		int num1 = 3;
		int num2 = 4;
		System.out.println("the numbers of bits to be flipped:"+diffBits(num1, num2));
	}

}
