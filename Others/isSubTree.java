/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/*class Node  for representing the node of the trees*/
class Node{
    int age;
    Node left=null;
    Node right=null;
    public Node(int num){
        age = num;
    }
}
/* Name of the class has to be "Main" only if the class is public. */

class Codechef
{
    public static boolean isSubTree(Node head1, Node head2){
        if(head1==null&&head2==null)
            return true;//since both trees are null hence they can be considered
        else{
            if(head1==null&&head2!=null)
                return false;//since the parent is not there
            else if(head1!=null&&head2==null){
                return true;// a null tree is a part of all trees
            }
            else{
                if(head1.age==head2.age){
                    return (isSubTree(head1.left,head2.left)&&isSubTree(head1.right, head2.right));
                }
                else{
                    return(isSubTree(head1.left,head2)||isSubTree(head1.right,head2));
                }
            }
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		//creating the big tree
		int numIns = Integer.parseInt(in.nextLine());
		Node[] nList = new Node[numIns];
		for(int i = 0; i<numIns; i++){
		    nList[i] = new Node(Integer.parseInt(in.nextLine()));
		    
		}
		for(int i=0; i<numIns-1; i++){
		    String inp = in.nextLine();
		    String[] inArr = inp.split(" ");
		    if(inArr[2].equals("M")){
		        nList[Integer.parseInt(inArr[0])-1].left = nList[Integer.parseInt(inArr[1])-1];
		    }
		    else if(inArr[2].equals("E")){
		        nList[Integer.parseInt(inArr[0])-1].right = nList[Integer.parseInt(inArr[1])-1];
		    }
		    else{
		        //System.out.println("Error!");
		    }
		}
		//creating the subtrees
		int numTrees = Integer.parseInt(in.nextLine());
		for(int j=0; j<numTrees; j++){
		    int numSubIns = Integer.parseInt(in.nextLine());
    		Node[] nSubList = new Node[numSubIns];
    		for(int i = 0; i<numSubIns; i++){
    		    nSubList[i] = new Node(Integer.parseInt(in.nextLine()));
    		    
    		}
    		for(int i=0; i<numSubIns-1; i++){
    		    String inp = in.nextLine();
    		    String[] inArr = inp.split(" ");
    		    if(inArr[2].equals("M")){
    		        nSubList[Integer.parseInt(inArr[0])-1].left = nSubList[Integer.parseInt(inArr[1])-1];
    		    }
    		    else if(inArr[2].equals("E")){
    		        nSubList[Integer.parseInt(inArr[0])-1].right = nSubList[Integer.parseInt(inArr[1])-1];
    		    }
    		    else{
    		        //System.out.println("Error!");
    		    }
    		}
    		if(isSubTree(nList[0],nSubList[0])){
    		    System.out.println("NO");
		    }
		    else{
		        System.out.println("YES");
		    }
		}
	}
}
