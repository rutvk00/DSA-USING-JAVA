// https://www.youtube.com/watch?v=8UBwFE8H4Mc&list=PL-Jc9J83PIiHfqDcLZMcO9SsUDY4S3a-v&index=5

package PepcodingLevel1.Graph;
import java.util.*;
import java.io.*;

class ConnectedComp{
    public static class Edge{
        int src;
        int nbr;
        int wt;

        public Edge(int src , int nbr , int wt){
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }
    public static void main(String[] args)  throws Exception{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int vtces = Integer.parseInt(br.readLine());
        ArrayList<Edge> []graph = new ArrayList[vtces];
        for (int i = 0 ; i<vtces ; i++){
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0 ; i <edges ; i++){
            String []parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge (v1 , v2 , wt));
            graph[v2].add(new Edge(v2 , v1 , wt));
        }

        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
        boolean visited[] = new boolean[vtces];
        for (int v = 0 ; v <vtces ; v++){
            if (visited[v] == false){
                ArrayList<Integer> comp = new ArrayList<>();
                drawTreeAndGeneratedComp (graph , v , comp , visited);
                comps.add(comp);
            }
        }
        System.out.println(comps);
        if (comps.size()>0){
            System.out.println("Graph is not connected");
        }else{
            System.out.println("Graph is connected");
        }
    }

    public static void drawTreeAndGeneratedComp (ArrayList<Edge> []graph , int v , ArrayList<Integer> comp , boolean[] visited){
        visited[v] = true;
        comp.add(v);
        for (Edge e : graph[v]){
            if (visited[e.nbr] == false){
                drawTreeAndGeneratedComp(graph , e.nbr , comp , visited);
            }
        }
    }
}