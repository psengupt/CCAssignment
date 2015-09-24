
public class checkBSTClass {
	/*
	 * A function to check that a given tree is a binary search tree
	 */
	//Integer printed_last = null;
	public static boolean checkBST(TreeNode head){
		int printed_last = Integer.MIN_VALUE;
		if(head==null)
			return true;//if the tree has no root then it is a BST
		else{
			if(!checkBST(head.left))//check the left node
				return false;
			//then check the head
			if(head.data<=printed_last){
				return false;
			}
			printed_last = new Integer(head.data);
			//then check the right node
			if(!checkBST(head.right))return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a = new TreeNode(10);
		a.left = new TreeNode(7);
		a.right = new TreeNode(12);
		a.left.left = new TreeNode(5);
		a.left.right	= new TreeNode(8);
		a.right.left = new TreeNode(11);
		a.right.right = new TreeNode(13);
		
		System.out.println(checkBST(a));

	}

}
