package PepcodingLevel1.HashMap;
import java.util.*;
import java.io.*;

class LongestConsecutiveSequence{
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int []a1 = new int[n];
        for (int i = 0 ; i < n ; i++){
            a1[i] = scn.nextInt();
        }

        HashMap<Integer , Boolean> fmap = new HashMap<>();

        for (int val : a1){
            fmap.put (val , true);
        }

        for (int val : a1){
            if (fmap.containsKey (val-1)){
                fmap.put(val , false);
            }
        }

        int msl = 0;
        int msv = 0;

        for (int val : a1){
            if (fmap.get(val) == true){
                int tl = 1;
                int tv = val;

                while (fmap.containsKey(tv + tl)){
                    tl++;
                }
                if (msl < tl){
                    msl = tl;
                    msv = val;
                }
            }
        }

        for(int i = 0 ; i< msl ; i++){
            System.out.println(msv + i );
        }
    }
}