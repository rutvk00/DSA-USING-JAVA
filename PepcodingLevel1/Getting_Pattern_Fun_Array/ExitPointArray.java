package PepcodingLevel1.Getting_Pattern_Fun_Array;//https://www.youtube.com/watch?v=FUBlb360kqU&list=PL-Jc9J83PIiFkOETg2Ybq-FMuJjkZSGeH&index=9

import java.util.*;
import java.io.*;

class ExitPointArray
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

        int i = 0 ;
        int j = 0 ;
        int dir = 0 ;

        while (true)                            // 0 -E , 1-S , 2 - W , 3 - N
        {
            dir =  ( dir + arr[i][j]) % 4;
            if (dir == 0)
            {
                j++;
            }
            else if (dir == 1)
            {
                i++;
            }
            else if (dir == 2)
            {
                j--;
            }
            else {
                i--;
            }

            if (i == -1)
            {
                i++;
                break;
            }
            else if (j == -1)
            {
                j++;
                break;
            }
            else if (i == arr.length)
            {
                i--;
                break;
            }
            else if (j == arr[0].length){
                j--;
                break;
            }
        }

        System.out.println (i);
        System.out.println (j);
    }
}