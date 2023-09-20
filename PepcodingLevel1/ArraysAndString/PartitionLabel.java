// https://www.youtube.com/watch?v=_I9di3CUOx4&list=PL-Jc9J83PIiE-TR27GB7V5TBLQRT5RnSl&index=11
package PepcodingLevel1.ArraysAndString;
import java.util.*;
import java.io.*;
public class PartitionLabel {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        String s = scn.next();

        List<Integer> res = getPartition (s);
        System.out.println(res);
    }

    public static List<Integer> getPartition (String s){
        HashMap<Character , Integer> map = new HashMap<>();
        for (int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            map.put(ch , i);
        }
        List<Integer> res = new ArrayList<>();
        int max = 0;
        int prev = -1;
        for (int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            max = Math.max (max , map.get(ch));

            if (max == i){
               res.add(max - prev);
               prev = max;
            }
        }
        return res;
    }
}
