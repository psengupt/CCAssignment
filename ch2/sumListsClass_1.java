
public class sumListsClass_1 {
	/*
	 * a function to add lists when the tail of the list represents the units place
	 * complexity O(n)
	 */
	public static sumNode sumLists(Node head1, Node head2){
		//returning value when both heads are null
		if(head1==null&&head2==null)
			return null;
		//recursive function for calculating the addition
		 int sum = 0;
		 int carry = 0;
		sumNode head = sumLists( head1.next, head2.next);
		if(head==null){
		    sum = head1.getData()+head2.getData();
			carry = sum/10;
			sum = sum%10;
		}
		else{
			sum = head.carry+head1.getData()+head2.getData();
			carry = sum/10;
			sum = sum%10;
		}
		;
		sumNode curr = new sumNode();
		curr.carry = carry;
		curr.sum = sum;
		curr.next = head;
		return curr;
		
	}
	/*private static sumNode add( int a, int b){
	
		int sum = carryIn+a+b;
		sumNode res = new sumNode();
		res.sum = sum%10;
		res.carry = sum/10;
		return res;
	}*/
	public static void main(String[] args){
		Node head1 = new Node(4);
		head1.next = new Node(5);
		head1.next.next = new Node(9);
		Node head2= new Node(1);
		head2.next = new Node(4);
		head2.next.next= new Node(3);
		head2.next.next.next = new Node(5);
		//taking the count of digits in the two linked list
		int count1=0;
		int count2=0;
		Node curr1 = head1;
		Node curr2 = head2;
		while(curr1!=null){
			count1++;
			curr1 = curr1.next;
			
		}
		while(curr2!=null){
			count2++;
			curr2 = curr2.next;
		}
		curr1 = count1>=count2?head1:head2;
		curr2 = count1>=count2?head2:head1;
		head1 = curr1;
		head2 = curr2;
		int diff = count1>count2?(count1-count2):(count2-count1);
		//inserting 0s in the shorter list
		for(int i=0; i<diff; i++){
			Node curr = new Node(0);
			curr.next = head2;
			head2= curr;
		}
		//head.next.next.next.next.next.next = new Node(7);
		sumNode head = sumLists(head1, head2);
		sumNode curr = head;
		while(curr!=null){
			System.out.println(curr.sum);
			curr = curr.next;
		}
		
	}

}
