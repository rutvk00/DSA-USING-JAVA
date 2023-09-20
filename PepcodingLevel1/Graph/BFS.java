// https://www.youtube.com/watch?v=GHnC5qHexsk&list=PL-Jc9J83PIiHfqDcLZMcO9SsUDY4S3a-v&index=11

package PepcodingLevel1.Graph;
import java.util.*;
import java.io.*;

class BFS{
    static class Edge {
        int src;
        int nbr;

        Edge(int src, int nbr) {
            this.src = src;
            this.nbr = nbr;
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
            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));
        }

        int src = Integer.parseInt(br.readLine());

        // write your code here

        ArrayDeque<Pair> queue = new ArrayDeque<Pair>();
        queue.add (new Pair(src , src+" "));
        boolean []visited = new boolean[vtces];

        while(queue.size()>0){
            Pair rem = queue.removeFirst();
            if (visited[rem.v] == true){
                continue;
            }
            visited[rem.v] = true;
            System.out.println(src +" @ "+ rem.psf);

            for(Edge e : graph[rem.v]){
                if (visited[e.nbr] == false){
                    queue.add(new Pair (e.nbr , rem.psf + e.nbr + " "));
                }
            }

        }

    }
}