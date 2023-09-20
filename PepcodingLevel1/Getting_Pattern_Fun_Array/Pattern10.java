package PepcodingLevel1.Getting_Pattern_Fun_Array;// pattern10 : https://www.youtube.com/watch?v=8ccsrxrXCmk&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=54

import java.util.*;
class Pattern10
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int in_sp = -1;
        int ot_sp = n/2;
        for (int i = 1 ; i<=n ; i++)
        {
            for (int j = 1 ; j<=ot_sp ; j++)
            {
                System.out.print("\t");
            }

            System.out.print("*\t");

            for (int j = 1 ; j<=in_sp ; j++)
            {
                System.out.print("\t");
            }
            if (i>1 && i<n)
            {
                System.out.print("*\t");
            }
            if (i<= n/2)
            {
                ot_sp--;
                in_sp += 2;
            }
            else
            {
                ot_sp++;
                in_sp -= 2;
            }
            System.out.println();
        }
    }
}