package PepcodingLevel1.Getting_Pattern_Fun_Array;// Print all palindrome substring for given String
//https://www.youtube.com/watch?v=_jM3iMT4k7g&list=PL-Jc9J83PIiFIKbdCKuYwsV8KaX-jHe0V&index=2

import java.util.*;
import java.io.*;

class PrintAllPalindromeSubStr
{

    public static boolean isPalindrome (String str)
    {
        int i = 0;
        int j = str.length()-1;

        while (i <= j)
        {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j);
            if (ch1 != ch2)
            {
                return false;
            }
            else
            {
                i++;
                j--;
            }
        }
        return true ;
    }
    public static void solution (String str)
    {
        for (int i = 0 ; i< str.length() ; i++)
        {
            for (int j = i+1 ; j <= str.length() ; j++)
            {
                String ss = str.substring (i , j);
                if (isPalindrome (ss) == true)
                {
                    System.out.println (ss);
                }
            }
        }
    }

    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner (System.in);
        String str = scn.next();
        solution (str);
    }
}