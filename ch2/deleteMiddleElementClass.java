
public class deleteMiddleElementClass {
	/*
	 * A function for deleting the middle node of a linkedlist
	 * Time complexity: O(n)
	 */
	public static void deleteMiddleElement(Node head){
		//slower node that advances at the pace of one node
		Node slow=head;
		//Faster Node that advances at the pace of two nodes
		Node fast = head;
		//Node prev that keeps track of the node before the slow node
		Node prev=head;
		while(fast.next!=null){
			prev=slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		prev.next = slow.next;
	}
	public static void main(String[] args){
		Node head = new Node(4);
		head.next = new Node(5);
		head.next.next = new Node(9);
		head.next.next.next = new Node(10);
		head.next.next.next.next = new Node(11);
		head.next.next.next.next.next = new Node(3);
		head.next.next.next.next.next.next = new Node(7);
		deleteMiddleElement(head);
		Node curr = head;
		while(curr!=null){
			System.out.println(curr.getData());
			curr = curr.next;
		}
	}

}
