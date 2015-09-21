
public class removeDuplicateClass {
	/*
	 * function that removes duplicate elements from the linkedlist
	 * Time complexity: O(n2)
	 */
	public static void removeDuplicates(Node head){
		//current Node that migrates once through the list
		Node current = head;
		//runner Node iterating through the list
		Node runner = head.next;
		//prev node for holding the node before the duplicate one. used for delete purpose
		Node prev=current;
		while(current!=null){
			//runner and prev deletes all values that are equal to the current
			while(runner!=null){
				if(current.getData()==runner.getData()){
					runner = runner.next;
					prev.next = runner;
				}
				else{
					prev.next=runner;
					prev = runner;
					runner = runner.next;
				}
			}
			current = current.next;
			if(current!=null){
			runner = current.next;
			prev=current;}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(4);
		head.next = new Node(5);
		head.next.next = new Node(4);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(7);
		head.next.next.next.next.next = new Node(4);
		head.next.next.next.next.next.next = new Node(7);
		removeDuplicates(head);
		Node curr = head;
		while(curr!=null){
			System.out.println(curr.getData());
			curr = curr.next;
		}

	}

}
