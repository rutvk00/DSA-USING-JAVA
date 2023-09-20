// https://www.youtube.com/watch?v=nTzB6L8gJts&list=PL-Jc9J83PIiE-TR27GB7V5TBLQRT5RnSl&index=12
package PepcodingLevel1.ArraysAndString;
import java.util.*;
import java.io.*;
public class PartitionArray2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }

        int len = getPartition (arr);
        System.out.println(len);
    }

    public static int getPartition (int []arr){
        int n = arr.length;
        int leftMax = arr[0];
        int greater = arr[0];
        int len = 0;

        for (int i = 0 ; i < n ; i++){
            if (greater < arr[i]){
                greater = arr[i];
            }else if (leftMax > arr[i]){
                len = i;
                leftMax = greater;
            }
        }
        return (len+1) ;
    }
}

//8
//10 6 9 3 12 15 10 13