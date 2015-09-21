import java.util.Scanner;
/*
 * function for compressing the strings and returning the alphabets with the number of occurances
 * if the new string is having length greater than the old one then return 
 * the old string
 */

public class compressionClass {
	public static StringBuilder compressString(String input){
		char[] cInput = input.toCharArray();
		int count=0;
		//array to store the count of the characters
		int[] characs = new int[52];
		while(count<input.length()){
			if((cInput[count]>='a')&&(cInput[count]<='z')){
				int offset = cInput[count]-'a';
				characs[offset] = characs[offset]+1;
				
			}
			// if character is uppercase then the upper 26 elements of the array
			else if((cInput[count]>='A')&&(cInput[count]<='Z')){
				int offset = 26+cInput[count]-'A';
				characs[offset] = characs[offset]+1;
			}
			else{
				//if any special characters are encountered then exit
				System.out.println("The string contains special characters!!");
				return new StringBuilder("");
			}
			count++;
			
		}
		count=0;
		StringBuilder ans = new StringBuilder();
		while(count<characs.length){
			if(characs[count]==0){
				count++;
				continue;
			}
			if(count<26){
				char c = (char) ('a'+count);
				ans.append(c);
				ans.append(characs[count]);
			}
			else{
				char c = (char) ('A'+count-26);
				ans.append(c);
				ans.append(characs[count]);
			}
			count++;
		}
		return ans;
	}
	public static void main(String args[]){
		System.out.println("Enter your word:");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		StringBuilder ans = compressString(input);
		if(ans.length()<input.length()){
			System.out.println(ans.toString());
		}
		else{
			System.out.println(input);
		}
		
	}

}
