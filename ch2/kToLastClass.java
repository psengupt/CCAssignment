
public class kToLastClass {
	/* 
	 * function to return the kth element from the last
	 * time complexity:O(n)
	 */
	public static Node kToLast(Node head, int k){
		//Node for tracking the kth to last Node
		Node curr=head;
		//Node for reaching the last node
		Node last = head;
		int count=0;
		//advance the last node by k nodes from the head
		while(last!=null&&count<k){
			last = last.next;
			count++;
		}
		//if number of nodes less than k return null
		if(count!=k){
			
			return null;
		}
		//after the kth node is reached by the last node propagate the current node along
		//with the last node till last node reaches end of list
		while(last.next!=null){
			last = last.next;
			curr = curr.next;
		}
		return curr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(4);
		head.next = new Node(5);
		head.next.next = new Node(4);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(11);
		head.next.next.next.next.next = new Node(4);
		head.next.next.next.next.next.next = new Node(7);
		Node ans = kToLast(head,5);
		if(ans == null){
			System.out.println("End of the list reached");
		}
		else{
			//show the data of the kth to last node
			System.out.println(ans.getData());
		}
	}

}
