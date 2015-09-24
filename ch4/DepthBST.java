import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;


public class DepthBST {
	
	public static void depthListsNotRoot(TreeNode node, ArrayList<LinkedList>lists, int level){
		if(node==null) return;
		LinkedList<TreeNode> list = null;
		if(lists.size()==level){
			//create list as no list for the level exists
			 list = new LinkedList<>();
			lists.add(list);
		}
		else{
			//you already have the list
			list = lists.get(level);
		
		}
		list.add(node);
		depthListsNotRoot(node.left, lists, level+1);
		depthListsNotRoot(node.right, lists, level+1);
	}
	
	//starting the creation of linkedlist
	public static ArrayList<LinkedList> depthLists(TreeNode node){
		ArrayList<LinkedList> depth  = new ArrayList<>();
		depthListsNotRoot(node, depth, 0);
		return depth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode a = new TreeNode(10);
		
		a.left = new TreeNode(9);
		a.right = new TreeNode(11);
		a.left.left = new TreeNode(8);
		a.left.right	= new TreeNode(7);
		a.right.left = new TreeNode(5);
		a.right.right = new TreeNode(12);
		Stack<TreeNode> tree = new Stack<>();
		ArrayList list = depthLists(a);
		
		for(int i=0; i<list.size();i++){
			LinkedList<TreeNode> l = (LinkedList<TreeNode>) list.get(i);
			for(int j=0;j<l.size();j++){
				System.out.print(l.get(j).data+" ");
				
			}
			System.out.println();
		}
		

	}

}
