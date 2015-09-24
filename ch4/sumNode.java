
public class sumNode {
	
	public static int countPathsWithSum(TreeNode root, int target){
		if(root==null) return 0;
		
		int pathsRoot = countPathsFromRoot(root,target,0);
		
		int left = countPathsWithSum(root.left, target);
		int right = countPathsWithSum(root.right, target);
		
		return pathsRoot+left+right;
	}
	
	public static int countPathsFromRoot(TreeNode root, int target, int currentSum){
		if(root==null)return 0;
		currentSum+=root.data;
		int total_paths = 0;
		if(currentSum==target)
			total_paths++;
		
		total_paths+=countPathsFromRoot(root.left, target, currentSum);
		total_paths+=countPathsFromRoot(root.right, target, currentSum);
		return total_paths;
		
	}

}
