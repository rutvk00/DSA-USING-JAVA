package PepcodingLevel1.ArraysAndString;
import java.util.*;
import java.io.*;

public class Rearrange {

    public static void main(String[] args) throws Exception{
        int []arr = {1 , 2 , 3 , 4  , 1 , 2 , 3 , 4};

        HashMap<Integer , Integer> map = new HashMap<>();

        for (int i = 0 ; i < arr.length ; i++){

            if (map.containsKey(arr[i])){
                int old = map.get(arr[i]);
                old +=1;
                map.put (arr[i] , old);
            }else{
                map.put(arr[i], 1);
            }
        }
        boolean flag = true;
        for (int val : map.keySet()){
            int freq = map.get(val);
            if (freq != 2){
                System.out.println("NO");
                flag = false;
                break;
            }
        }
        if (flag == true){
            System.out.println("Yes");
        }

    }
}
