// https://www.youtube.com/watch?v=FRG2YlZdmPE&list=PL-Jc9J83PIiE-TR27GB7V5TBLQRT5RnSl&index=11
package PepcodingLevel1.ArraysAndString;
import java.util.*;
import java.io.*;
public class PartitionArray {

    public static void main(String[] args) throws Exception{

        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }

        int len = getPartition (arr);
        System.out.println(len);
    }

    public static int getPartition (int []arr){
        int n = arr.length;

        int []rightMin = new int[n+1];
        rightMin[n] = Integer.MAX_VALUE;
        for(int i = n-1 ; i >= 0 ; i-- ){
            rightMin[i] = Math.min(rightMin[i+1] , arr[i]);
        }

        int leftMax = Integer.MIN_VALUE;
        int len = 0;
        for(int i = 0 ; i < n ; i++){
            leftMax = Math.max (leftMax , arr[i]);
            if (leftMax <= rightMin[i+1]){
                len = i+1;
                break;
            }
        }
        return len;
    }
}


//8
//10 6 9 3 12 15 10 13