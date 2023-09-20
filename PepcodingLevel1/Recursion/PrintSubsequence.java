//https://www.youtube.com/watch?v=Ke8TPhHdHMw&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=34

package PepcodingLevel1.Recursion;
import java.util.*;
import java.io.*;

class PrintSubsequence
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        String str = scn.next();

        printSubsequence (str , "");
    }

    public static void printSubsequence (String str , String ans)
    {
        if (str.length() == 0)
        {
            System.out.println (ans);
            return ;
        }
        char ch = str.charAt(0);
        String new_str = str.substring (1);
        printSubsequence (new_str , ans +"");
        printSubsequence (new_str , ans + ch);
    }
}