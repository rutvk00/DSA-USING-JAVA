//youtube.com/watch?v=qUDp8IUbZto&list=PL-Jc9J83PIiE-TR27GB7V5TBLQRT5RnSl&index=3
package PepcodingLevel1.ArraysAndString;
import java.util.*;
import java.io.*;

public class MaxWater {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int []arr = new int[n];

        for (int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }

        int result = getMaxWater (arr);
        System.out.println(result);
    }

    public static int getMaxWater(int []arr){
        int i = 0;
        int j = arr.length-1;
        int water = 0;
        while (i < j){
           int width = j - i;
           int height = Math.min (arr[i] , arr[j]);

           water = Math.max (water , width * height);

           if( arr[i] > arr[j]){
               j--;
           }else{
               i++;
           }
        }
        return water;
    }
}
