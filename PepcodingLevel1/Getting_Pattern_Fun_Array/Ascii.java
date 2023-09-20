package PepcodingLevel1.Getting_Pattern_Fun_Array;// insert ASCII value different between two characters --- acda --- a2c1d-3a
//https://www.youtube.com/watch?v=PHtNm0B9Ig4&list=PL-Jc9J83PIiFIKbdCKuYwsV8KaX-jHe0V&index=8

import java.util.*;
import java.io.*;

class Ascii
{
    public static String asciiValue (String str)
    {
        StringBuilder sb = new StringBuilder ();
        sb.append(str.charAt(0));

        for (int i = 1 ; i< str.length() ; i++ )
        {
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            int gap = curr-prev;
            sb.append (gap);
            sb.append (curr);
        }

        return sb.toString() ;
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        String str = scn.next();
        System.out.println (asciiValue(str));
    }
}