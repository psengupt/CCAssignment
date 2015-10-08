
public class FirstProblem {
	/*function to update the bits in n to fit m from position i
	 * to position j
	 */
	
	public static int updateBits(int n, int m, int j, int i){
		//creating the mask
		int allOne = ~0;
		int shiftj = (allOne<<j+1);
		int oneI = (1<<i)-1;
		int mask = shiftj|oneI;//creating the mask that contains zeros from j to i
		n = n&mask;
		int m_shifted = m<<i;
		return n|m_shifted;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
