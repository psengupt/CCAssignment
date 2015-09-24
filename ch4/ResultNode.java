/*
 * A class that stores the result that whether a particular node is an ancestor or not
 */
public class ResultNode {
	public TreeNode result;
	public boolean isAns;
	public ResultNode(TreeNode node, boolean result){
		this.result = node;
		isAns = result;
	}
	

}
