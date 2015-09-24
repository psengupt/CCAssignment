import java.util.LinkedList;


public class GraphNode {
	
	String state;
	int data ;
	LinkedList<GraphNode> adjacent = new LinkedList<>();
	
	public LinkedList<GraphNode> getAdjacent(){
		return adjacent;
	}

}
