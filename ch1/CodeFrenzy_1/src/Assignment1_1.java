import java.util.Scanner;

//Assumption: uppercase 'A' is treated same as lower case 'a'
//determining if only unique characters are present in the string using extra data structures
public class Assignment1_1 {
	//A function to check whether a string has all unique characters
	public static boolean uniqCharacters(String uInput)
	{
		boolean isUniq = true;//isUniq: stores boolean value, if there are duplicates then it stores 'false' else 'true'
		int[] arr = new int[26];
		String lCase = uInput.toLowerCase();//coverting all characters to lowercase
		for(int i=0;i<uInput.length(); i++) {
			//collecting the offset from the beginning of the alphabet series that is 'a'
			int offset = lCase.charAt(i)-'a';
			arr[offset] = arr[offset]+1;
			if(arr[offset]>1){
				isUniq = false;
				break;
			}
		}
		return isUniq;
		
	}
	
	public static void main(String[] args){
		System.out.println("Enter your string");
		Scanner sc = new Scanner(System.in);
		String uInput = sc.nextLine();
		//System.out.println(uInput);
		boolean ans = uniqCharacters(uInput);
		System.out.println(ans);
	}

}
