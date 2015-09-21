
public class partitionClass {
	public static Node partition(Node node, int num){
		/*
		 * method for partitioning such that elements lesser than the partition element 
		 * is placed before all elements greater than or equal to the partition element
		 * Time complexity is:O(n)
		 */
		Node head = node;
		//Node for the tail
		Node tail = node;
		
		while(node!=null){
			//for keeping a info for next node
			Node next = node.next;
			if(node.getData()<num){
				node.next = head;
				head=node;
			}
			else{
				tail.next = node;
				tail = node;
			}
			node = next;
		}
		tail.next = null;
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(4);
		head.next = new Node(5);
		head.next.next = new Node(9);
		head.next.next.next = new Node(10);
		head.next.next.next.next = new Node(11);
		head.next.next.next.next.next = new Node(3);
		head.next.next.next.next.next.next = new Node(7);
		head = partition(head, 7);
		Node curr = head;
		while(curr!=null){
			System.out.println(curr.getData());
			curr = curr.next;
		}
	}

}
