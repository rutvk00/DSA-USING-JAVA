package PepcodingLevel1.Getting_Pattern_Fun_Array;// given array , print a element which is minimum in row and maximum in column
//https://www.youtube.com/watch?v=xt0Og8YaON4&list=PL-Jc9J83PIiFkOETg2Ybq-FMuJjkZSGeH&index=16

import java.util.*;
import java.io.*;
class SaddlePoint {


    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int arr[][] = new int[r][c];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        for (int i=0 ; i<arr.length ; i++)
        {
            int svj = 0 ;
            for (int j = 1 ; j<arr[0].length ; j++)
            {
                if (arr[i][j] < arr[i][svj])
                {
                    svj = j;
                }
            }
            boolean flag = true ;
            for (int k = 0 ; k<arr.length ; k++)
            {
                if (arr[k][svj] > arr[i][svj])
                {
                    flag = false;
                    break;
                }
            }

            if (flag == true)
            {
                System.out.println (arr[i][svj]);
                return ;
            }
        }

        System.out.println ("There is no saddle point");
    }
}