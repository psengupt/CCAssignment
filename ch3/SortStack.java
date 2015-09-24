import java.util.Stack;


public class SortStack<Integer> {
	static StackClass buffer  = new StackClass();
	
	/* function for sorting the elements of a stack
	 * 
	 */
	public static StackClass sort(StackClass input){
		//creating a buffer stack
		StackClass buffer = new StackClass();
		while(!input.isEmpty()){
			Node data = input.pop();
			while((!buffer.isEmpty())&& (buffer.peek().data> data.data)){
				input.push(buffer.pop());
			}
			buffer.push(data);
		}
		return buffer;
	}
	
	public static void main(String[] args){
		StackClass stack = new StackClass();
		Node n = new Node();
		n.data=5;
		stack.push(n);
		n = new Node();
		n.data=14;
		stack.push(n);
		n = new Node();
		n.data=2;
		stack.push(n);
		stack=sort(stack);
		System.out.println(stack.pop().data);
		System.out.println(stack.pop().data);
		System.out.println(stack.pop().data);
	}

}
