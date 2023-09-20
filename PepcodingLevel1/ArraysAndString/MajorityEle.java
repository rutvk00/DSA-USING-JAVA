//youtube.com/watch?v=ChK9pQDhIrk&list=PL-Jc9J83PIiE-TR27GB7V5TBLQRT5RnSl&index=7
package PepcodingLevel1.ArraysAndString;
import java.util.*;
import java.io.*;
public class MajorityEle {
    public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner (System.in);
      int n = scn.nextInt();
      int []arr = new int[n];
      for (int i = 0 ; i < n ; i++){
          arr[i] = scn.nextInt();
      }

      int k = scn.nextInt();

      ArrayList<Integer> res = majority (arr , k);
        System.out.println(res);
    }

    public static ArrayList<Integer> majority (int []arr , int k){
        int n = arr.length;
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i = 0 ; i < arr.length ; i++){
            if (map.containsKey(arr[i]) == true){
                map.put(arr[i] , map.get(arr[i])+1);
            }else{
                map.put(arr[i] , 1);
            }
        }

        ArrayList<Integer> res = new ArrayList<>();

        for (int key : map.keySet()){
            if (map.get(key) >n/k){
                res.add(key);
            }
        }

        Collections.sort(res);
        return res;
    }
}
