//https://www.youtube.com/watch?v=3fjt19bjs3A&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=27
//Mobile Phone keypad combination


package PepcodingLevel1.Recursion;
import java.util.*;

class KeypadCombo
{
    static String[] codes = {".;" , "abc" , "def", "ghi" , "jkl" , "mno" , "pqrs" , "tu" , "vwx" , "yz"};
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        String str = scn.next();
        ArrayList<String> words = getKPC (str);
        System.out.println(words);
    }

    public static ArrayList<String> getKPC (String str)
    {
        if (str.length() == 0)
        {
            ArrayList<String> base = new ArrayList<String> ();
            base.add ("");
            return base;
        }

        char ch = str.charAt(0);
        String new_str = str.substring (1);
        ArrayList<String> temp = getKPC (new_str);

        ArrayList<String> result = new ArrayList<String> ();

        String codeforch = codes[ch - '0'];

        for (int i = 0 ; i < codeforch.length() ; i++)
        {
            char chcode = codeforch.charAt(i);

            for (String temp_str : temp)
            {
                result.add (chcode + temp_str);
            }
        }
        return result;
    }
}