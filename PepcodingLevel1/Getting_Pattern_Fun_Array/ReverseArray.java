package PepcodingLevel1.Getting_Pattern_Fun_Array;//Reverse the given array
//https://www.youtube.com/watch?v=ZictKDbUWak&list=PL-Jc9J83PIiHOV7lm2uSw4ZiVsIRsGS6r&index=31

import java.util.*;
import java.io.*;

class ReverseArray
{
    public static void Reverse_Array (int[] arr , int n)
    {
        int i = 0 ;
        int j = arr.length-1;

        while (i<=j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp ;
            i++;
            j--;
        }
    }

    public static void Display (int[] arr  , int n)
    {
        for (int i = 0 ; i<arr.length ; i++)
        {
            System.out.print (arr[i] +" ");
        }

    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int arr[] = new int [n];
        for (int i = 0 ; i<arr.length ; i++)
        {
            arr[i] = scn.nextInt();
        }
        Reverse_Array (arr , n);
        Display (arr , n );
    }
}