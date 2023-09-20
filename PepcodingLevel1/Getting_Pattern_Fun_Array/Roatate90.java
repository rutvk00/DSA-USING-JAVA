package PepcodingLevel1.Getting_Pattern_Fun_Array;// Rotate 90 degree right side
// https://www.youtube.com/watch?v=SoxrXQbhCPI&list=PL-Jc9J83PIiFkOETg2Ybq-FMuJjkZSGeH&index=11

import java.util.*;
import java.io.*;

class Rotate90
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int arr[][] = new int[r][c];

        for (int i = 0 ; i < arr.length ; i++)
        {
            for (int j = 0 ; j < arr[0].length ; j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }

        for (int i = 0 ; i < arr.length ; i++)
        {
            for (int j = i ; j < arr[0].length ; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp ;
            }
        }

        for (int i = 0 ; i < arr.length ; i++)
        {
            int li = 0;
            int ri = arr[0].length - 1;

            while (li < ri)
            {
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;

                li++ ;
                ri--;
            }
        }

        for (int i = 0 ; i < arr.length ; i++)
        {
            for (int j = 0 ; j < arr[0].length ; j++)
            {
                System.out.print (arr[i][j] + " ");
            }
        }
    }
}