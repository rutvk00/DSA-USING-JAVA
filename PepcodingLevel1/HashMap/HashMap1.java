package PepcodingLevel1.HashMap;
import java.util.*;
import java.io.*;


class HashMap1{
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        String str = scn.nextLine();

        HashMap<Character , Integer> hm = new HashMap<>();
        for (int i = 0; i< str.length() ; i++){
            char ch = str.charAt(i);
            if (hm.containsKey(ch)){
                int of = hm.get(ch);
                int nf = of + 1;
                hm.put(ch , nf);
            }else{
                hm.put(ch , 1);
            }
        }

        char mfc = str.charAt(0);
        for (Character ch : hm.keySet()){
            if (hm.get(ch) > hm.get(mfc)){
                mfc = ch;
            }
        }
        System.out.println(mfc +" ---> "+ hm.get(mfc));
    }
}