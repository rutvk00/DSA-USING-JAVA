package PepcodingLevel1.Getting_Pattern_Fun_Array;// Pattern 20 : https://www.youtube.com/watch?v=xvXhZ0k1fYo&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=74

import java.util.*;

class Pattern20
{
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();

        for (int i = 1 ; i<= n ; i++)
        {
            for (int j = 1 ;j<= n ; j++)
            {
                if(j == 1 || j == n)
                {
                    System.out.print("*\t");
                }
                else if (i> n/2 && (i == j || i+j == n+1))
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }


            }
            System.out.println();
        }
    }
}