package PepcodingLevel1.Getting_Pattern_Fun_Array;// Getting_Pattern_Fun_Array.Pattern16 : https://www.youtube.com/watch?v=qcQyMI1OSyg&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=66

import java.util.*;
class Pattern16
{
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();

        int str = 1 ;
        int spc = 2*n-3;

        for (int i = 1 ; i<=n ; i++)
        {
            int val = 1 ;
            for (int j = 1 ; j<=str ; j++)
            {
                System.out.print(val + "\t");
                val++;
            }
            for (int j = 1 ; j<=spc ; j++)
            {
                System.out.print("\t");
            }
            if(i == n)
            {
                str--;
                val--;
            }
            for (int j = 1; j <= str; j++)
            {
                    val--;
                    System.out.print(val +"\t");
            }

            str++;
            spc-=2;
            System.out.println();
        }

    }
}
