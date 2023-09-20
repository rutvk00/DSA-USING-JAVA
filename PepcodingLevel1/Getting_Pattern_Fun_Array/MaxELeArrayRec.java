package PepcodingLevel1.Getting_Pattern_Fun_Array;// Maximum element in array using recursion
//https://www.youtube.com/watch?v=XpUiZg9YZQg&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=18

import java.io.*;
import java.util.*;

class MaxEleArrayRec
{
    public static int maximum (int arr[] , int i)
    {

        if (i == arr.length)
            return -1;
        int max = maximum (arr , i+1);
        if (max > arr[i])
        {
            return max ;
        }
        else
        {
            return arr[i];
        }
    }


    public static void main(String[] args)  throws Exception{
        Scanner scn = new Scanner (System.in) ;
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0 ; i< arr.length ; i++)
        {
            arr[i] = scn.nextInt();
        }
        int max = maximum (arr , 0);
        System.out.println (max);
    }
}