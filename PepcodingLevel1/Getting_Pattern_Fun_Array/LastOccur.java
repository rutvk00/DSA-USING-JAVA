package PepcodingLevel1.Getting_Pattern_Fun_Array;// Print last occurance of given element in the array
//https://www.youtube.com/watch?v=xttMLI4Kb3k&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=22

import java.io.*;
import java.util.*;

class LasttOccur
{
    public static int last_occur (int arr[] , int i , int x)
    {
        if (i < 0) return -1 ;
        else if (arr[i] == x) return i ;
        else  return last_occur (arr , i-1 , x);
    }

    public static void main(String[] args)  throws Exception{
        Scanner scn = new Scanner (System.in) ;
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0 ; i< arr.length ; i++)
        {
            arr[i] = scn.nextInt();
        }

        int x = scn.nextInt();
        int last_occur = last_occur (arr , arr.length-1 , x);
        System.out.println (last_occur);
    }
}