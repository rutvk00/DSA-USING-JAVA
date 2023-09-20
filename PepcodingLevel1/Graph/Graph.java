package PepcodingLevel1.Graph;
import java.util.*;
import java.io.*;

public class Graph {
    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt){
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }
    static class Pair implements Comparable<Pair> {
        int wsf;
        String psf;

        Pair(int wsf, String psf){
            this.wsf = wsf;
            this.psf = psf;
        }

        public int compareTo(Pair o){
            return this.wsf - o.wsf;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for(int i = 0; i < vtces; i++){
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for(int i = 0; i < edges; i++){
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }
        int src = Integer.parseInt(br.readLine());
        int dest = Integer.parseInt(br.readLine());
        int criteria = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        boolean visited[] = new boolean[vtces];
//        boolean path = hasPath (graph , src ,dest , visited );
//        System.out.println(src +"--->"+ dest +" Path exist ? : "+ path);
//        printAllPath (graph , src , dest , visited , src + " ");

        multisolver(graph, src, dest, visited, criteria, k, src + "", 0);

        System.out.println("Smallest Path = " + spath + "@" + spathwt);
        System.out.println("Largest Path = " + lpath + "@" + lpathwt);
        System.out.println("Just Larger Path than " + criteria + " = " + cpath + "@" + cpathwt);
        System.out.println("Just Smaller Path than " + criteria + " = " + fpath + "@" + fpathwt);
        System.out.println(k + "th largest path = " + pq.peek().psf + "@" + pq.peek().wsf);
    }

    public static boolean hasPath (ArrayList<Edge> [] graph , int src , int dest , boolean[] visited){
        if (src == dest){
            return true;
        }
        visited[src] = true;
        for (Edge edge : graph[src]){
            if (visited[edge.nbr] == false){
                boolean hasNbrPath = hasPath (graph , edge.nbr , dest , visited);
                if (hasNbrPath == true){
                    return true;
                }
            }
        }
        return false;
    }
    public static void printAllPath(ArrayList<Edge> [] graph , int src , int dest , boolean visited[] , String psf){
        if (src == dest){
            System.out.println(psf);
            return;
        }
        visited[src] = true;
        for(Edge edge : graph[src]){
            if (visited[edge.nbr] == false){
                printAllPath(graph , edge.nbr , dest , visited , psf + edge.nbr + " ");
            }
        }
        visited[src] = false;
    }

    static String spath;
    static Integer spathwt = Integer.MAX_VALUE;
    static String lpath;
    static Integer lpathwt = Integer.MIN_VALUE;
    static String cpath;
    static Integer cpathwt = Integer.MAX_VALUE;
    static String fpath;
    static Integer fpathwt = Integer.MIN_VALUE;
    static PriorityQueue<Pair> pq = new PriorityQueue<>();
    public static void multisolver(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited, int criteria, int k, String psf, int wsf) {
            if (src == dest){
                if (wsf < spathwt){
                    spathwt  = wsf;
                    spath = psf;
                }
                if (wsf > lpathwt){
                    lpathwt  = wsf;
                    lpath = psf;
                }
                if (wsf > criteria && wsf < cpathwt){
                    cpathwt  = wsf;
                    cpath = psf;
                }

                if (wsf < criteria && wsf > cpathwt){
                    fpathwt  = wsf;
                    fpath = psf;
                }

                if (pq.size() < k){
                    pq.add (new Pair (wsf , psf));
                }else {
                    if (wsf > pq.peek().wsf)
                        pq.remove();
                    pq.add (new Pair (wsf , psf));
                }
            }

            visited[src] = true;
            for (Edge edge : graph[src]){
                if (visited[edge.nbr] == false){
                    multisolver(graph, edge.nbr, dest, visited, criteria, k, psf + edge.nbr + " ", wsf + edge.wt);
                }
            }

            visited[src] = true;
    }
}





/*
7
8
0 1 10
1 2 10
2 3 10
0 3 10
3 4 10
4 5 10
5 6 10
4 6 10
0
6
 */