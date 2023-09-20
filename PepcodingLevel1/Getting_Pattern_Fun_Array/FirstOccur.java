package PepcodingLevel1.Getting_Pattern_Fun_Array;// print first occurance of given Element in the array
//https://www.youtube.com/watch?v=TU0xUG9eO3Y&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=20

import java.io.*;
import java.util.*;

class FirstOccur
{
    public static int first_occur (int arr[] , int i , int x)
    {
        if (i == arr.length) return -1 ;
        else if (arr[i] == x) return i ;
        else  return first_occur (arr , i+1 , x);
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
        int first_occur = first_occur (arr , 0 , x);
        System.out.println (first_occur);
    }
}