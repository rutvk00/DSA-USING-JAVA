package PepcodingLevel1.Getting_Pattern_Fun_Array;// Getting_Pattern_Fun_Array.Pattern17 : https://www.youtube.com/watch?v=MhXDyhmClMg&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=68

import java.util.*;
class Pattern17
{
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();

        int spc = n/2;
        int str = 1;

        for (int i = 1 ; i<=n ; i++)
        {
            if (i == (n+1)/2)
            {
                for (int j = 1 ; j<=spc ; j++)
                {
                    System.out.print("*\t");
                }
            }
            else {
                for (int j = 1; j <= spc; j++) {
                    System.out.print("\t");
                }
            }


            for (int j = 1 ; j<=str ; j++)
            {
                System.out.print("*\t");
            }

            if (i<=n/2)
            {
                str++;
            }
            else {
                str--;
            }
            System.out.println();
        }

    }
}