// https://www.youtube.com/watch?v=nUgp0RG57wQ&list=PL-Jc9J83PIiHfqDcLZMcO9SsUDY4S3a-v&index=9

package PepcodingLevel1.Graph;
import java.util.*;
import java.io.*;

class HamiltonPathAndCycle{
    public static class Edge{
        int src ;
        int nbr;
        int wt;

        public Edge (int src , int nbr , int wt){
            this.src = src ;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

            int vtces = Integer.parseInt(br.readLine());
            ArrayList<Edge> []graph = new ArrayList[vtces];
            for(int i = 0 ; i<vtces ; i++){
                graph[i] = new ArrayList<>();
            }

            int edges = Integer.parseInt(br.readLine());
            for (int i = 0 ; i < edges ; i++){
                String parts = br.readLine();
                int v1 = Integer.parseInt(parts.split(" ")[0]);
                int v2 = Integer.parseInt(parts.split(" ")[1]);
                int wt = Integer.parseInt(parts.split(" ")[2]);

                graph[v1].add(new Edge (v1 , v2 , wt));
                graph[v2].add(new Edge (v2 , v1 , wt));
            }

            int src = Integer.parseInt(br.readLine());

            HashSet<Integer> visited = new HashSet<>();
            hamiltonian (graph , src , visited , src+" " , src);
    }

    public static void hamiltonian (ArrayList<Edge> []graph , int src , HashSet<Integer> visited , String psf , int osrc){
        if (visited.size() == graph.length-1){
            System.out.print(psf);
            boolean closingEdgeFound = false;
            for(Edge e : graph[src]){
                if (e.nbr == osrc){
                    closingEdgeFound = true;
                    break;
                }
            }

            if (closingEdgeFound == true){
                System.out.println("*");
            }else{
                System.out.println(".");
            }
            return;
        }
        visited.add(src);
        for(Edge e : graph[src]){
            if (visited.contains(e.nbr) == false){
                hamiltonian (graph , e.nbr , visited , psf + e.nbr + " " , osrc);
            }
        }
        visited.remove(src);
    }
}