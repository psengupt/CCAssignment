
public class TreeNode {
	int data;
	TreeNode parent;
	TreeNode left;
	TreeNode right;
	public TreeNode(int num){
		data = num;
		left = null;
		right = null;
	}
	public TreeNode(){
		
	}
	public TreeNode(int num, TreeNode parent){
		data = num;
		this.parent = parent;
	}
}
