//https://www.youtube.com/watch?v=3tbjwaGC-ng&list=PL-Jc9J83PIiE-TR27GB7V5TBLQRT5RnSl&index=5
package PepcodingLevel1.ArraysAndString;
import java.util.*;
import java.io.*;
public class MajorityEle1 {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int []arr = new int [n];

        for (int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }

        int valid_ele = getValidElement (arr);
        boolean check = checkValidity (arr , valid_ele);
        if (check){
            System.out.println(valid_ele);
        }else{
            System.out.println(-1);
        }
    }

    public static int getValidElement(int []arr){

        int count = 1 ;
        int valid_ele = arr[0];
        for (int i = 1 ; i < arr.length ; i++){
            if (valid_ele == arr[i]){
                count++;
            }else{
                count--;
                if (count == 0){
                    valid_ele = arr[i];
                }
            }
        }

        return valid_ele;
    }

    public static boolean checkValidity(int []arr , int valid_ele){
        int n = arr.length ;
        int count = 0;
        for (int i = 0 ; i < n ; i++){
            if (arr[i] == valid_ele){
                count++;
            }
        }

        if (count >= (n/2) ){
            return true;
        }else{
            return false;
        }
    }

}
