// https://www.youtube.com/watch?v=XZueXHOhO5E
package PepcodingLevel1.ArraysAndString;
import java.util.*;
import java.io.*;
public class MaxChunkToSorted {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int []arr = new int[n];

        for (int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }

        int maxChunk = getMaxChunk (arr);
        System.out.println(maxChunk);
    }

    public static int getMaxChunk(int []arr){
        int maxChunk = 0;
        int chunks = 0;
        for (int i = 0 ; i < arr.length ; i++){
            maxChunk = Math.max (maxChunk , arr[i]);
            if (maxChunk == i){
                chunks++;
            }
        }
        return chunks;
    }
}
