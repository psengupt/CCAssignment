import java.util.Arrays;
import java.util.Scanner;

/*
 * a function to check whether one string is the rotation derivative of the other
 */
public class isSubstringClass {
	
	public static boolean isSubstring(String actual,String str){
		//if both are null then return true
		if(str.equals("")&&(!actual.equals(""))) {
			return true;
		}
		//if one is null and the ither is not return false
		else if(actual.equals("")) {
			return false;
		}
		//if the length of the strings differ return false
		else if(actual.length()!=str.length()){
			return false;
			
		}
		else {
			int i=0;
			char[]cActual = actual.toCharArray();
			char[] cStr = str.toCharArray();
			while(cStr[0]!=cActual[i]){
				i++;
			}
			int endActual = i;
			int endStr = 0;
			if(i==actual.length()){
				return false;
			}
			
			else {
				int count=0;
				/*System.out.printf("c is %s",count);
				System.out.printf("i is %s", i);*/
				while((count<str.length())&&(i<str.length())&&(cStr[count]==cActual[i])){
					count++;
					i++;
										
				}
				//System.out.println("count is "+count);
				endStr = count;
			}
			cActual = Arrays.copyOfRange(cActual, 0, endActual);
			actual = new String(cActual);
			cStr = Arrays.copyOfRange(cStr,endStr, str.length());
			str = new String(cStr);
			if(actual.equals(str)){
				return true;
			}
			else
			{
				return false;
			}
			
		}
						
	}
	
	public static void main(String[] args){
		System.out.println("Enter your actual string\n");
		Scanner sc = new Scanner(System.in);
		String actual = sc.nextLine();
		System.out.println("Enter your other string\n");
		String str = sc.nextLine();
		boolean ans = isSubstring(actual, str);
		System.out.println(ans);
		
	}

}
