
public class isIntersectionClass {
	/*
	 * a function to find the element of intersection
	 * complexity:O(n)
	 */
	public static Node isIntersection(Node h1, Node h2){
		
		//finding the count of elements that are present in the larger list but not in 
		// smaller one
		Node curr = h1;
		int c1=0;
		int c2=0;
		//finding the length of list1
		while(curr != null){
			c1++;
			curr = curr.next;
		}
		curr = h2;
		//finding the length of list2
		while(curr!=null){
			c2++;
			curr = curr.next;
		}
		int diff = (c1>c2)?(c1-c2):(c2-c1);
		Node curr1 = (c1>c2)?h1:h2;//curr1  = node of the larger list
		Node curr2 = (c1>c2)?h2:h1;//curr2 = node of the smaller list
		
		//traversing the nodes of the larger list to the point where the head of the
		//smaller list starts
		for(int i=0;i<diff;i++){
			curr1 = curr1.next;
		}
		while(curr2!=null){
			if(curr2==curr1){
				return curr2;
			}
			else{
				curr1 = curr1.next;
				curr2 = curr2.next;
			}
		}
		return curr2;
		
	}
	public static void main(String[] args){
		Node head1 = new Node(8);
		head1.next = new Node(145);
		head1.next.next = new Node(156);
		head1.next.next.next = new Node(1045);
		
		Node head = new Node(4);
		head.next = new Node(5);
		head.next.next = new Node(9);
		head.next.next.next = new Node(10);
		head.next.next.next.next = new Node(11);
		head.next.next.next.next.next = new Node(3);
		head.next.next.next.next.next.next = new Node(7);
		head1.next.next.next.next = head.next.next.next.next;;
		
		
		Node inter = isIntersection(head, head1);
		if(inter==null){
			System.out.println("The lists dont intersect");
		}
		else{
			System.out.println("Intersecting node has a value"+inter.getData());
		}
		
		
	}


}
