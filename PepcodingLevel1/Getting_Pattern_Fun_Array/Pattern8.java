package PepcodingLevel1.Getting_Pattern_Fun_Array;// Getting_Pattern_Fun_Array.Pattern8 - https://www.youtube.com/watch?v=D5a13WBbee0&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=50

import java.util.*;
class Pattern8
{
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();

        for (int i = 1; i<= n ; i++)
        {
            for (int j = 1 ; j<=n ; j++)
            {
                if (i+j == n+1)
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
