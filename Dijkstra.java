import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Dijkstra{
    static class Edge{
        int src;
        int des;
        int wt;
        Edge(int src,int des,int wt){
            this.src=src;
            this.des=des;
            this.wt=wt;
        }
    }
    public static void main(String args[]) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int vertices=Integer.parseInt(br.readLine());
        ArrayList<Edge>[]graph=new ArrayList<>();
        int edges=Integer.parseInt(br.readLine());

    }
}