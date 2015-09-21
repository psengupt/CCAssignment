import java.util.Scanner;


public class isPermutation {
	/*
	 * A function to check whether one string is the permutation of the other
	 * This function is case insensitive
	 */
	public static boolean checkIsPermutation(String input, String perm){
		//if both the strings are null then return false as null cannot be  a permutation of null
		if((input.equals(""))||(perm).equals("")){
			return false;
		}
		//if the length of the strings differs then return false
		else if(input.length()!=perm.length()){
			return false;
		}
		
		else{
			//since the assumption is case insensitive hence convert both the strings to lowercase
			input = input.toLowerCase();
			perm = perm.toLowerCase();
			//arrays to store the number of times of occurence of alphabets in each string
			int[] iTimes = new int[26];
			int[] pTimes = new int[26];
			int i=0;
			//storing the number of occurences 
			while(i<input.length()){
				int offset = input.charAt(i)-'a';
				iTimes[offset]=iTimes[offset]+1;
				offset = perm.charAt(i)-'a';
				pTimes[offset] = pTimes[offset]+1;
				i++;
			}
			i=0;
			//comparing the number of each character occurances
			while(i<26){
				if(iTimes[i]!=pTimes[i]){
					//if there is a difference in the occurances return false
					return false;
				}
				i++;
			}
			return true;
		}
	}
	public static void main(String[] args){
		System.out.println("Please enter your original string");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println("Please enter your permuted string");
		String perm = sc.nextLine();
		System.out.println("The answer is "+checkIsPermutation(input, perm));
	}

}
