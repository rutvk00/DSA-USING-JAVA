//https://www.youtube.com/watch?v=1QybAZMCYhA&list=PL-Jc9J83PIiE-TR27GB7V5TBLQRT5RnSl&index=6
package PepcodingLevel1.ArraysAndString;
import java.util.*;
import java.io.*;
public class MajorityEle2 {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int []arr = new int[n];

        for (int i = 0 ; i < n; i++){
            arr[i] = scn.nextInt();
        }

        ArrayList<Integer> res = majorityEle (arr);
        System.out.println(res);
    }

    public static ArrayList<Integer> majorityEle (int []arr){
        int count1 = 1;
        int val1 = arr[0];
        int count2 = 0;
        int val2 = arr[0];

        int i = 1;
        while ( i < arr.length){
            if (arr[i] == val1){
                count1++;
            }else if (arr[i] == val2){
                count2++;
            }else{
                if (count1 == 0){
                    val1 = arr[i];
                    count1 = 1;
                }else if (count2 == 0){
                    val2 = arr[i];
                    count2 = 1;
                }else{
                    count1--;
                    count2--;
                }
            }
            i++;
        }

        ArrayList<Integer> res = new ArrayList<>();

        if (isValid (arr , val1) == true){
            res.add(val1);
        }

        if (val2 != val1 && isValid (arr , val2) == true){
            res.add (val2);
        }

        return res;
    }

    public static boolean isValid (int []arr , int val){
       int count = 0;
        for (int ele : arr){
            if (val == ele){
                count++;
            }
        }
        return count > arr.length/3 ;
    }
}
