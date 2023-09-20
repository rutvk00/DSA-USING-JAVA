//https://www.youtube.com/watch?v=GxTo3agdnjs
package PepcodingLevel1.ArraysAndString;
import java.util.*;
import java.io.*;
public class MaxChunkToSortedArray2 {

    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }

        int chunks = getChunks (arr);
        System.out.println(chunks);
    }

    public static int getChunks (int []arr){
        int n = arr.length;
        int []right = new int[n+1];
        right[n] = Integer.MAX_VALUE;
        for (int i = n-1 ; i>=0 ; i--){
            right[i] = Math.min (arr[i] , right[i+1]);
        }

        int left = Integer.MIN_VALUE;
        int chunks = 0;
        for (int i = 0 ; i < n ; i++){
            left = Math.max (left , arr[i]);
            if (left <= right[i+1]){
                chunks ++;
            }
        }
        return chunks;
    }
}
