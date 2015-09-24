import java.util.Random;


public class Tree {
	TreeNode_11 root = null;
	public int size(){ return root==null?0:root.size();}
	
	public TreeNode_11 getRandomNode(){
		if(root==null)
			return null;
		//generating the random numbers
		Random random = new Random();
		int i = random.nextInt(size());
		//get the node corresponding to the generated random number
		return root.getithNode(i);
	}
	
	public void insertInOrder(int value){
		if(root==null)
			root = new TreeNode_11(value);
		root.inOrderInsert(value);
	}
}

class TreeNode_11{
	int data;
	public TreeNode_11 left;
	public TreeNode_11 right;
	private int size;
	public TreeNode_11() {
		// TODO Auto-generated constructor stub
	}
	
	/*constructor*/
	public TreeNode_11(int data){
		this.data=data;
		size=1;
	}
	/*function for getting size*/
	public int size(){
		return size;
	}
	/*get ith node*/
	public TreeNode_11 getithNode(int i){
		int leftsize = ((left==null)?0:left.size());
		if(i<leftsize)
			return left.getithNode(i);
		else if(i==leftsize)
			return this;
		else
			return right.getithNode(i-leftsize+1);
	}
	
	/*inserting nodes inOrder*/
	public void inOrderInsert(int d){
		if(d<=data){
			if(left==null)
				left = new TreeNode_11(d);
			else
				left.inOrderInsert(d);
		}
		else{
			if(right==null)
				right = new TreeNode_11(d);
			else
				right.inOrderInsert(d);
		}
		size++;
	}
	
	/*finding the node containing particular value*/
	public TreeNode_11 find(int d){
		if(d==data)
			return this;
		else if(d<data)
			return left==null?null:left.find(d);
		else
			return right==null?null:right.find(d);
	}
}