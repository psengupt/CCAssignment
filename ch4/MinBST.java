import java.util.Stack;


public class MinBST {
	/*
	 * A function to create a minimum Binary search tree using a array
	 */
	public static TreeNode createMinBST(int[] array, int start, int end){
		if(end<start){
			return null;
		}
		//since the mid element should be the root
		TreeNode root = new TreeNode();
		int mid = (start+end)/2;
		root.data = array[mid];
		//fixing the left child and right child
		root.left = createMinBST(array, start, mid-1);
		root.right = createMinBST(array, mid+1, end);
		return root;
	}
	
	public static void main(String[] args){
		//array
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		TreeNode root = createMinBST(arr, 0, 8);
		TreeNode node = root;
		Stack<TreeNode> tree = new Stack<>();
		while(!tree.isEmpty()||node!=null){
			if(node!=null){
				tree.push(node);
				node = node.left;
				
			}
			else{
				node = tree.pop();
				System.out.println(node.data);
				node = node.right;
			}
		}
	}

}
