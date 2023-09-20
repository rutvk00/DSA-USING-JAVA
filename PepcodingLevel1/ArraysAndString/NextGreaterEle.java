// https://www.youtube.com/watch?v=eAfJJyaAmes&list=PL-Jc9J83PIiE-TR27GB7V5TBLQRT5RnSl&index=8
package PepcodingLevel1.ArraysAndString;
import java.util.*;
import java.io.*;
public class NextGreaterEle {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        String num = scn.next();
        String res = getNextGreater (num);
        System.out.println(res);
    }

    public static String getNextGreater(String num){
        char []arr = num.toCharArray();
        int i = arr.length-2;

        while(i >=0 && arr[i] >= arr[i+1]){
            i--;
        }

        if (i == -1){
            return "-1";
        }

        int j = arr.length-1;
        while (arr[i] >= arr[j]){
            j--;
        }

        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp ;
        String res = "";
        for (int k = 0 ; k <= i ; k++){
            res += arr[k] ;
        }

        for (int k = arr.length-1 ; k>i ; k--){
            res += arr[k];
        }
        return res;
    }
}
