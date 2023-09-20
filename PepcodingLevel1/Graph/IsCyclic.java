//https://www.youtube.com/watch?v=qbQq-k75bcY&list=PL-Jc9J83PIiHfqDcLZMcO9SsUDY4S3a-v&index=12
package PepcodingLevel1.Graph;
import java.io.*;
import java.util.*;

public class IsCyclic {
    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    static class Pair{
        int v;
        String psf;

        public Pair(int v , String psf){
            this.v = v;
            this.psf = psf;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        // write your code here
        boolean []visited = new boolean[vtces];
        for(int v = 0 ; v < vtces ; v++){
            if (visited[v] == false){
                boolean cyclic = isCyclic (graph , v , visited);
                if (cyclic){
                    System.out.println(true);
                    return;
                }
            }
        }
        System.out.println(false);
    }

    public static boolean isCyclic (ArrayList<Edge> []graph , int src , boolean []visited){
        ArrayDeque<Pair> q = new ArrayDeque<>();
        q.add (new Pair (src , src +" "));

        while(q.size() > 0){
            Pair rem = q.removeFirst ();
            if (visited[rem.v] == true){
                return true;
            }
            visited[rem.v] = true;

            for(Edge e : graph[rem.v]){
                if (visited[e.nbr] == false){
                    q.add(new Pair (e.nbr , rem.psf + e.nbr + " "));
                }
            }
        }

        return false;
    }
}