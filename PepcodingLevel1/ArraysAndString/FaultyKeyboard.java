// https://www.youtube.com/watch?v=738Dy3D-q-E&list=PL-Jc9J83PIiE-TR27GB7V5TBLQRT5RnSl

package PepcodingLevel1.ArraysAndString;

import java.util.*;
import java.io.*;

class FaultyKeyboard{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);

        String name = scn.next();
        String typed = scn.next();

        boolean result = isPossible (name , typed);
        System.out.println(result);
    }

    public static boolean isPossible (String name , String typed){

        if (name.length() > typed.length()){
            return false;
        }

        int i = 0;
        int j = 0;
        while (i < name.length() && j < typed.length()){

            if (name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            }else if (name.charAt(i-1) == typed.charAt(j)){
                j++;
            }else{
                return false;
            }
        }

        while (j < typed.length()){
            if (name.charAt(i-1) != typed.charAt(j)){
                return false;
            }
            j++;
        }
        return i < name.length() ?false :true ;
    }
}