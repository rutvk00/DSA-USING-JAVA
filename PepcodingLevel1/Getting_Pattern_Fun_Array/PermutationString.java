package PepcodingLevel1.Getting_Pattern_Fun_Array;// Print all permutation of Given String
// https://www.youtube.com/watch?v=39SKIuA-ieY&list=PL-Jc9J83PIiFIKbdCKuYwsV8KaX-jHe0V&index=9

import java.util.*;
import java.io.*;

class PermutationString
{

    public static void permutation (String str)
    {
        int n = str.length();
        int f = Factorial(n);

        for (int i = 0 ; i<f ; i++)
        {
            int temp = i ;
            StringBuilder sb = new StringBuilder(str);

            for (int div = n ; div >=1 ; div--)
            {
                int q = temp / n ;
                int r = temp  % n;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp = q;
            }
            System.out.println();
        }
    }
    public static int Factorial (int n)
    {
        int val = 1;
        for (int i = 1 ; i<= n; i++)
        {
            val *= i;
        }
            return val;
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        String str = scn.next();
        permutation (str);
    }
}