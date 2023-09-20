package PepcodingLevel1.Getting_Pattern_Fun_Array;// Print given Array in spiral form
//https://www.youtube.com/watch?v=SVFXEqn3Ceo&list=PL-Jc9J83PIiFkOETg2Ybq-FMuJjkZSGeH&index=7

import java.util.*;
import java.io.*;
class SpiralArray
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
        int minr = 0 ;
        int minc = 0;
        int maxr = arr.length-1;
        int maxc = arr[0].length-1;
        int total_ele = r*c;
        int count = 0;
        while (total_ele > count)
        {
            for (int i = minr , j = minc ; i <= maxr && count < total_ele ; i++)
            {
                System.out.print (arr[i][j] + " ");
                count++;
            }
            minc++;

            for (int i = maxr , j = minc ; j <= maxc && count < total_ele ; j++)
            {
                System.out.print (arr[i][j] + " ");
                count++;
            }
            maxr--;

            for (int i = maxr , j = maxc ; i >= minr && count < total_ele ; i--)
            {
                System.out.print (arr[i][j] + " ");
                count++;
            }
            maxc--;

            for (int i = minr , j = maxc ; j >= minc && count < total_ele ; j--)
            {
                System.out.print (arr[i][j] + " "   );
                count++;
            }
            minr++;
        }
    }
}