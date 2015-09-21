import java.util.Scanner;
/*
 * a function to replace all spaces in a string with '%20'
 */

public class URLifyClass {
	//function to URLify
	public static String URLify(char[] input, int str_len){
		//count_space: a variable for storing the occurances of number of spaces
		int count_space=0;
		for(int i=0;i<str_len;i++){
			if(input[i]==' '){
				count_space++;
			}
		}
		//changing the array in-place
		//increasing the array for accomodating the three new chars '%' '2', '0';
		int new_len = str_len+(2*count_space);
		char[] new_input = new char[new_len];
		//the last position of the new string
		int count=new_len-1;
		for(int i=str_len-1;i>=0;i--){
			if(input[i]==' '){
				input[count]='0';
				input[count-1]='2';
				input[count-2]='%';
				count = count-3;
				
			}
			else{
				input[count]=input[i];
				count--;
			}
			
		}
		//new_input[new_len]='\0';
		return(new String(input));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		char[] input_char = {'h','i',' ', 'k','l','m',' ','j',' ',' ',' ',' '};
		//String answer = URLify(input);
		System.out.println(URLify(input_char,8));

	}

}
