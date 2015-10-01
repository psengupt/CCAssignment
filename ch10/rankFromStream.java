
public class rankFromStream {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RankNode head = new RankNode(4);
		head.insert(0);
		head.insert(8);
		System.out.println(head.getRank(8));

	}
	
	
}

class RankNode{
	int data;
	RankNode left,right;
	int leftCount;
	public RankNode(int d){
		data = d;
	}
	public void insert(int d){
		if(d<=data){
			if(left==null){
				RankNode node = new RankNode(d);
				left = node;
				
			}
			else{
				left.insert(d);
			}
			leftCount++;
		}
		else{
			if(right==null){
				RankNode node = new RankNode(d);
				right = node;
				
			}
			else{
				right.insert(d);
				
			}
			
		}
	}
	public int getRank(int d){
		if(data==d)
			return leftCount;
		else if(data>=d){
			if (left==null) 
				return -1;
			else 
				return left.getRank(d);
		}
		else{
			if(right==null)	
				return -1;
			else
				return leftCount+1+right.getRank(d);
			
		}
		
	}
}
