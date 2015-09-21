
public class loopDetectionClass {
	/*
	 * A function for detecting the Node where a loop begins in a list
	 * Time complexity O(n)
	 */
	public static  Node loopDetection(Node h1){
		//Node that travel fast 
		Node fast = h1;
		//node that travel slow
		Node slow = h1;
		
		fast = fast.next.next;
		
		slow = slow.next;
		
		while(fast.next!=null && slow!=null){
			fast = fast.next.next;
			slow = slow.next;
			if(fast.next==null || slow==null){
				return null;
			}
			else{
				//stop when the fast node and slow node coincide for the fist time
				//this place is K distance from the start of the loop
				if(fast==slow){
					break;
				}
			}
		}
		fast=h1;
		while(fast!=slow){
			fast=fast.next;
			slow=slow.next;
		}
		//when they collide for the second time then the start of the loop is reached
		return fast;
	}
	public static void main(String[] args){
		Node head = new Node(4);
		head.next = new Node(5);
		head.next.next = new Node(9);
		head.next.next.next = new Node(10);
		head.next.next.next.next = new Node(101);
		head.next.next.next.next.next = new Node(19);
		head.next.next.next.next.next.next = new Node(15);
		
		Node loop = loopDetection(head);
		if(loop==null)
			System.out.println("There is no loop");
		else
			System.out.println("The loop begins at"+loop.getData());
	}
}
