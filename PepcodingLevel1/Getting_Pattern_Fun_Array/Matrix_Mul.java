package PepcodingLevel1.Getting_Pattern_Fun_Array;// matrix m1 -- n1 * n2 and matrix m2 -- n2 * n3  resultant matrix -- matrix R -- n1 * n3
//https://www.youtube.com/watch?v=0dGuTLr6xT4&list=PL-Jc9J83PIiFkOETg2Ybq-FMuJjkZSGeH&index=3

import java.util.*;
import java.io.*;

class Matrix_Mul
{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int r1 = scn.nextInt();
        int c1 = scn.nextInt();
        int one[][] = new int[r1][c1];
        for (int i = 0 ; i< one.length ; i++)
        {
            for (int j = 0 ; j< one[0].length ; j++)
            {
                one[i][j] = scn.nextInt();
            }
        }
        int r2 = scn.nextInt();
        int c2 = scn.nextInt();
        int [][] two = new int[r2][c2];
        for (int i = 0 ; i< two.length ; i++)
        {
            for (int j = 0 ; j< two[0].length ; j++)
            {
                two[i][j] = scn.nextInt();
            }
        }

        if (c1 != r2)
        {
            System.out.println ("Invalid Input");
            return ;
        }

        int product[][] = new int[r1][c2];
        for (int i = 0 ; i < product.length ; i++)
        {
            for (int j = 0 ; j < product[0].length ; j++)
            {
                int sum = 0;
                for (int k = 0 ; k < one[0].length ; k++)
                {
                    sum += one[i][k] * two[k][j];
                }
                product[i][j] = sum ;
            }
        }

        for (int i = 0 ; i < product.length ; i++)
        {
            for (int j = 0 ; j < product[0].length ; j++)
            {
                System.out.print (product[i][j] +" ");
            }
            System.out.println();
        }


    }
}