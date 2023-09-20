package PepcodingLevel1.Getting_Pattern_Fun_Array;// Togle the case of character of given string
// abCdE == ABcDe
// https://www.youtube.com/watch?v=VQnWqpHpKnE&list=PL-Jc9J83PIiFIKbdCKuYwsV8KaX-jHe0V&index=7

import java.util.*;
import java.io.*;

class ToggleCase
{
    public static String toggleCase (String str)
    {
        StringBuilder sb = new StringBuilder (str) ;

        for (int i = 0 ; i < sb.length() ; i++)
        {
            char ch = sb.charAt(i);

            if (ch >= 'a' && ch <= 'z')
            {
                char upper = (char)('A' + ch - 'a');
                sb.setCharAt (i , upper);
            }
            else if (ch >= 'A' && ch <= 'Z')
            {
                char lower = (char)('a' + ch - 'A');
                sb.setCharAt (i , lower);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in) ;
        String str = scn.next();
        System.out.println (toggleCase (str));
    }
}