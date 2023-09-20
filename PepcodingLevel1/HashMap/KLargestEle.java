package PepcodingLevel1.HashMap;
import java.util.*;
import java.io.*;

class KLargestEle{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        int n = Integer.parseInt(br.readLine());
        int []arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int k = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0 ; i < arr.length ; i++){
            if (i < k){
                pq.add(arr[i]);
            }else{
                if (pq.peek() < arr[i]){
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }

        while (pq.size() > 0){
            System.out.println(pq.remove());
        }
    }
}