import java.util.ArrayList;
import java.util.LinkedList;


public class BSTSequences {
	public static ArrayList<LinkedList<Integer>> generateSequences(TreeNode head){
		ArrayList<LinkedList<Integer>> result = new ArrayList<>();
		if(head==null){
			result.add(new LinkedList<>());
			return result;
		}
		
		LinkedList prefix = new LinkedList<>();
		prefix.add(new Integer(head.data));
		
		/*
		 *recurse on left and right nodes
		 */
		ArrayList<LinkedList<Integer>> leftSeq = generateSequences(head.left);
		ArrayList<LinkedList<Integer>> rightSeq = generateSequences(head.right);
		
		
		for(LinkedList<Integer> list: leftSeq){
			for(LinkedList<Integer> right: rightSeq){
				ArrayList<LinkedList<Integer>> weaved = new ArrayList<>();
				weaveLists(list,right,weaved,prefix);
				result.addAll(weaved);
			}
		}
		return result;
	}

	/*
	 * a function that weaves lists together in all possible ways
	 */
	public static void weaveLists(LinkedList<Integer> left, LinkedList<Integer> right, ArrayList<LinkedList<Integer>> weaved,LinkedList<Integer> prefix){
		if(left.size()==0||right.size()==0){
			LinkedList<Integer> result = (LinkedList<Integer>)prefix.clone();
			result.addAll(left);
			result.addAll(right);
			weaved.add(result);
			return;
		}
		int head = left.removeFirst();
		prefix.addLast(head);
		weaveLists(left, right, weaved, prefix);
		prefix.removeLast();
		left.addFirst(head);
		
		//do the same for the right 
		int head1 = right.removeFirst();
		prefix.addLast(head1);
		weaveLists(left, right, weaved, prefix);
		prefix.removeLast();
		left.addFirst(head1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
