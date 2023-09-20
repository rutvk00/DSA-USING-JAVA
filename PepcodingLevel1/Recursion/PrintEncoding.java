// print encoding : 123 -- > abc , lc , aw
//https://www.youtube.com/watch?v=2ClSccwnq1Y&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=45

package PepcodingLevel1.Recursion;
import java.util.*;
import java.io.*;

class PrintEncoding
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        String str = scn.next();
        printEncoding (str , "");
    }

    public static void printEncoding (String str , String ans )
    {
        if (str.length() == 0)
        {
            System.out.println(ans);
            return;
        }
        else if (str.length() == 1)
        {
            char ch = str.charAt(0);
            if (ch == '0') return ;
            else {
                int chv = ch - '0' ;
                char code = (char) ('a' + chv -1);
                System.out.println (ans + code);
            }
        }
        else
        {
            char ch = str.charAt(0);
            String new_str = str.substring(1);
            if (ch == '0') return ;
            else{
                int chv = ch - '0' ;
                char code = (char) ('a' + chv -1);
                printEncoding (new_str , ans + code);
            }

            String ch12 = str.substring (0 , 2);
            String new_str12 = str.substring (2);

            int chv = Integer.parseInt(ch12);
            if (chv <= 26) {
                char code = (char) ('a' + chv - 1);
                printEncoding(new_str12, ans + code);
            }
        }

    }
}