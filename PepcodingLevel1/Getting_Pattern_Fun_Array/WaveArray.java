package PepcodingLevel1.Getting_Pattern_Fun_Array;// Print given Array in Wave form
//youtube.com/watch?v=_olQ9Rrnm_c&list=PL-Jc9J83PIiFkOETg2Ybq-FMuJjkZSGeH&index=5

import java.util.*;
import java.io.*;
class WaveArray
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int arr[][] = new int[r][c];

        for (int i = 0 ; i<arr.length ; i++)
        {
            for (int j = 0 ; j <arr[0].length ; j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }

        for (int i = 0 ; i < arr[0].length ; i++)
        {
            if (i % 2 == 0)
            {
                for (int j = 0 ; j<arr.length ; j++)
                {
                    System.out.print (arr[j][i] + " ");
                }
            }
            else
            {
                for (int j = arr.length-1 ; j>=0 ; j--)
                {
                    System.out.print (arr[j][i] + " ");
                }
            }
        }
    }
}