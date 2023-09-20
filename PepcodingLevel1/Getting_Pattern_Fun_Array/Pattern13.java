package PepcodingLevel1.Getting_Pattern_Fun_Array;// pttern-13 : https://www.youtube.com/watch?v=8Cyb3X5j1Rw&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=60

import java.util.*;
class Pattern13
{
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        for (int i = 0 ;i<n ; i++)
        {
            int icj = 1;
            for (int j = 0 ; j<=i ; j++)
            {
                System.out.print(icj + "\t");
                int icjp1 = icj * (i-j)/(j+1) ;
                icj = icjp1;
            }
            System.out.println();
        }
    }
}