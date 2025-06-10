package chitra;
		import java.util.*;
		public class ZooGraph {
		    public static void main(String[] args) {
		        Graph zoo = new Graph();
		        zoo.addEdge("Entrance", "Reptile House");
		        zoo.addEdge("Entrance", "Bird Sanctuary");
		        zoo.addEdge("Entrance", "Mammal Zone");
		        zoo.addEdge("Reptile House", "Snake Pit");
		        zoo.addEdge("Bird Sanctuary", "Parrot Pavilion");
		        zoo.addEdge("Mammal Zone", "Lion Den");
		        zoo.addEdge("Mammal Zone", "Elephant Enclosure");
		        zoo.printGraph();
		    }
		}
		class Graph {
		    private final Map<String, List<String>> adj;
		    public Graph() {
		        adj = new HashMap<>();
		    }
		    public void addEdge(String u, String v) {
		        adj.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
		        adj.computeIfAbsent(v, k -> new ArrayList<>());
		    }
		    public void printGraph() {
		        System.out.println("Zoo graph structure:");
		        for (Map.Entry<String, List<String>> entry : adj.entrySet()) {
		            String from = entry.getKey();
		            List<String> toList = entry.getValue();
		            System.out.printf("  %s connects to: %s%n", from,
		                    toList.isEmpty() ? "(no further zones)" : String.join(", ", toList));
		        }
		    }
	}

