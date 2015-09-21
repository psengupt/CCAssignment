import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
public class palindromePermutationClass {
	/*
	 * palindromePermutation: function that checks whether the given string is a 
	 * permutation of a palindrome
	 * it returns a boolean value: true if it is a permutation
	 * false: if it is not a permutation of a palindrome
	 */
	public static boolean palindromePermutation(String input){
		
		char[] cInput = input.toCharArray();
		//hashmap for storing the alphabets and their number of occurances
		HashMap<Character,Integer> hInput = new HashMap<Character,Integer>();
		int strLength = input.length();
		//storing the key:alphabet and values: number of occurances in the hashmap
		for(int i=0; i<cInput.length;i++){
			if(cInput[i] ==' '){
				strLength--;
				continue;
			}
			Character c = cInput[i];
			if(hInput.containsKey(c)){
				int num = hInput.get(c);
				num++;
				hInput.put(c, num);
			}
			else{
				hInput.put(c, 1);
			}
		}
		Iterator entries = hInput.entrySet().iterator();
		//checking if the length of the string is even then the number of occurances
		//for each character should be even
		if(strLength%2==0){
			entries = hInput.entrySet().iterator();
			while(entries.hasNext()){
				Map.Entry<Character, Integer> pair = (Map.Entry<Character, Integer>)entries.next();
				if(pair.getValue()%2==1){
					return false;
				}
				
			}
			return true;
		}
		//checking if the length of the string is odd then the number of occurances
		//for only one character should be odd, all other should have even occurances
		else{
			
			int oddCount=0;
			while(entries.hasNext()){
				Map.Entry<Character, Integer> pair = (Map.Entry<Character, Integer>)entries.next();
				if(pair.getValue()%2==1){
					oddCount++;
				}
				
			}
			if(oddCount>1)
				return false;
			else
				return true;
		}
	}
	public static void main(String[] args){
		System.out.println("Enter your String");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		//Since the string checking should be character insensitive
		input=input.toLowerCase();
		boolean answer = palindromePermutation(input);
		System.out.println(answer);
		
		
	}
}
