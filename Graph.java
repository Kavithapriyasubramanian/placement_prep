/*import java.util.*;
//import java.util.List;
public class Graph{

    static class Edge{
        int src;
        int dest;

        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    

    public static void createGraph(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));


    }

    @SuppressWarnings("unchecked")
    


    public static void main(String args[]){
        
        int V=4;

        ArrayList<Edge>graph[]=new ArrayList[V];
        createGraph(graph);
        //print 2's dest

        for(int i=0;i<graph[2].size();i++){
            Edge e=graph[2].get(i);
            System.out.print(e.dest+" ");
        }

        

    }
}*/










import java.util.ArrayList;
import java.util.Scanner;

public class Graph {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[], int edges) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        // Take user input for edges
        for (int i = 0; i < edges; i++) {
            System.out.print("Enter source vertex for edge " + (i + 1) + ": ");
            int source = scanner.nextInt();
            System.out.print("Enter destination vertex for edge " + (i + 1) + ": ");
            int destination = scanner.nextInt();

            graph[source].add(new Edge(source, destination));
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }


    @SuppressWarnings("unchecked")

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices (V): ");
        int V = scanner.nextInt();

        ArrayList<Edge> graph[] = new ArrayList[V];
        
        System.out.print("Enter the number of edges: ");
        int edges = scanner.nextInt();
        createGraph(graph, edges);

        // Print the destination vertices for vertex 2
        System.out.print("Destination vertices for vertex 2: ");
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.print(e.dest + " ");
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
