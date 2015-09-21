import java.util.Scanner;


public class oneOrZeroEdits {
	/*
	 * a function to check if the two strings are one edit away from each other
	 */
	public static boolean oneOrZero(String str1,String str2){
		if(str1.length()<str2.length()){
			String temp = str1;
			str1=str2;
			str2=temp;
		}
		int len1=str1.length();
		int len2=str2.length();
		if(len1-len2>1){
			return false;
		}
		else{
			int countBig=0;
			int incrTime=0;
			
			for(int i=0;i<len2;i++){
				if(str1.charAt(countBig)!=str2.charAt(i)){
					if(len1>len2){
						countBig++;
						i--;
						incrTime++;
						if(incrTime>1)
							return false;
						continue;
					}
					else{
						countBig++;
						incrTime++;
						if(incrTime>1)
							return false;
						continue;
					}
				}
				countBig++;
			}
			return true;
		}
	}
	public static void main(String[] args){
		System.out.println("Enter the first string");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		System.out.println("Enter the second string");
		String str2 = sc.nextLine();
		boolean answer = oneOrZero(str1, str2);
		System.out.println(answer);
	}
	

}
