// store all subsequence of given string in ArrayList
//https://www.youtube.com/watch?v=Sa5PmCFF_zI&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=25
package PepcodingLevel1.Recursion;
import java.util.*;

class Subsequence
{
    public static ArrayList<String> getSubsequence (String str)
    {
        if (str.length() == 0)
        {
            ArrayList<String> base = new ArrayList<String> ();
            base.add("");
            return base;
        }
        char ch = str.charAt(0);
        String new_str = str.substring(1);
        ArrayList<String> temp = getSubsequence(new_str);

        ArrayList<String> result  = new ArrayList<String>();

        for (String ss : temp)
        {
            result.add ("" + ss);
            result.add (ch + ss);
        }
        return result ;
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        String str = scn.next();
        ArrayList<String> subsequences = getSubsequence(str);
        System.out.println (subsequences) ;
    }
}