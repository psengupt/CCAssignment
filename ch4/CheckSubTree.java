
public class CheckSubTree {
	public static boolean containsTree(TreeNode t1, TreeNode t2){
		if(t2==null)
			return true;
		return subTree(t1, t2);
			
		}
	
	public static boolean subTree(TreeNode t1, TreeNode t2){
		if(t1==null)
			return false;//cause the parent tree is null
		else if((t1.data==t2.data)&&matchTree(t1,t2))
			return true;
		else
			return (matchTree(t1.left,t2)||matchTree(t1.right,t2));
	}
	
	public static boolean matchTree(TreeNode t1, TreeNode t2){
		if(t2==null&&t1==null)
			return true;
		else if(t1==null||t2==null)
			return false;
		else if(t1.data!=t2.data)
			return false;
		else
			return(matchTree(t1.left,t2.left)&&matchTree(t1.right,t2.right));
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}

}
 