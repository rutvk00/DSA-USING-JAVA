package PepcodingLevel1.Getting_Pattern_Fun_Array;// Pattern19 : https://www.youtube.com/watch?v=SHaqp8vqzxg&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=72

import java.util.*;

class PAttern19
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

     for (int  i = 1 ; i<= n; i++)
     {
         for (int j = 1 ; j<=n ; j++)
         {
             if (i == 1)
             {
                if (j == n || j <= n/2+1)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
             }
             else if (i <= n/2)
             {
                 if (j == n || j == n/2+1)
                 {
                     System.out.print("*\t");
                 }
                 else
                 {
                     System.out.print("\t");
                 }
             }
             else if (i == n/2 +1)
             {
                 System.out.print("*\t");
             }
             else if (i<n)
             {
                 if (j == 1 || j == n/2+1)
                 {
                     System.out.print("*\t");
                 }
                 else
                 {
                     System.out.print("\t");
                 }
             }
             else
             {
                 if (j == 1 || j >= n/2+1)
                 {
                     System.out.print("*\t");
                 }
                 else
                 {
                     System.out.print("\t");
                 }
             }
         }
         System.out.println();
     }
    }
}