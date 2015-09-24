import java.util.Stack;


public class QueueViaStacks<T> {
	Stack<T> newest = new Stack<T>();
	Stack<T> oldest = new Stack<T>();
	/*
	 * Function for implementing queue through stack
	 */
	// the operations are:add,remove, peek, size
	//the add operation
	public void add(T val){
		newest.push(val);
	}
	//removing elements from the queue
	public T remove(){
		
		shiftStacks();
		return oldest.pop();
	}
	
	//function for shifting elements from one stack to another
	//this happens only when a pop operation is requested and oldest stack is empty
	public void shiftStacks(){
		if(oldest.isEmpty()){
			while(!newest.isEmpty()){
				oldest.push(newest.pop());
			}
		}
		
	}
	
	//function for checking the value of the first element
	public T peek(){
		shiftStacks();
		return(oldest.peek());
	}
	
	
	//function for getting the size of the queue
	public int size(){
		return(oldest.size()+newest.size());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node();
		head.data = 9;
		QueueViaStacks<Integer> node = new QueueViaStacks<>();
		Integer f1 = new Integer(9);
		node.add(f1);
		f1 = new Integer(15);
		node.add(f1);
		System.out.println("The size of the queue is "+node.size());
		System.out.println("The element popped" + node.remove().toString());
		System.out.println("The element popped" + node.remove().toString());
		System.out.println("The element popped" + node.remove().toString());
	}

}
