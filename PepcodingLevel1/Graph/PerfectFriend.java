//https://www.youtube.com/watch?v=_q4hA01ZcVQ&list=PL-Jc9J83PIiHfqDcLZMcO9SsUDY4S3a-v&index=8

package PepcodingLevel1.Graph;
import java.util.*;
import java.io.*;

class PerfectFriend{
    public static class Edge{
        int v ;
        int n;

        public Edge(int v , int n){
            this.v = v;
            this.n = n;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        ArrayList<Edge> []graph = new ArrayList[n];

        for (int v = 0 ; v< n ; v++){
            graph[v] = new ArrayList<>();
        }

        for (int e = 0 ; e < k ; e++){
            String parts = br.readLine();
            int v1 = Integer.parseInt(parts.split(" ")[0]);
            int v2 = Integer.parseInt(parts.split(" ")[1]);
            graph[v1].add(new Edge (v1 , v2));
            graph[v2].add(new Edge (v2 , v1));
        }
        boolean []visited = new boolean[n];
        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
        for (int v = 0; v<n ; v++){
            if(visited[v] == false){
                ArrayList<Integer> comp = new ArrayList<>();
                drawTreeAndCreateComp (graph , v , comp , visited);
                comps.add(comp);
            }
        }

        int pairs = 0;
        for (int i = 0 ; i < comps.size(); i++){
            for(int j = i+1 ; j < comps.size() ; j++){
                int count = comps.get(i).size() * comps.get(j).size();
                pairs += count;
            }
        }
        System.out.println(pairs);
    }

    public static void drawTreeAndCreateComp (ArrayList<Edge> [] graph , int v , ArrayList<Integer> comp , boolean []visited){
        visited[v] = true;
        comp.add(v);
        for (Edge e : graph[v]){
            if (visited[e.n] == false){
                drawTreeAndCreateComp (graph , e.n , comp , visited);
            }
        }
    }
}