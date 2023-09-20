package PepcodingLevel1.HashMap;
import java.util.*;
import java.io.*;

class GetCommonEle2{
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int []a1 = new int [n];
        for (int i=0 ; i < n ; i++){
            a1[i] = scn.nextInt();
        }

        int m = scn.nextInt();
        int []a2 = new int [m];
        for (int i=0 ; i < m ; i++){
            a2[i] = scn.nextInt();
        }

        HashMap<Integer , Integer> fmap = new HashMap<>();

        for (int val : a1){
            if (fmap.containsKey(val)){
                int of = fmap.get(val);
                int nf = of + 1;
                fmap.put(val , nf);
            }else{
                fmap.put(val , 1);
            }
        }

        for (int val : a2){
            if (fmap.containsKey(val)){
                System.out.println(val);
                int of = fmap.get(val);
                int nf = of-1;
                if (nf == 0){
                    fmap.remove(val);
                }else{
                    fmap.put(val, nf);
                }
            }
        }
    }
}

