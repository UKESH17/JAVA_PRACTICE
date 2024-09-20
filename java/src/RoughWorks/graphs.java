1package RoughWorks;


	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.LinkedList;
	import java.util.Queue;
	import java.util.Set;

	public class graphs {
	    private ArrayList<ArrayList<Integer>> adjList; // Adjacency list using ArrayList

	    // Constructor to initialize the adjacency list
	    public graphs(int numberOfVertices) {
	        adjList = new ArrayList<>(numberOfVertices);
	        for (int i = 0; i < numberOfVertices; i++) {
	            adjList.add(new ArrayList<>()); // Initialize an empty list for each vertex
	        }
	    }

	    // Method to add an edge between two vertices
	    public void addEdge(int u, int v) {
	        adjList.get(u).add(v); // Add v to u's list of neighbors
	        adjList.get(v).add(u); // Add u to v's list of neighbors (for an undirected graph)
	    }

	    // BFS implementation
	    public void BFS(int start) {
	        Set<Integer> visited = new HashSet(); // Array to track visited nodes
	        Queue<Integer> queue = new LinkedList<>();

	        visited.add(start); // Mark the start node as visited
	        queue.add(start); // Enqueue the start node

	        while (!queue.isEmpty()) {
	            int node = queue.poll(); // Dequeue the current node
	            System.out.print(node + " ");

	            // Get all adjacent vertices of the dequeued node
	            for (int i=0;i<adjList.get(node).size();i++) {
	                if (!visited.contains(adjList.get(node).get(i))) {
	                    visited.add(adjList.get(node).get(i)); // Mark the adjacent node as visited
	                    queue.add(adjList.get(node).get(i)); // Enqueue the adjacent node
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        graphs graph = new graphs(5);
	        graph.addEdge(0, 1);
	        graph.addEdge(0, 2);
	        graph.addEdge(1, 3);
	        graph.addEdge(2, 3);
	        graph.addEdge(3, 4);

	        System.out.println("BFS starting from node 0:");
	        graph.BFS(3);
	    }
	}


