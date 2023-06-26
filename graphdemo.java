package graphdemo;

import java.util.ArrayList;

import javax.print.attribute.Size2DSyntax;

public class graphdemo {
	
	ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
	
	graphdemo(int v) {
		for(int i=0;i<v;i++) { // for no. of vertices
			adjList.add(new ArrayList<Integer>());
		}
	}
	
	public void addEdge(int u, int w) {
		adjList.get(u).add(w);
		adjList.get(w).add(u);
	
	}
	public void printadjList() {
		for(int i=0;i<adjList.size();i++) { // i is vertex no
			System.out.println("Adj list of vertex " +i);
			for(int j=0; j<adjList.get(i).size();j++) {
				
				
			System.out.println(" " + adjList.get(i).get(j));
				
			}
			
		}
	}

	public static void main(String[] args) {
		
		/*
		 * int[][] graph = { {0,1,0,0,1}, {1,0,1,0,1}, {0,1,0,1,0} , {0,0,1,0,1},
		 * {1,1,0,1,0} };
		 */
	
		graphdemo g = new graphdemo(5); //no.of vertices is 5
		g.addEdge(0,1);
		g.addEdge(2,3);
		g.addEdge(1,2);
		g.addEdge(3,4);
		g.addEdge(0,4);
		g.addEdge(1,4);
		
		g.printadjList();
	}
	
}

