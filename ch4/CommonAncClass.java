
public class CommonAncClass {

	/*
	 * A function for getting the common ancestor of two given treenodes 
	 */
	public static TreeNode commonAnc(TreeNode head, TreeNode p, TreeNode q){
		ResultNode r = commonAncHelper(head,p,q);
		if(r.isAns)
			return r.result;
		return null;
	}
	
	public static ResultNode commonAncHelper(TreeNode root, TreeNode p, TreeNode q){
		if(root==null)
			return new ResultNode(null, false);
		if((root==p)&&(root==q)){
			return new ResultNode(root, true);}
			ResultNode r = commonAncHelper(root.left , p, q);
			if(r.isAns){
				return r;
			}
			ResultNode ry = commonAncHelper(root.right, p, q);
			if(ry.isAns){
				return ry;
			}
			if((r.result!=null)&&(ry.result!=null)){
				return new ResultNode(root, true);
			}
			/*
			 * if we are currently at p or q and we have found the other node in a subtree of
			 * the node
			 */
			else if(root==p||root==q){
				boolean isAns = (r.result!=null)||(ry.result!=null);
				return new ResultNode(root, isAns);
			}
			else{
				return new ResultNode(r.result!=null?r.result:ry.result,false);
			}
	
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
		TreeNode b = new TreeNode(14);
		a.left.right.right = b;
		TreeNode node = commonAnc(a, a.right,b);
		if(node==null)
			System.out.println("There is no ancestor");
		else
			System.out.println(node.data);

	}

}
