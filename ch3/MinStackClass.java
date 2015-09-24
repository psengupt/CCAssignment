import java.util.EmptyStackException;

import javax.swing.text.html.MinimalHTMLWriter;


public class MinStackClass {
	int stackSize;
	int top;
	int[] stackArray = null;
	int min_top;
	//an array for maintaining the minimum elements
	int[] min;
	public MinStackClass(int stackSize){
		this.stackSize = stackSize;
		top = -1;
		stackArray = new int[stackSize];
		min_top=-1;
		min = new int[stackSize];//initialize min array to maximum possible size;
	}
	// functions of a stack: push, pop, peek, isEmpty, isFull
	
	//push function for pushing the element at top of the stack
	public void push(int num){
		if(isFull()){
			throw new StackOverflowError();
		}
		else{
			min[min_top+1]=(min_top==-1)?num:0;
			min_top= (min_top==-1)?min_top+1:min_top;
			if(min[min_top]>num){
				min_top++;
				min[min_top]=num;
			}
			top++;
			stackArray[top] = num;
		}
	}
	
	//pop function for taking out the value from the top of the stack
	public int pop(){
		int data = 0;
		if(isEmpty()){
			throw new EmptyStackException();
		}
		else{
			data = stackArray[top];
			if(data==min[min_top]){
				min[min_top]=0;
				min_top--;
			}
			stackArray[top]=0;
			top--;
		}
		return data;
	}
	//peek function for viewing the top value of the stack
	public int peek(){
		int data = 0;
		if(isEmpty()){
			throw new EmptyStackException();
		}
		else{
			data = stackArray[top];
			
		}
		return data;
	
	}
	//Minimum: function for getting the minimum value element
	public int minimum(){
		int data = min[min_top];
		return data;
	}
	
	//isEmpty function for checking whether the stack is empty
	public boolean isEmpty(){
		if(top==-1){
			return true;
		}
		else
			return false;
	
	}
	
	//isFull function for checking whether the stack is at its max capacity
	public boolean isFull(){
		if(top==stackSize-1){
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStackClass stack  = new MinStackClass(7);
		stack.push(8);
		System.out.println(stack.minimum());
		stack.push(10);
		System.out.println(stack.minimum());
		stack.push(6);
		System.out.println(stack.minimum());
		stack.push(4);
		System.out.println(stack.minimum());
		stack.push(3);
		
		System.out.println(stack.minimum());
		stack.push(13);
		System.out.println(stack.minimum());
		stack.push(14);
		System.out.println(stack.minimum());
		stack.pop();
		System.out.println(stack.minimum());
		stack.pop();
		System.out.println(stack.minimum());
		System.out.println("Peek"+stack.peek());
		System.out.println(stack.minimum()+"Min");
		stack.pop();
		System.out.println(stack.minimum());
		

	}

}
