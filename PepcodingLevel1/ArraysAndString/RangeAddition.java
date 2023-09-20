//https://www.youtube.com/watch?v=fBT0VKkqvtY&list=PL-Jc9J83PIiE-TR27GB7V5TBLQRT5RnSl&index=2
package PepcodingLevel1.ArraysAndString;
import java.util.*;
import java.io.*;

public class RangeAddition {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int length = scn.nextInt();

        int nq = scn.nextInt();
        int [][]queries = new int [nq][3];
        for (int i = 0 ; i < nq ; i++){
            queries[i][0] = scn.nextInt();
            queries[i][1] = scn.nextInt();
            queries[i][2] = scn.nextInt();
        }

        int []res = getModifiedArray (length , queries);
        for (int i = 0 ; i < length ; i++){
            System.out.print(res[i]+" ");
        }
    }

    public static int [] getModifiedArray (int length , int [][] queries){
        int[] res = new int[length];

        for (int i= 0 ; i < queries.length ; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            int inc = queries[i][2];

            res[start] += inc;

            if (end + 1 < length){
                res[end + 1] -= inc;
            }
        }

        int sum = 0;

        for (int i = 0 ; i < length ; i++){
            sum += res[i];
            res[i] = sum;
        }
        return res ;
    }
}
