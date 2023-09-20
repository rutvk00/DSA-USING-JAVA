//https://www.youtube.com/watch?v=u3A64HQq_Dw&list=PL-Jc9J83PIiE-TR27GB7V5TBLQRT5RnSl&index=4

package PepcodingLevel1.ArraysAndString;
import java.util.*;
import java.io.*;

public class SquareOfSortedArray {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int []arr = new int[n];

        for (int i = 0 ; i< n ; i++){
            arr[i] = scn.nextInt();
        }

        int []result = getSquaredArray (arr);
        System.out.println(Arrays.toString(result));
    }

    public static int [] getSquaredArray(int []arr){
        int n = arr.length;
        int result [] = new int [n];
        int i = 0 ;
        int j = n-1;
        int idx = n-1;
        while (i <= j){
            int val1 = arr[i] * arr[i];
            int val2 = arr[j] * arr[j];

            if (val1 > val2){
                result[idx] = val1;
                i++;
            }else{
                result[idx] = val2;
                j--;
            }
            idx --;
        }
        return result;
    }
}
