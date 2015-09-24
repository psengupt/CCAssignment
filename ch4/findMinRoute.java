
import java.util.LinkedList;



public class findMinRoute {
	/*
	 * Function to get the minimum route between two node
	 */
	public static boolean findMRoute(Graph graph, GraphNode start, GraphNode end){
		//set the state of all nodes as Unvisited
		for(GraphNode v: graph.getNodes()){
			v.state = "Unvisited";
		}
		start.state="Visiting";
		// a queue for storing the unvisited nodes
		LinkedList<GraphNode> q = new LinkedList<>();
		
		q.add(start);//adding the starting node of the graph to the queue
		
		while(!q.isEmpty()){
			GraphNode  u =q.remove();
			if(u!=null){
				for(GraphNode v: u.getAdjacent()){
					if(v.state.equals("Unvisited")){
						if(v==end){
							return true;
						}
						else{
							v.state = "Visiting";
							q.add(v);
						}
						
					}
				}
				u.state="Visited";
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph();
		GraphNode v = new GraphNode();
		v.data = 4;
		v.adjacent = null;
		g.graph.add(v);
		LinkedList link = new LinkedList();
		link.add(v);
		LinkedList<GraphNode> adj = new LinkedList<>();
		GraphNode u = new GraphNode();
		u.data = 5;
		u.adjacent = link;
		adj.add(u);
		g.graph.add(u);

		
		GraphNode a= new GraphNode();
		a.data = 8;
		a.adjacent = link;
		adj.add(a);
		g.graph.add(a);
		
		GraphNode b = new GraphNode();
		b.data = 10;
		
		LinkedList adj1 = new LinkedList<>();
		GraphNode sec = new GraphNode();
		sec.data = 14;
		sec.adjacent=null;
		adj1.add(sec);
		g.graph.add(sec);
		
		GraphNode sec1 = new GraphNode();
		sec1.data = 18;
		sec1.adjacent=null;
		adj1.add(sec1);
		adj1.add(v);
		g.graph.add(sec1);
		b.adjacent = adj1;
		adj.add(b);
		g.graph.add(b);
		v.adjacent = adj;
		System.out.println("The answer is"+findMRoute(g, v, sec1));
		
		

	}

}
