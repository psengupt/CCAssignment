import java.util.EmptyStackException;

//single ARRAY to implement three stacks
public class SingleArrayStack {
	//array for maintaining the top of each stack
	int[] top = new int[3];
	
	private int stackSize ;
	int[] arrayStack;
	//creating the stackArray
	public SingleArrayStack(int stackSize){
		arrayStack = new int[3*stackSize];
		this.stackSize = stackSize;
		top[0] = -1;
		top[1] = -1;
		top[2] = -1;
	}
	//the operations of a stack are: pop, peek, push, isEmpty
	//push into the stacknum mentioned
	public void push(int stackNum, int data){
		if(top[stackNum-1]==stackSize-1){
			throw new StackOverflowError();
		}
		else{
			top[stackNum-1]++;
			int x = ((stackNum-1)*stackSize)+top[stackNum-1];
			arrayStack[((stackNum-1)*stackSize)+top[stackNum-1]] = data;
			
		}
	}
	
	//popping the value from a stack
	public int pop(int stackNum){
		int data=0;
		if(isEmpty(stackNum)){
			throw new EmptyStackException();
		}
		else{
			data = arrayStack[((stackNum-1)*stackSize)+top[stackNum-1]];
			arrayStack[((stackNum-1)*stackSize)+top[stackNum-1]] = 0;
			top[stackNum-1]--;
			
		}
		return data;
	}
	//checking whether the stack is empty
	public boolean isEmpty(int stackNum){
		if(top[stackNum-1]==-1){
			return true;
		
		}
		return false;
	}
	
	
	public static void main(String[] args){
		SingleArrayStack stack  = new SingleArrayStack(2);
		stack.push(2, 8);
		stack.push(3, 10);
		int data = stack.pop(2);
		System.out.println(data);
		stack.pop(0);
		
		
	}

}
