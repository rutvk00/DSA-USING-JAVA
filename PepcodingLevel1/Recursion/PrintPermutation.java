// print all permutation of given string
//https://www.youtube.com/watch?v=sPAT_DbvDj0&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=43

package PepcodingLevel1.Recursion;
import java.util.*;
import java.io.*;

class PrintPermutation
{
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner (System.in);
        String str = scn.next();

        printPermutation (str , "");
    }

    public static void printPermutation (String str , String ans)
    {
        if (str.length() == 0)
        {
            System.out.println(ans);
            return;
        }

        for (int i = 0 ; i<str.length() ; i++)
        {
            char ch = str.charAt(i);
            String new_L = str.substring (0 , i);
            String new_R = str.substring (i+1);
            String new_str = new_L + new_R ;

            printPermutation (new_str , ans + ch);
        }
    }
}