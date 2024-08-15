// import java.util.*;

// public class Dfs {

//     static class Edge {
//         int d;

//         Edge(int d) {
//             this.d = d;
//         }
//     }

//     public static void createGraph(ArrayList<ArrayList<Edge>> graph) {
//         Scanner sc = new Scanner(System.in);
//         int v = sc.nextInt();
//         int e = sc.nextInt();
//         for (int i = 0; i < v; i++) {
//             graph.add(new ArrayList<>());
//         }
//         for (int i = 0; i < e; i++) {
//             int s = sc.nextInt();
//             int d = sc.nextInt();
//             graph.get(s).add(new Edge(d));
//             graph.get(d).add(new Edge(s)); // For undirected graph
//         }
//     }

//     public static void dfs(ArrayList<ArrayList<Edge>> graph, int curr, boolean[] vis) {
//         System.out.print(curr + " ");
//         vis[curr] = true;
//         for (Edge e : graph.get(curr)) {
//             if (!vis[e.d]) {
//                 dfs(graph, e.d, vis);
//             }
//         }
//     }

//     public static void main(String args[]) {
//         ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
//         createGraph(graph);
//         int startNode = 0; // Starting DFS from node 0
//         boolean[] visited = new boolean[graph.size()];
//         dfs(graph, startNode, visited);
//     }

// }



import java.util.*;

public class Dfs {
    public static void dfs(int matrix[][], int curr, boolean[] vis) {
        System.out.print(curr + " ");
        vis[curr] = true;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[curr][i] == 1 && !vis[i]) {
                dfs(matrix, i, vis);
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int matrix[][] = new int[v][v];
        //createGraph(matrix);
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }

        boolean[] visited = new boolean[v];
        System.out.println("DFS Traversal:");
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                dfs(matrix, i, visited);
            }
        }
        System.out.println();
    }
}
