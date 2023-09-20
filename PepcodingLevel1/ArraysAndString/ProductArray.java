//https://www.youtube.com/watch?v=UBkpyXgx0g0&list=PL-Jc9J83PIiE-TR27GB7V5TBLQRT5RnSl&index=9
package PepcodingLevel1.ArraysAndString;
import java.util.*;
import java.io.*;
public class ProductArray {
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for (int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }

        int []res = productArray (arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] productArray (int []arr){
        int n = arr.length;
        int res[] = new int[n];
        int []right = new int[n];

        right[n-1] = arr[n-1];
        for (int i = n-2 ; i>=0 ; i--){
            right[i] = arr[i] * right[i+1];
        }
        int left = 1;
        for (int i = 0 ; i < n ; i++){
            if (i == n-1){
                res[i] = left;
            }else {
                res[i] = left * right[i + 1];
                left *= arr[i];
            }
        }
        return res;
    }
}
