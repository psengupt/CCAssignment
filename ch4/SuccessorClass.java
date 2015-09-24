
public class SuccessorClass {
	public static TreeNode inOrdSuccessor(TreeNode n){
		/*
		 * function for finding the inorder successor of the given treenode
		 */
		if(n==null)//a case which might arise if the given node is the rightmost node of the tree
			return null;
		//case when the given node has right branches
		else if(n.right!=null)
			return leftMostChild(n.right);
		//case when the given node is the right most corner of a given subtree then its
		//in order successor would be its parent of the subtree where the node is present
		else{
			TreeNode x = n;//a variable to store current treenode
			TreeNode q = x.parent;//a variable to store parent node
			while(q!=null && q.left!=x){
				x=q;
				q=q.parent;
			}
			return q;
		}
	}
	//a function to traverse to the left most node of a tree or subtree
	public static TreeNode leftMostChild(TreeNode n){
		if(n==null)
			return null;
		else{
			while(n.left!=null){
				n = n.left;
			}
			return n;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a = new TreeNode(10);
		a.left = new TreeNode(9,a);
		a.right = new TreeNode(11,a);
		a.left.left = new TreeNode(8,a.left);
		a.left.right	= new TreeNode(7,a.left);
		a.right.left = new TreeNode(5,a.right);
		a.right.right = new TreeNode(12,a.right);
		TreeNode b = new TreeNode(14,a.left.right);
		a.left.right.right = b;
		System.out.println(inOrdSuccessor(b).data);

	}

}
