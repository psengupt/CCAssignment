
public class isPalindromeClass {
	/*
	 * a function to check whether a given list is a palindrome
	 * Time complexity: O(n)
	 */
	public static boolean isPalindrome(Node head){
		Node curr = head;
		int count_nodes = 0;
		boolean isEven = false;
		//counting the number of nodes
		while(curr!=null){
			count_nodes++;
			curr=curr.next;
		}
		//if even number of nodes is even set the flag isEven to true
		if(count_nodes%2==0){
			isEven = true;
		}
		//consider till mid of the number of nodes
		int mod = count_nodes/2;
		//Node curr = head;
		count_nodes = 0;
		int arr[] = new int[mod];
		curr = head;
		int i=0;
		while(curr!=null){
			//count_nodes++;
			//considering for the list with even number of nodes
			if(isEven){
				if(count_nodes<mod){
					//entering the first half of the list in an array
					arr[count_nodes] = curr.getData();
				}
				else{
					//checking the elements in the array with the ending
					//half of list value
					if(curr.getData()!=arr[count_nodes-((2*i)+1)]){
						return false;
					}
					i++;
				}
				//curr=curr.next;
				
			}
			//list with odd number of nodes
			else{
				if(count_nodes<mod){
					arr[count_nodes] = curr.getData();
				}
				else if(mod==count_nodes){
					//skip the middle element as for odd lists it is non repetitive
				}
				else{
					
					if(curr.getData()!=arr[count_nodes-((2*i)+2)]){
						return false;
					}
					i++;
				}
			}
			curr=curr.next;
			count_nodes++;
			
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(4);
		head.next = new Node(5);
		head.next.next = new Node(9);
		head.next.next.next = new Node(10);
		head.next.next.next.next = new Node(10);
		head.next.next.next.next.next = new Node(9);
		head.next.next.next.next.next.next = new Node(1);
		head.next.next.next.next.next.next.next=new Node(4);
		System.out.println(isPalindrome(head));
		
		

	}

}
