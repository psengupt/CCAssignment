
public class sumListsClass {
	//private static int carry=0;
	/*
	 * function for adding the values: the value in the first node is the units place and so on..
	 * Complexity O(n)
	 */
	public static sumNode sumLists(Node head1, Node head2){
		if(head1==null&&head2==null){
			return null;
		}
		else if(head1==null||head2==null){
			return null;
		}
		//node for traversing list1 and list2
		
		Node curr1 = head1;
		Node curr2 = head2;
		int carry = 0;//as we are adding unit's place first
		sumNode head = add(carry, curr1.getData(), curr2.getData());
		sumNode curr = head;//the unit's place of the result
		curr1 = curr1.next;
		curr2=curr2.next;
		//this loop should work so long as both the lists become null
		while(curr1!=null||curr2!=null){
			carry = curr.carry;
			//adding when list1 is shorter than list2
			if(curr1==null&&curr2!=null){
				curr.next = add(carry, 0, curr2.getData());
				
				curr2 = curr2.next;
			}
			//adding when list2 is shorter than list1
			else if(curr2==null&&curr1!=null){
				curr.next = add(carry, 0, curr1.getData());
				curr1 = curr1.next;
				
			}
			else {
				curr.next = add(carry, curr2.getData(), curr1.getData());
				curr1 = curr1.next;
				curr2 = curr2.next;
			}
			
			curr = curr.next;
			
		}
		if(curr.carry>=1){
			sumNode n = new sumNode();
			n.sum = curr.carry;
			curr.next = n;
			curr = curr.next;
		}
		return head;
	}
	/*
	 * function for adding the values
	 */
	private static sumNode add(int carryIn, int a, int b){
	
		int sum = carryIn+a+b;
		sumNode res = new sumNode();
		res.sum = sum%10;
		res.carry = sum/10;
		return res;
	}
	public static void main(String[] args){
		Node head1 = new Node(4);
		head1.next = new Node(5);
		head1.next.next = new Node(9);
		Node head2= new Node(1);
		head2.next = new Node(4);
		head2.next.next= new Node(3);
		head2.next.next.next = new Node(7);
		head2.next.next.next.next = new Node(5);
		sumNode head = sumLists(head1, head2);
		sumNode curr = head;
		System.out.println("Numbers are displayed from the units place onwards");
		while(curr!=null){
			System.out.println(curr.sum);
			curr = curr.next;
		}
		
	}
}
