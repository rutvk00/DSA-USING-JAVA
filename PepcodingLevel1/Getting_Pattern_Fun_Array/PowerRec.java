package PepcodingLevel1.Getting_Pattern_Fun_Array;// Recursive algorithm for calculate power in logN times
//https://www.youtube.com/watch?v=O84uumjBOMY&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=9

import java.util.*;
import java.io.*;

class PowerRec
{
    public static int power (int x , int n)
    {
        if (n == 0) return 1 ;

        int xpnb2 = power (x , n/2) ;

        int xn = xpnb2 * xpnb2 ;

        if (n % 2 == 1)
        {
            xn = x * xn;
        }

        return xn;
    }


    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int xn = power (x , n);
        System.out.println (xn);
    }
}