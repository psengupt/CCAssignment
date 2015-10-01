import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class GroupAnagrams {
	/*
	 * sorting the characters of the string
	 */
	public static String sortCharac(String s){
		char[] characs = s.toCharArray();
		Arrays.sort(characs);
		return new String(characs);
		
	}
	public static void GroupAnagramsFn(String[] s){
		/*for grouping anagrams together*/
		HashMap map  = new HashMap<String, ArrayList<String>>();
		for(String str :s){
			String key = sortCharac(str);
			if(map.containsKey(key)){
				ArrayList input = (ArrayList) map.get(key);
				input.add(str);
				map.put(key, input);
			}
			else{
				ArrayList input = new ArrayList<String>();
				input.add(str);
				map.put(key, input);
			}
			
		}
		
		/*putting all into an array*/
		Iterator mpIt = map.entrySet().iterator();
		while(mpIt.hasNext()){
			Map.Entry<String, ArrayList<String>> hM = (Entry<String, ArrayList<String>>) mpIt.next();
			ArrayList listH = (ArrayList)hM.getValue();
			for(int i =0; i<listH.size();i++){
				System.out.print(listH.get(i)+",");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"sdf","sfd","dfs","hys","shd"};
		GroupAnagramsFn(s);
	}

}
