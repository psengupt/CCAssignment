import java.util.Scanner;

//checking whether a string has only unique characters without extra data structures
//case sensitive
public class Assignment1_1_1 {
	public static boolean uniqCharacters(String uInput)
	{
		
		int answer_lower=0;// variable for characters of lower case
		int answer_upper = 0;//variable for characters of uppercase
		for(int i=0;i<uInput.length(); i++) {
			//taking each character
			char c = uInput.charAt(i);
			//collecting the offset from the beginning of the alphabet series that is 'a'
			if(c<='z' && c>='a'){
				int offset = c-'a';
				int l = 1<<offset;//shifting the position of 1 bit by offset value to left
				if((answer_lower &l)!=0){//checking whether that position is already filled by a one bit
					return false;
					
				}
				else{
					answer_lower = answer_lower|l;//storing 1 in the bit position given by the offset
				}
			}
			else if(c<='Z' && c>='A'){
				//the same logic as the lowercase is followed for the uppercase
			 	int offset = c-'A';
				int l = 1<<offset;
				if((answer_upper &l)!=0){
					return false;
					
				}
				else{
					answer_upper = answer_upper|l;
				}
			}
		}
		
		return true;
		
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
