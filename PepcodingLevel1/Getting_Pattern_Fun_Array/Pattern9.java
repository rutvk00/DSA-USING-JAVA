package PepcodingLevel1.Getting_Pattern_Fun_Array;// Getting_Pattern_Fun_Array.Pattern9 :   https://www.youtube.com/watch?v=Ul2CgihEzp0&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=52

import java.util.*;

class Pattern9
{
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n  = scn.nextInt();

        for (int i = 1 ; i<= n ; i++)
        {
            for (int j = 1 ; j<=n ; j++)
            {
                if ((i == j) || (i+j == n+1))
                {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}