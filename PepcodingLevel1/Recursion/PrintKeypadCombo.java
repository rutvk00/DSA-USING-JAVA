// https://www.youtube.com/watch?v=4yMtvToiJE0&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=35

package PepcodingLevel1.Recursion;
import java.util.*;
import java.io.*;

class PrintKeypadCombo
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        String str = scn.next();
        printKPC (str , "");
    }

    static String[] codes = {".;", "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tu" , "vwx" , "yz" };
    public static void printKPC (String str , String ans)
    {

        if (str.length() == 0)
        {
            System.out.println (ans);
            return;
        }
        char ch = str.charAt (0);
        String new_str = str.substring (1);
        String codeforch = codes[ch - '0'];

        for (int i = 0 ; i<codeforch.length() ; i++)
        {
            printKPC (new_str , ans + codeforch.charAt(i));
        }
    }
}