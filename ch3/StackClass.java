import java.util.EmptyStackException;


public class StackClass {
	Node n;
	
	private Node top = null;
	//push operation for pushing the value at top
	public void push(Node node){
		
		
		node.next = top;
		top = node;
	}
	// pop operation for popping out the value from the top
	
	public Node pop(){
		if(top==null){
			return null;
		}
		Node new_Node = top;
		top = top.next;
		return new_Node;
	}
	
	//peek operation for getting the top value
	public Node peek(){
		if(top==null){
			return null;
		}
		Node new_Node = top;
		return new_Node;
	}
	
	//isEmpty returns a boolean value for getting whether the list is empty
	public boolean isEmpty(){
		if(top==null){
			return true;
		}
		return false;
	}
	
	

}
