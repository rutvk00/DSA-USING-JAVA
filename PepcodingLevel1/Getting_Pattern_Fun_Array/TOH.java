package PepcodingLevel1.Getting_Pattern_Fun_Array;// Tower of honoi
//youtube.com/watch?v=QDBrZFROuA0&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=12

import java.util.*;
import java.io.*;

class TOH
{
    public static void T_O_H (int n , int T1 ,int T2 ,int T3)
    {
        if (n == 0) return;

        T_O_H (n-1 , T1 , T3 , T2);
        System.out.println (n + "[" +T1 + "-->" + T2 +"]3");
        T_O_H (n-1 , T3 , T2 , T1);

    }


    public static void main(String[] args)  throws Exception{
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int T1 = scn.nextInt();
        int T2 = scn.nextInt();
        int T3 = scn.nextInt();

        T_O_H (n , T1,T2,T3);
    }
}